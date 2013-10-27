/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.guimodule;

import java.awt.Image;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.ImageUtilities;

/**
 *
 * @author dmenard
 */
class RootNode extends AbstractNode {

    public RootNode(Children children) {
        super(children);
        setIconBaseWithExtension("com/guimodule/menu.png");
    }
    
    
    
}
