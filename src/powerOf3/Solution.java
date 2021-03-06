/*
    326. Power of Three
    Given an integer, write a function to determine if it is a power of three.

    Example 1:
    Input: 27
    Output: true

    Example 2:
    Input: 0
    Output: false

    Example 3:
    Input: 9
    Output: true

    Example 4:
    Input: 45
    Output: false
 */
package powerOf3;

public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
    public static void main(String[] args){
        Solution ss = new Solution();
        boolean check;
        check = ss.isPowerOfThree(27);
        System.out.println("check = " + check);
    }
}
