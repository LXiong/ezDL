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

package de.unidue.inf.is.ezdl.dlcore.data.dldata;

import java.util.Collection;



public class ReviewList extends MergeableArrayList<Review> {

    private static final long serialVersionUID = -2566230691988333620L;


    public ReviewList() {
        super();
    }


    public ReviewList(Collection<? extends Review> inputData) {
        super(inputData);
    }


    public ReviewList(MergeableList<? extends Review> inputData) {
        super(inputData);
    }

}
