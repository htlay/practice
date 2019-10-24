/*
    3.1 Three in One: Describe how you could use a single array to implement three stacks.
 */
package Stack1ThreeInOne;


public class ThreeInOne {
    private static final int numberOfStack = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;
    
    public ThreeInOne(int stackSize){
        stackCapacity = stackSize;
        values = new int [stackSize * numberOfStack];
        sizes = new int [numberOfStack];
    }
    
    public void push(int stackNum, int item){
        if (isFull(stackNum))
            throw new IllegalArgumentException("Stack " + stackNum + " is full!");
        sizes[stackNum]++;
        values[getIndexOfTop(stackNum)] = item;
    }
    
    public boolean isFull(int stackNum){
        return sizes[stackNum] == stackCapacity;
    }
    
    public boolean isEmpty(int stackNum){
        return sizes[stackNum] == 0;
    }
    
    public int pop(int stackNum){
        int val = peek(stackNum);
        sizes[stackNum]--;
        return val;
    }
    
    public int peek(int stackNum){
        if(isEmpty(stackNum)){
            throw new IllegalArgumentException("Stack " + stackNum + " doen't exist!");
        }
        return values[getIndexOfTop(stackNum)];
    }
    
    private int getIndexOfTop(int stackNum){
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }
    
    public void printStack(int stackNum) {
        if (stackNum < 0 || stackNum >= numberOfStack)
            throw new IllegalArgumentException("Stack " + stackNum + " doen't exist!");
        int top = getIndexOfTop(stackNum);
        int btm = stackNum * stackCapacity;
        System.out.print("Stack " + stackNum + ": ");
        for (int i = btm; i <= top; ++i) {
            System.out.print(values[i] + " ");
        }
        System.out.println("TOP");
    }

    public void printStacks() {
        for (int i = 0; i < numberOfStack; ++i) {
            printStack(i);
        }
    }
}
