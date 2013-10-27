/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.guimodule;

import org.openide.nodes.Children;
import org.openide.nodes.Node;

/**
 *
 * @author dmenard
 */
class CategoryChildren extends Children.Keys {

     
    private String[] categories = new String[]{
        "Ascending Intervals",
        "Descending Intervals",
        "Harmonic Intervals",
        "Chords",
        "Scales"};
    public CategoryChildren() {
    }

    @Override
    protected Node[] createNodes(Object t) {
        Category cat = (Category) t;
        return new Node[]{new CategoryNode(cat)};
    }
    
    protected void addNotify() {
        super.addNotify();
        Category[] objs = new Category[categories.length];
        for (int i = 0; i < objs.length; i++) {
            Category cat = new Category();
            cat.setName(categories[i]);
            objs[i] = cat;
        }
        setKeys(objs);
    }
    
}
