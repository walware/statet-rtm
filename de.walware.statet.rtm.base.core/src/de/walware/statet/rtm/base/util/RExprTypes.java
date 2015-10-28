/*=============================================================================#
 # Copyright (c) 2012-2015 Stephan Wahlbrink (WalWare.de) and others.
 # All rights reserved. This program and the accompanying materials
 # are made available under the terms of the Eclipse Public License v1.0
 # which accompanies this distribution, and is available at
 # http://www.eclipse.org/legal/epl-v10.html
 # 
 # Contributors:
 #     Stephan Wahlbrink - initial API and implementation
 #=============================================================================*/

package de.walware.statet.rtm.base.util;

import java.util.List;

import de.walware.jcommons.collections.ImCollections;
import de.walware.jcommons.collections.ImList;


public class RExprTypes {
	
	
	private final ImList<RExprType> types;
	
	private final String defaultTypeKey;
	
	
	public RExprTypes(final RExprType type) {
		this(ImCollections.newList(type), type.getTypeKey());
	}
	
	public RExprTypes(final ImList<RExprType> types, final int defaultTypeIdx) {
		this.types= types;
		this.defaultTypeKey= types.get(defaultTypeIdx).getTypeKey();
	}
	
	public RExprTypes(final ImList<RExprType> types, final String defaultType) {
		this.types= types;
		this.defaultTypeKey= defaultType;
	}
	
	
	public List<RExprType> getTypes() {
		return this.types;
	}
	
	public String getDefaultTypeKey() {
		return this.defaultTypeKey;
	}
	
	public boolean contains(final String typeKey) {
		for (int i= 0; i < this.types.size(); i++) {
			if (this.types.get(i).getTypeKey() == typeKey) {
				return true;
			}
		}
		return false;
	}
	
}
