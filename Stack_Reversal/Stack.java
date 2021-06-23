public class Stack {

    private int maxSize;
    private char [] stackArray;
    private int top;

    public Stack(int max) {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char c) {
        stackArray[++top] = c;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        if (stackArray.length <= maxSize)
            return false;
        else
            return true;
    }
}

