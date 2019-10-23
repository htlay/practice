/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackMin;

import java.util.Stack;


public class StackMin extends Stack<NodeWithMin>{
   public void push(int value){
       int newMin = Math.min(value, min());
       super.push(new NodeWithMin(value, newMin));
   }

   public int min(){
       if(this.isEmpty()){
           return Integer.MAX_VALUE;
       }
       else{
           return peek().min;
       }
   }
}
