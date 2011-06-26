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



public class AgentNameAsk implements MessageContent {

    private static final long serialVersionUID = -629715447408592975L;

    private String service;


    public AgentNameAsk(String service) {
        this.service = service;
    }


    /**
     * @return the service
     */
    public String getService() {
        return service;
    }


    /**
     * @param service
     *            the service to set
     */
    public void setService(String service) {
        this.service = service;
    }


    @Override
    public String toString() {
        return "{AgentNameAsk for " + service + "}";
    }
}
