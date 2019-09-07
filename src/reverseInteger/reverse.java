/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseInteger;

/**
 *
 * @author hunglay
 */
public class reverse {
    public int reverse(int x) {
        int reversedNumber = 0;
        while( x != 0 )
        {
            int remainder = x % 10;
            x  /= 10;
            if (reversedNumber > Integer.MAX_VALUE/10 || (reversedNumber == Integer.MAX_VALUE / 10 && remainder > 7)) return 0;
            if (reversedNumber < Integer.MIN_VALUE/10 || (reversedNumber == Integer.MIN_VALUE / 10 && remainder < -8)) return 0;
            System.out.println(remainder);
            reversedNumber = reversedNumber * 10 + remainder;
            System.out.println("reverest: " + reversedNumber);
            
        }
        return reversedNumber;
    }   
    public static void main(String[] args){
       reverse pal = new reverse();
       int checked;
       checked = pal.reverse(1508880009);
       System.out.print(checked);
    }
}
