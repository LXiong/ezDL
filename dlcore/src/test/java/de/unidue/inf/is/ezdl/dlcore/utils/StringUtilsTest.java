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

package de.unidue.inf.is.ezdl.dlcore.utils;

import org.junit.Assert;
import org.junit.Test;

import de.unidue.inf.is.ezdl.dlcore.AbstractTestBase;



public class StringUtilsTest extends AbstractTestBase {

    @Test
    public void testCompress() {
        Assert.assertEquals("eNoDAAAAAAE=", StringUtils.compress(""));
        Assert.assertEquals("eNpTUFAAAADDAGE=", StringUtils.compress("   "));
        Assert.assertEquals("eNrj5QIAACYAGA==", StringUtils.compress("\r\n"));
        Assert.assertEquals("eNpzyklUSIJgHQWPxJycfIXw1JwSRQBgeQfH", StringUtils.compress("Bla bla bla, Hallo Welt!"));
    }


    @Test
    public void testDecompress() {
        Assert.assertEquals("", StringUtils.decompress("eNoDAAAAAAE="));
        Assert.assertEquals("   ", StringUtils.decompress("eNpTUFAAAADDAGE="));
        Assert.assertEquals("\r\n", StringUtils.decompress("eNrj5QIAACYAGA=="));
        Assert.assertEquals("Bla bla bla, Hallo Welt!",
                        StringUtils.decompress("eNpzyklUSIJgHQWPxJycfIXw1JwSRQBgeQfH\r\n"));

    }


    @Test
    public void testCompressDecompress() {
        Assert.assertEquals("Bla bla bla, Hallo Welt!",
                        StringUtils.decompress(StringUtils.compress("Bla bla bla, Hallo Welt!")));

    }

}
