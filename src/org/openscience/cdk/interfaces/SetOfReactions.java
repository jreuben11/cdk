/* $RCSfile$    
 * $Author$    
 * $Date$    
 * $Revision$
 * 
 * Copyright (C) 2003-2005  The Chemistry Development Kit (CDK) project
 * 
 * Contact: cdk-devel@lists.sourceforge.net
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA. 
 */
package org.openscience.cdk.interfaces;


/** 
 * A set of reactions, for example those taking part in a reaction.
 *
 * @cdk.module data
 *
 * @cdk.keyword reaction
 */
public interface SetOfReactions extends ChemObject {

	/**
	 * Adds an reaction to this container.
	 *
	 * @param  reaction  The reaction to be added to this container 
	 */
	public void addReaction(Reaction reaction);
    
    /**
	 * Returns the Reaction at position <code>number</code> in the
	 * container.
	 *
	 * @param  number  The position of the Reaction to be returned
	 * @return         The Reaction at position <code>number</code>
	 */
    public Reaction getReaction(int number);

	/**
	 * Returns the array of Reactions of this container.
	 *
	 * @return    The array of Reactions of this container 
	 */
	public Reaction[] getReactions();
	
	/**
	 * Returns the number of Reactions in this Container.
	 *
	 * @return     The number of Reactions in this Container
	 */
	public int getReactionCount();

}
