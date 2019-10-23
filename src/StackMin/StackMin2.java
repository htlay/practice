/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackMin;

import java.util.Stack;

public class StackMin2 extends Stack<Integer> {
//    Stack<Integer> s2;
//    public StackMin2(){
//        s2 = new Stack<>();
//    }
//    
//    public void push(int value){
//        if(value<=min()){
//            s2.push(value);
//        }
//        super.push(value);
//    }
//    
//    public Integer pop(){
//        int value = super.pop();
//        if(value == min()){
//            s2.pop();
//        }
//        return value;
//    }
//    
//    public int min(){
//        if(s2.isEmpty()){
//            return Integer.MAX_VALUE;
//        }
//        else{
//            return s2.peek();
//        }
//    }
    private Stack<Integer> s2;
    
    public StackMin2(){
        s2 = new Stack<>();
    }

    public void push(int item) {
        if (s2.isEmpty() || item < min()) {
            s2.push(item);
        }
        super.push(item);
    }

    public Integer pop() {
        int item = super.pop();
        if (item == min()) {
            s2.pop();
        }
        return item;
    }

    public Integer min() {
        return s2.peek();
    }
}
