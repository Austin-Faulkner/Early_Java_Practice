public class Stack {
    private int maxSize;
    private char [] stackArr;
    private int top;

    public Stack(int max) {
        maxSize = max;
        stackArr = new char[maxSize];
        top = -1;
    }

    public void push(char i) {
        stackArr[++top] = i;
    }

    public char pop() {
        return stackArr[top--];
    }

    public char peek() {
        return stackArr[top];
    }

    public boolean isEmpty() {
        return (top == -1);
//        if (stackArr[top] < maxSize)
//            return false;
//        else
//            return true;
    }
}
