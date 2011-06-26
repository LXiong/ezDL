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

package de.unidue.inf.is.ezdl.dlbackend.message;

import junit.framework.Assert;

import org.junit.Test;

import de.unidue.inf.is.ezdl.dlbackend.AbstractBackendTestBase;
import de.unidue.inf.is.ezdl.dlcore.message.content.LoginAsk;



public class MessageBytesCoderTest extends AbstractBackendTestBase {

    private MessageBytesCoder messageBytesCoder = MessageBytesCoder.getInstance();


    @Test
    public void testEncodeDecode() {
        Message message = new Message("from", "to", new LoginAsk("a", "b"), "reqid");
        byte[] bytes = messageBytesCoder.encode(message);

        Assert.assertNotNull(bytes);

        Message message2 = messageBytesCoder.decode(bytes);

        Assert.assertNotNull(message2);
        Assert.assertTrue(message.equals(message2));
    }

}
