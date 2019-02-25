/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome2therealone;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;
/**
 *
 * @author angus
 */
public class Palindrome2therealone {

    /**
     * @param args the command line arguments
     * 
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        ArrayList <String> phrase = new ArrayList();
        ArrayList <String> phrasebackwards = new ArrayList();
        ArrayList <String> words = new ArrayList();
        ArrayList <String> wordscorrect = new ArrayList();
        String  sentence, backwards;
        String wordsback = "";
        String wordsforward ="";
        int pos, numpal, size;
        numpal = 0;
        // get sentence 
        sentence = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a words is a palindrome.\n\n"
                + "Enter a sentence(Please do not include punctuation marks):");
    //Reverse the word
       backwards = "";
       for (pos = sentence.length() - 1; pos >= 0; pos--) {
            backwards += sentence.charAt(pos);
        }
       Collections.addAll (phrasebackwards, backwards); 
       
    // adds backwards word to array
       for (int i = 0; i < backwards.length() +1;){
        int end = i-1;
           if (end == -1){
          System.out.println ("oops");  
        }
        else{
            if (" ".equals(backwards.substring(end,i ))){
            System.out.println(" SPACE! ");
            Collections.addAll (words, wordsback);
            wordsback = "";
            
                    }
           
            
            else {
                wordsback += backwards.substring (i-1,i);
                System.out.println (backwards.substring(i-1,i));
                System.out.println(wordsback);
            }
           
        }
        
        
        System.out.println (i);
           i++;
               }
       
       // get words in correct order
       for (int i = 0; i < sentence.length() +1;){
        int end = i-1;
           if (end == -1){
          System.out.println ("oops");  
        }
        else{
            if (" ".equals(sentence.substring(end,i ))){
            System.out.println(" SPACE! ");
            Collections.addAll (wordscorrect, wordsforward);
                    wordsforward = "";
            
                    }
           
            
            else {
                wordsforward += sentence.substring (i-1,i);
                System.out.println (sentence.substring(i-1,i));
                System.out.println(wordsforward);
            }
           
        }
        
        
        System.out.println (i);
           i++;
               }
       Collections.addAll (wordscorrect, wordsforward);
       System.out.println (backwards);
       System.out.println (sentence);
       System.out.println (phrasebackwards);
       System.out.println (wordscorrect);
       System.out.println (wordscorrect.size());
             // checks to see if there are palindromes *****work here********
             size = wordscorrect.size();
             System.out.println (size);
     
             for (int i = 0; i < sentence.length() +1; i++){
                String wb, wf;
                 if (wordscorrect.size() -i-1 > 0){
                    System.out.println ("hi");
                    System.out.println (i);
                     wb = words.get(i);
                     wf = wordscorrect.get(wordscorrect.size() -i -1);
                     System.out.println (wb);
                     System.out.println (wf);
                     if (wb.equalsIgnoreCase(wf)){
                         numpal++;
                         System.out.println (numpal);
                     }
                 }
                 if (wordscorrect.size() -i-1 == 0){
                     System.out.println ("hello");
                     System.out.println (i);
                     wb = words.get(i); 
                     System.out.println (wb);
                     wf = wordscorrect.get(wordscorrect.size() -i -1);
                     System.out.println (wf);
                     if (wb.equalsIgnoreCase(wf)){
                         numpal++;
                         System.out.println (numpal);
                 }
                 }
               }
       
    // currently ingnore the if and else statements, what it is checking for is not correct
       if (sentence.equalsIgnoreCase(backwards)) {
            JOptionPane.showMessageDialog(null, "There are " + numpal + " palindromes in " + sentence);
        } else {
            JOptionPane.showMessageDialog(null, "There are no palindromes in " + sentence);
        }
    }
    }