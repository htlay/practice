/*
    1266 Minimum Time Visiting All Points

    Input: points = [[1,1],[3,4],[-1,0]]
    Output: 7
    Explanation: One optimal path is [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]   
    Time from [1,1] to [3,4] = 3 seconds 
    Time from [3,4] to [-1,0] = 4 seconds
    Total time = 7 seconds
    Example 2:

    Input: points = [[3,2],[-2,2]]
    Output: 5
 */
package vistAllPoint;

/**
 *
 * @author hunglay
 */
public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for (int i = 1; i < points.length; ++i) {
            int[] cur = points[i], prev = points[i - 1];
            for (int j = 0; j < cur.length; j++){
                System.out.println("Cur = " + cur[j]);
            }
            for (int j = 0; j < cur.length; j++){
                System.out.println("prev = " + prev[j]);
            }
            
            
            System.out.println("Curr0 = " + Math.abs(cur[0] - prev[0]));
            System.out.println("Curr1 = " + Math.abs(cur[1] - prev[1]));
            ans += Math.max(Math.abs(cur[0] - prev[0]), Math.abs(cur[1] - prev[1]));
            System.out.println("Curr ans= " + ans);
        }
        return ans; 
    }
    public static void main(String[] args){
        Solution ss1 = new Solution();
        int[][] points = {{3,2},{-2,2},{1,0}};
        int ans = ss1.minTimeToVisitAllPoints(points);
        System.out.println("Ans = " + ans);
        
    }
}
