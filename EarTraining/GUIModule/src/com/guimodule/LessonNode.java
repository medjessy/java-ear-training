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
public class LessonNode extends AbstractNode {
    private Lesson lesson;
    
    public LessonNode(Lesson lesson){
        super(Children.LEAF,Lookups.fixed(new Object[]{lesson}));
        this.lesson = lesson;
        setDisplayName(lesson.getName());
        setIconBaseWithExtension("com/guimodule/node.png");
    }
}
