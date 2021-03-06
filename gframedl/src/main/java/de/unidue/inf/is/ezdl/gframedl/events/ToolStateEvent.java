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

package de.unidue.inf.is.ezdl.gframedl.events;

import de.unidue.inf.is.ezdl.gframedl.tools.Tool;
import de.unidue.inf.is.ezdl.gframedl.tools.ToolState;



public class ToolStateEvent extends GFrameEvent {

    private static final long serialVersionUID = 4386938386591340428L;

    private Tool tool;
    private ToolState toolState;


    public ToolStateEvent(Object eventSource, Tool tool, ToolState toolState) {
        super(eventSource);
        this.tool = tool;
        this.toolState = toolState;
    }


    public Tool getTool() {
        return tool;
    }


    public ToolState getToolState() {
        return toolState;
    }
}
