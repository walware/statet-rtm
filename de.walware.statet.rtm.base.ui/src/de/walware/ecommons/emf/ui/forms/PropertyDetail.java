/*=============================================================================#
 # Copyright (c) 2013-2014 Stephan Wahlbrink (WalWare.de) and others.
 # All rights reserved. This program and the accompanying materials
 # are made available under the terms of the Eclipse Public License v1.0
 # which accompanies this distribution, and is available at
 # http://www.eclipse.org/legal/epl-v10.html
 # 
 # Contributors:
 #     Stephan Wahlbrink - initial API and implementation
 #=============================================================================*/

package de.walware.ecommons.emf.ui.forms;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;


public abstract class PropertyDetail extends Detail {
	
	
	public PropertyDetail(final DetailStack parent) {
		super(parent);
	}
	
	
	@Override
	protected Composite createComposite(final DetailStack parent) {
		return new Composite(parent, SWT.NONE);
	}
	
}
