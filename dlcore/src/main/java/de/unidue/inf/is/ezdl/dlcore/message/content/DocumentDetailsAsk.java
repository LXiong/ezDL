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

package de.unidue.inf.is.ezdl.dlcore.message.content;

import java.util.List;



/**
 * @author mj
 */

public class DocumentDetailsAsk implements MessageContent {

    private static final long serialVersionUID = 7694536171900844653L;

    private List<String> oids;


    public DocumentDetailsAsk(List<String> oids) {
        this.oids = oids;
    }


    /**
     * @return the oids
     */
    public List<String> getOids() {
        return oids;
    }


    @Override
    public String toString() {
        return "{DocumentDetailsAsk " + oids.toString() + "}";
    }
}
