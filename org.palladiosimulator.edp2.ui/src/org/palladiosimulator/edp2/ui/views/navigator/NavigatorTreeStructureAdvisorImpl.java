/**
 * 
 */
package org.palladiosimulator.edp2.ui.views.navigator;

import org.eclipse.jface.databinding.viewers.TreeStructureAdvisor;


/**
 * @author groenda
 *
 */
public class NavigatorTreeStructureAdvisorImpl extends TreeStructureAdvisor {
	@Override
	public Object getParent(Object element) {
		return null;
	}
	
	@Override
	public Boolean hasChildren(Object element) {
		return super.hasChildren(element);
	}
}
