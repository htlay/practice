/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfDividingNumber;

import java.util.LinkedList;
import java.util.List;


public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> listNumber = new LinkedList<>();
        for (int num = left; num <= right; num++) {
            int i = num;
            for (; i > 0; i /= 10) {
                if ((i % 10 == 0) || (num % (i % 10) != 0)) {
                    break;
                }
            }
            if (i == 0) {
                listNumber.add(num);
            }
        }
        return listNumber;
    }
    
    public static void main(String[] args){
        Solution ss = new Solution();
        System.out.println(ss.selfDividingNumbers(1, 128));
    }
}
