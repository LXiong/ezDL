/*
 * Copyright 2009-2011 Universität Duisburg-Essen, Working Group
 * "Information Engineering"
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.unidue.inf.is.ezdl.dlbackend.message.content;

import de.unidue.inf.is.ezdl.dlcore.message.content.MessageContent;



/**
 * The CancelRequestNotify message content tells an Agent to stop a certain
 * RequestHandler.
 * <p>
 * RequestHandlers in general are running long-term and blocking. They would
 * receive the cancel message only after the currently running blocking method
 * is finished if they handled the message themselves. So to stop a
 * RequestHandler, send this message content in a Message that has a fresh
 * request ID. This makes sure that the message content is not forwarded to the
 * blocking RequestHandler. Set the requestId in this message content to the ID
 * of the request whose handler you want to cancel.
 * 
 * @author mjordan
 */
public class CancelRequestNotify implements MessageContent {

    private static final long serialVersionUID = 533510534482297512L;

    /**
     * The ID of the request to cancel.
     */
    private String requestId;
    /**
     * True, if partial results are accepted.
     */
    private boolean sendPartialResults;


    /**
     * Creates a new object with the given request ID and not accepting partial
     * results.
     * 
     * @param requestId
     *            the ID of the request to cancel
     */
    public CancelRequestNotify(String requestId) {
        this(requestId, false);
    }


    /**
     * Creates a new object with the given parameters.
     * 
     * @param requestId
     *            the ID of the request to cancel
     * @param sendPartialResults
     *            true, if partial results are accepted. Else false.
     */
    public CancelRequestNotify(String requestId, boolean sendPartialResults) {
        this.requestId = requestId;
        this.sendPartialResults = sendPartialResults;
    }


    /**
     * @return the ID of the request to cancel
     */
    public String getRequestID() {
        return requestId;
    }


    /**
     * Returns if partial results should be sent.
     * 
     * @return true if partial results are to be sent. Else false.
     */
    public boolean isSendPartialResults() {
        return sendPartialResults;
    }


    @Override
    public String toString() {
        return "{Cancel " + requestId + " " + sendPartialResults + "}";
    }

}
