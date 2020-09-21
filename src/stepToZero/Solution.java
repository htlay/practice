/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepToZero;

/**

 */
public class Solution {
    public int numberOfSteps (int num) {
        int count = 0;
        int remainNum = num;
        while(remainNum != 0){
            if(remainNum % 2 == 0){
                count++;
                remainNum -= remainNum/2;
            }
            else{
                remainNum -= 1;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Solution s1 = new Solution();
        int number  = 9;
        int totalStep = s1.numberOfSteps(number);
        System.out.println("Step = "+ totalStep);
    }
}
