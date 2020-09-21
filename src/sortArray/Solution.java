/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortArray;

import java.util.*;

public class Solution {
    public static void sortArray(int arr[]) 
    { 
        ArrayList<Integer> oddArray = new ArrayList<>(); 
        ArrayList<Integer> evenArray = new ArrayList<>(); 
        
        for (int i = 0; i < arr.length;i++) 
        { 
            if (arr[i] % 2 == 0)     
                evenArray.add(arr[i]); 
            else
                oddArray.add(arr[i]);

        }
        Collections.sort(evenArray); 
        Collections.sort(oddArray, Collections.reverseOrder()); 

        for(int i = 0; i < evenArray.size(); i++) 
            System.out.print(evenArray.get(i) + " "); 
        
        for(int i = 0; i < oddArray.size(); i++) 
            System.out.print(oddArray.get(i) + " "); 
    }
    public static void main(String[] args) 
    {   
        Solution ss1 = new Solution();
        int arr[] = {3, 2, 7, 8, 6, 1, 12, 9, 10}; 
        ss1.sortArray(arr); 
        System.out.println();
    } 
}
