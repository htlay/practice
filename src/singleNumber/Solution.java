/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleNumber;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int singleNumber(int[] nums) {
        int s = nums.length-1;
        int i = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(; i<=s; i++)
        {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i])+1);
            else
                map.put(nums[i], 1);		
	}
        i = 0;
        while (i <= s) {
            if (map.get(nums[i]) == 1)
                break;
            i++;
        }
        return nums[i];
//        int result = nums[0];
//        System.out.println("result1 = " + result);
//        for (int i = 1; i < nums.length; i++) {
//                result = result ^ nums[i];
//                System.out.println("check =  " +i + " = " + result + " ^ " + nums[i]);
//                System.out.println("result = " + i + " -- " +result);
//        }
//
//        return result;

    }
    
    public static void main(String[] args){
        Solution s1 = new Solution();
        int [] num1 = {4, 2, 2, 2, 2, 1, 3, 1, 2}; 
        int result = s1.singleNumber(num1);
        System.out.println("Number  = " + result );
    }
    
}
