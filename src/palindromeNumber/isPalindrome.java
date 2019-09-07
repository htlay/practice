/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromeNumber;

/**
 *
 * @author hunglay
 */
public class isPalindrome {
    public boolean isPalindrome(int x) {
        int reversedNumber = 0, remainder, originalNumber;
        originalNumber = x;
        if(x<0){
            return false;
        }
        while( x != 0 )
        {
            remainder = x % 10;
            System.out.println(remainder);
            reversedNumber = reversedNumber * 10 + remainder;
            System.out.println("reverest: " + reversedNumber);
            x  /= 10;
        }
        if (originalNumber == reversedNumber)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args){
       isPalindrome pal = new isPalindrome();
       boolean checked = true;
       checked = pal.isPalindrome(-101);
       System.out.print(checked);
    }
}
