/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.guimodule;

import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author dmenard
 */
public class CategoryNode extends AbstractNode{

    public CategoryNode(Category category) {
       super(new LessonChildren(category),Lookups.singleton(category));
        setDisplayName(category.getName());
        setIconBaseWithExtension("com/guimodule/icon.png");
    }
    
}
