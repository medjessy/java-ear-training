/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.guimodule;

import java.util.ArrayList;
import org.openide.nodes.Index;
import org.openide.nodes.Node;

/**
 *
 * @author dmenard
 */
public class LessonChildren extends Index.ArrayChildren{
    private Category category;
    public LessonChildren(Category category){
        this.category = category;
    }
     private String[][] items = new String[][]{
        {"0", "Ascending Intervals", "Minor and Major 2nd"},
        {"1", "Ascending Intervals", "Minor and Major 3rd"},
        {"2", "Ascending Intervals", "Perfect 4th, Tritone and Perfect 5th"},
        {"3", "Ascending Intervals", "Minor and Major 6th"},
        {"4", "Descending Intervals", "Minor and Major 2nd"},
        {"5", "Descending Intervals", "Minor and Major 3rd"},
        {"6", "Ascending Intervals", "Minor and Major 7th"},
        {"7", "Descending Intervals", "Perfect 4th, Tritone and Perfect 5th"},
        {"8", "Descending Intervals", "Minor and Major 6th"},
        {"9", "Descending Intervals", "Minor and Major 7th"},
        {"10", "Harmonic Intervalss", "Minor and Major 2nd"},
        {"11", "Harmonic Intervals", "Minor and Major 3rd"},
        {"12", "Harmonic Intervals", "Perfect 4th, Tritone and Perfect 5th"},
        {"13", "Harmonic Intervals", "Minor and Major 6th"},
        {"14", "Harmonic Intervals", "Minor and Major 7th"},
        {"15","Chords","Minor and Major"},
        {"16","Chords","m7 and dom7"},
        {"17","Chords","dom7 and maj7"}
        
    };
    
     protected java.util.List<Node> initCollection() {
        ArrayList childrenNodes = new ArrayList( items.length );
        for( int i=0; i<items.length; i++ ) {
            if( category.getName().equals( items[i][1] ) ) {
                Lesson item = new Lesson();
                //item.set(new Integer(items[i][0]));
                item.setCategory(items[i][1]);
                item.setName(items[i][2]);
                childrenNodes.add( new LessonNode( item ) );
            }
        }
        return childrenNodes;
    }
}
