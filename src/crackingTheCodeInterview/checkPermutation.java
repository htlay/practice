/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingTheCodeInterview;

import java.util.Arrays;


public class checkPermutation {
    public String sort(String s){
        char [] content =  s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    
    boolean permutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }
    
    public static void main(String[] args){
        checkPermutation cP1 = new checkPermutation();
        String s1 = "dog   ";
        String s2 = "god";
        System.out.println(cP1.permutation(s1, s2));
        
    }
}
