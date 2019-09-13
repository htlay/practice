/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FizzBuzz;

// Leet code #412
/*
    Write a program that outputs the string representation of numbers from 1 to n.

    But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

    Example:

    n = 15,

    Return:
    [
        "1",
        "2",
        "Fizz",
        "4",
        "Buzz",
        "Fizz",
        "7",
        "8",
        "Fizz",
        "Buzz",
        "11",
        "Fizz",
        "13",
        "14",
        "FizzBuzz"
    ]
*/

import java.util.ArrayList;
import java.util.List;
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>(n);
        for(int i = 1; i<=n; i++){
            if(i%15 == 0){
                ans.add("FizzBuzz");
            }
            else if(i%3 == 0){
                ans.add("Fizz");
            }
            else if(i%5 == 0){
                ans.add("Buzz");
            }
            else {
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }
    
    public static void main(String[] args){
        Solution s1 = new Solution();
        System.out.println(s1.fizzBuzz(25));
    }
}
