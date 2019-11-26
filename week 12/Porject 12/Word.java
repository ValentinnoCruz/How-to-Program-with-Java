/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sentences;
import java.util.*;

/**
 *
 * @author valen
 */

//Word Class Defined
class Word {
    
    //Priv Inst. Var.
    private Random rand;
    private String[] article;
    private String[] noun;
    private String[] verb;
    private String[] preposition;

    //Initilizing array
    public Word() {
       
       //Make a Random Object
       rand = new Random();
      
       //Arrays Initilization 
       article =     new String[] {"the", "a", "one", "some", "any"};
       noun =        new String[] {"boy", "girl", "dog", "town", "car"};
       verb =        new String[] {"drove", "jumped", "ran", "walked", "skipped"};
       preposition = new String[] {"to", "from", "over", "under", "on"};     
    }
  
    //Return noun via Get
    public String getNoun() {
       
        //Create Random Num
        int r = rand.nextInt(5);
      
        //Send back noun
        return noun[r];
    }
  
    //Returning article Get
    public String getArticle() {
        
        //Create random num
        int r = rand.nextInt(5);
      
        //Send a random article
        return article[r];
    }
  
    //Getter for returning verb
    public String getVerb() {
       
       //Create random Num
       int r = rand.nextInt(5);
      
       //Send back verb
       return verb[r];
    }
  
    //Get for returning preposition
    public String getPreposition() {
        
        //Create Random num
        int r = rand.nextInt(5);
      
        //send back preposition
        return preposition[r];
    }
}  