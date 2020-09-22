/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberCandies;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for(int i = 0; i<candies.length; i++){
            max = Math.max(candies[i], max);
        }
        List<Boolean> maxCand = new ArrayList<>();
        for(int i = 0; i<candies.length; i++){
            if(candies[i] + extraCandies >= max){
                maxCand.add(Boolean.TRUE);
            }
            else{
                maxCand.add(Boolean.FALSE);
            }
        }
        return maxCand;
    }
    
    public static void main(String[] args){
        Solution s1 = new Solution();
        int[] arr1 = {2,3,5,1,3,9};
        List list1 = new ArrayList<>();
        list1 = s1.kidsWithCandies(arr1, 3);
        System.out.println(list1 + " ");
    }
}
