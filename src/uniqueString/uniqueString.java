/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniqueString;

import java.util.*;

public class uniqueString {
    
    //Data Structure: This approach assumes ASCII char set(8 bits)
    //Time Compplexity: O(N)
    public static boolean uniqueString(String str){
        if(str.length()>128)
            return false;
        boolean char_set[] = new boolean[128];
        
        for(int i = 0; i<str.length(); i++){
            int val = str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] =true;
        }
        return true;
    }
    
    // Sorting: Using sorting based on ASCII values of characters
    //Time Complexity: O(n log n)    
    public static boolean uniqueString2(String str){
        char[] charArray = str.toCharArray();
        
        Arrays.sort(charArray);

        for(int i = 0; i<charArray.length -1; i++){
            if(charArray[i] == charArray[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        String str1 ="abcd123";
        String str2 = "ab1d123";
        
        boolean uniqueStr;
        
        uniqueStr = uniqueString2(str1);
        System.out.println("str1: " + uniqueStr);
                
        uniqueStr = uniqueString2(str2);
        System.out.println("str2: " + uniqueStr);
        
    }
}
