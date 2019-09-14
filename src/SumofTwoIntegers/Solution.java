/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SumofTwoIntegers;


public class Solution {
    public int getSum(int a, int b) {
        while (b != 0)  
        { 
            // carry now contains common 
            // set bits of x and y 
            int carry = a & b; 
//            System.out.println("carry = " + a + " & " + b );
//            System.out.println("carry = " + carry );
            // Sum of bits of x and  
            // y where at least one  
            // of the bits is not set 
            a = a ^ b; 
//            System.out.println("a = " + a + " ^ " + b );
//            System.out.println("a = " + a );
            // Carry is shifted by  
            // one so that adding it  
            // to x gives the required sum 
            b = carry << 1;
//            System.out.println("carry << " + carry );
//            System.out.println("b = " + b );
        } 
        return a; 
    }
    
    public static void main(String[] args){
        Solution s1 = new Solution();
        int sum = s1.getSum(15, 10);
        System.out.println("Sum = " + sum );
    
    }
}
