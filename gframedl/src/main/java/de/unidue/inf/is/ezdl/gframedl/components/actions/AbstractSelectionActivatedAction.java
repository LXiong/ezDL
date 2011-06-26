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

package de.unidue.inf.is.ezdl.gframedl.components.actions;

import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



/**
 * This abstract action is activated if the selection of the client changes.
 * 
 * @author mjordan
 */
public abstract class AbstractSelectionActivatedAction extends AbstractAction {

    private static final long serialVersionUID = -3409553110594297815L;

    private SelectionGetter client;

    private boolean checkAll = false;


    /**
     * Creates a new Action for the given client.
     * 
     * @param client
     *            the object from which to retrieve selected objects to act on
     */
    public AbstractSelectionActivatedAction(SelectionGetter client) {
        this.client = client;
        setEnabled(false);
        client.addListSelectionListener(new LSL());
    }


    /**
     * Returns the {@link SelectionGetter} instance that is linked to the
     * {@link Action}.
     * 
     * @return the {@link SelectionGetter} instance
     */
    protected SelectionGetter getClient() {
        return client;
    }


    private class LSL implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                List<?> selected = client.getSelectedObjects();
                boolean predicate = false;
                for (Object s : selected) {
                    if (canHandle(s)) {
                        predicate = true;
                        if (!checkAll) {
                            break;
                        }
                    }
                    else {
                        predicate = false;
                        if (checkAll) {
                            break;
                        }
                    }
                }
                setEnabled(predicate);
            }
        }

    }


    /**
     * Sets the checkAll mode.
     * <p>
     * If checkAll is true,
     * {@link AbstractSelectionActivatedAction#canHandle(Object)} has to return
     * true for all objects selected in the client to enable the action. if
     * checkAll is false,
     * {@link AbstractSelectionActivatedAction#canHandle(Object)} only has to
     * return true for one (any) object to enable the action.
     * 
     * @param checkAll
     */
    protected void setCheckAll(boolean checkAll) {
        this.checkAll = checkAll;
    }


    /**
     * Returns if the Action can handle the given object.
     * 
     * @param s
     *            the object to examine
     * @return true, if the Action can handle the object, else false. By default
     *         returns true for all objects.
     */
    protected boolean canHandle(Object s) {
        return true;
    }
}
