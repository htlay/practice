/*
    189. Rotate Array
    Given an array, rotate the array to the right by k steps, where k is non-negative.

    Follow up:

    Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
    Could you do it in-place with O(1) extra space?


    Example 1:

    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
    Example 2:

    Input: nums = [-1,-100,3,99], k = 2
    Output: [3,99,-1,-100]
    Explanation: 
    rotate 1 steps to the right: [99,-1,-100,3]
    rotate 2 steps to the right: [3,99,-1,-100]


    Constraints:

    1 <= nums.length <= 2 * 10^4
    It's guaranteed that nums[i] fits in a 32 bit-signed integer.
    k >= 0
 */
package rotateArray;


public class Solution {
    public static int[] rotate(int[] nums, int k) {
        while(k > 0){
            int last = nums[nums.length-1];
            //System.out.println("temp = " + last);
            for(int i = nums.length -1; i > 0; i--){
                nums[i]= nums[i-1];
                //System.out.println(i+ "= " + nums[i-1]);
            }
            nums[0]=last;
            //System.out.println(nums[0] + " 000 ");
            k--;
        }
        return nums;
    }
    public static void main(String[] args){
        Solution s1 = new Solution();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] result = new int[nums.length];
        result = s1.rotate(nums, k);
        for(int i = 0; i<nums.length;i++){
            System.out.print(result[i] + " ");
        }
        
    }
}
