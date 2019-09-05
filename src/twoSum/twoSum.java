/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twoSum;

import java.util.HashMap;
import java.util.Map;

public class twoSum 
{
//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (target == nums[i] + nums[j]) {
//                    System.out.println("[" + nums[i] + ", " + nums[j] + "]");
//                    return new int[] { i, j };
//                }
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
    
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            int different =  target - nums[i];
            if(map.containsKey(different)){
                System.out.println("[aa" + map.get(different)+ ", " + i + "]");
                return new int[] { map.get(different), i };
            }
            map.put(nums[i], i);
            System.out.println("[" + nums[i]+ ", " + i + "]");
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args){
        int[] intArray = { 11,2,3,4,79,6,7,8,9,10 }; 
        int target = 10;
        twoSum(intArray, target);
    }
}
