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

package de.unidue.inf.is.ezdl.gframedl.tools.search.panels.queryviews;

import java.awt.GridBagConstraints;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JTextField;

import de.unidue.inf.is.ezdl.dlcore.data.fields.Field;



public class FieldInfo {

    public JLabel label;
    public String labelLocString;
    public GridBagConstraints labelConstraints;
    public JTextField textField;
    public String fieldLocString;
    public GridBagConstraints fieldConstraints;
    public Field fieldCode;
    public Icon icon;


    @Override
    public String toString() {
        return labelLocString + "(" + fieldCode.toString() + "): '" + textField.getText() + "'";
    }

}