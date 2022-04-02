/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1;

import java.util.ArrayList;

/**
 *
 * @author Anas
 */
public class Assignment_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Block> list = new ArrayList<Block>();
        list.add(new Block("one hash","0"));
        list.add(new Block("two hash",list.get(list.size() - 1).hash));
    }
    

}

