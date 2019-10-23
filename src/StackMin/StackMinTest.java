/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackMin;

import java.util.Stack;

public class StackMinTest {
    public static void main(String[] args){
        StackMin minS = new StackMin();
        minS.push(5);
        System.out.println("min = " + minS.min());
        minS.push(6);
        System.out.println("min = " + minS.min());
        minS.push(3);
        System.out.println("min = " + minS.min());
        minS.push(7);
        System.out.println("min = " + minS.min());
        minS.pop();
        System.out.println("min = " + minS.min());
        minS.pop();
        System.out.println("min = " + minS.min());
    }
}
