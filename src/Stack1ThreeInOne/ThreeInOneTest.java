/*
 
 */
package Stack1ThreeInOne;

public class ThreeInOneTest {
    public static void main(String[] args){
        ThreeInOne stack = new ThreeInOne(5);
        
        stack.push(0, 1); 
        stack.push(0, 2); 
        stack.push(0, 3);
        
        stack.push(1, 11); 
        stack.push(1, 12); 
        stack.push(1, 13);
        
        stack.push(2, 21); 
        stack.push(2, 22); 
        stack.push(2, 23); 
        stack.push(2, 24);
        stack.printStacks();
        
        System.out.println("Pop Stack 0: " + stack.pop(0));
        System.out.println("Pop Stack 1: " + stack.pop(1));
        System.out.println("Pop Stack 2: " + stack.pop(2));
        stack.printStacks();
    }
    
}
