/*
 * Running Sum of 1d Array
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

    Return the running sum of nums.



    Example 1:

    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
    Example 2:

    Input: nums = [1,1,1,1,1]
    Output: [1,2,3,4,5]
    Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
    Example 3:

    Input: nums = [3,1,2,10,1]
    Output: [3,4,6,16,17]
 */
package sumof1dArray;

public class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
                result[i] = result[i-1]+nums[i];
        }

        return result;
    }
    public static void main(String[] args){
        Solution s1 = new Solution();
        int[] nums =  {3,1,2,10,1};
        int[] result = new int[nums.length];
        result = s1.runningSum(nums);
        for(int i = 0; i<nums.length;i++){
            System.out.print(result[i] + " ");
        }
        
    }
}
