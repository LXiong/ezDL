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

package de.unidue.inf.is.ezdl.gframedl.tools;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

import de.unidue.inf.is.ezdl.gframedl.ToolController;



/**
 * Is executed when a MenuItem from the Tool menu in the MenuBar is selected.
 * Opens the specified ToolView in the current Perspective.
 * 
 * @author tacke
 */
public class OpenViewAction extends AbstractAction {

    private static final long serialVersionUID = 1L;

    private Tool tool;
    private ToolView view;


    public OpenViewAction(Tool tool, ToolView view) {
        super();
        this.tool = tool;
        this.view = view;
        putValue(Action.NAME, view.getToolViewName());
        putValue(Action.LARGE_ICON_KEY, tool.getBigIcon());
        putValue(Action.SMALL_ICON, tool.getSmallIcon());
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        ToolController.getInstance().getDesktop().getCurrentPerspective().openToolView(view);
        setEnabled(false);
    }


    public Tool getTool() {
        return tool;
    }


    public ToolView getToolView() {
        return view;
    }
}
