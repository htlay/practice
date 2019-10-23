/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackMin;

public class StackMinTest2 {
    public static void main(String[] args){
        StackMin2 minS2 = new StackMin2();
        minS2.push(5);
        System.out.println("min = " + minS2.min());
        minS2.push(6);
        System.out.println("min = " + minS2.min());
        minS2.push(3);
        System.out.println("min = " + minS2.min());
        minS2.push(7);
        System.out.println("min = " + minS2.min());
        minS2.pop();
        System.out.println("min = " + minS2.min());
        minS2.pop();
        System.out.println("min = " + minS2.min());
        
       
    }
}
