/*
     118. Pascal's Triangle
    Example:

    Input: 5
    Output:
    [
         [1],
        [1,1],
       [1,2,1],
      [1,3,3,1],
     [1,4,6,4,1]
    ]
 */
package PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pasacalT = new ArrayList<>();
        if (numRows == 0) 
            return pasacalT;

        for (int i = 0; i < numRows; i++) 
          pasacalT.add(new ArrayList<>());

        pasacalT.get(0).add(1); // first row = [1]

        for(int i = 1; i < numRows; i++)
        {
          pasacalT.get(i).add(1);    	
          for(int j = 1; j < i; j++)
            pasacalT.get(i).add(pasacalT.get(i-1).get(j) + pasacalT.get(i-1).get(j-1));
          pasacalT.get(i).add(1);
        }
        return pasacalT;
    }
    public static void main(String []args)
      {
        Solution s = new Solution();	  
        List<List<Integer>> res = s.generate(5);
        System.out.println(res);
      }
}
