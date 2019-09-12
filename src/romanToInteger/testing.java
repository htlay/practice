/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanToInteger;

/**
 *
 * @author hunglay
 */
public class testing {
    public static void main(String[] args){
        romanToInt rToInt = new romanToInt();
        String s = "LIX";
        rToInt.romanToInt(s);
        System.out.println("Int = " + rToInt.romanToInt(s));
    }
}
