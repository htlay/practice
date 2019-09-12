/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanToInteger;

import java.util.HashMap;
import java.util.Map;


public class romanToInt {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
     }};
      
        int num = 0;
        char prev = '\0';
        
        for(int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            //System.out.println("Char = " + c);
            int add = map.get(c);
            
            if (prev != '\0' && map.get(prev) > map.get(c)){
                add = -add;
            }
            
            num += add;
            prev = c;
            //System.out.println("prev === " + c);
        }
        return num;
    }
}
