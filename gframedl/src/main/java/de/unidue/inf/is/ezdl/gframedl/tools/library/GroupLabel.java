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

package de.unidue.inf.is.ezdl.gframedl.tools.library;

import javax.swing.JLabel;

import de.unidue.inf.is.ezdl.dlcore.data.dldata.library.Group;



/** Represents a Grouplabel */
public class GroupLabel extends JLabel {

    private static final long serialVersionUID = -5716445643759156358L;

    Group group;


    public GroupLabel(Group group) {
        super(group.getName());
        this.group = group;
    }


    public Group getGroup() {
        return group;
    }


    /** Overwrites the attributes with the attributes of the given group */
    public void override(Group g) {
        group = g;
        this.setText(g.getName());
    }

}
