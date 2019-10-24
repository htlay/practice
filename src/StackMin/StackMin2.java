/*
 
 */
package StackMin;

import java.util.Stack;

public class StackMin2 extends Stack<Integer> {
    
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
        if(s2.isEmpty()){
            return Integer.MAX_VALUE;
        }
        else{
            return s2.peek();
        }
    }
}
