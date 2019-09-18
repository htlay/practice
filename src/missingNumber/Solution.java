/*
    268. Missing Number

    Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

    Example 1:

    Input: [3,0,1]
    Output: 2

    Example 2:

    Input: [9,6,4,2,3,5,7,0,1]
    Output: 8
 */
package missingNumber;

import java.util.HashSet;
import java.util.Set;


public class Solution {
//    public int missingNumber(int[] nums) {
//        int total, missNum = 0; 
//        int n = nums.length;
//        total = n*(n+1)/2; 
//        for (int i = 0; i < n; i++){
//            total -= nums[i];
//            missNum = total;
//        } 
//             
//        return missNum;
//    }
    
    public int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums) numSet.add(num);

        int expectedNumCount = nums.length + 1;
        for (int number = 0; number < expectedNumCount; number++) {
            if (!numSet.contains(number)) {
                return number;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) 
    { 
        int a[] = { 3,0,1 }; 
        Solution missNum = new Solution();
        int miss = missNum.missingNumber(a); 
        System.out.println("Miss number = " + miss); 
    } 
}
