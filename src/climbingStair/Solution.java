/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package climbingStair;


public class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        
        int[] ways = new int[n + 1];
        ways[0] = 1;
        ways[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            ways[i] = ways[i - 2] + ways[i - 1];
        }
        
        return ways[n];
    }
    
    public static void main(String[] args){
        Solution ss = new Solution();
        int n = 4;
        System.out.println(ss.climbStairs(n));
    }
}
