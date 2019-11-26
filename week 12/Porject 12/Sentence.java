/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sentences;

/**
 *
 * @author valen
 */

//Sentence class
class Sentence {
    
    //Word Class
    private Word wordObj;
  
    //Constructor
    public Sentence() {
        
        //Make an instance
        wordObj = new Word();
    }
  
    //Method used to return sentence.
    public String getSentence() {
        
        //Create a sentence 
        String str = wordObj.getArticle() + " " + wordObj.getNoun() + " " 
                   + wordObj.getVerb() + " " + wordObj.getPreposition() + " " 
                   + wordObj.getArticle() + " " + wordObj.getNoun();
      
        //Make 1st Char upper and placing period at end
        str = str.substring(0, 1).toUpperCase()+str.substring(1)+".";
      
        //Send back string
        return str;
   }
}