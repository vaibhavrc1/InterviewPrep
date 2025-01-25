package commoncodingquestions;

//Implement a stack data structure using arrays in Java, including push, pop, and isEmpty operations.
class MyStack<V> {
    private final V[] arr;
    int top;

    @SuppressWarnings("unchecked")
    public MyStack(int maxSize) {
        this.arr = (V[]) new Object[maxSize];
        this.top = -1;
    }

    public void push(V element) {
        if (this.top == this.arr.length) {
            throw new ArrayIndexOutOfBoundsException("Max stack capacity is already reached.");
        }
        this.top++;
        this.arr[this.top] = element;
    }

    public V pop() {
        if (this.top < 0) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty. Cannot pop an element");
        }
        return this.arr[this.top--];
    }

    public V peek() {
        return this.arr[this.top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>(5);
        for (String str : new String[]{"hello", "bye", "home", "House", "Sky"}) {
            stack.push(str);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("peek: " + stack.peek());
            System.out.println("pop: " + stack.pop());
        }

        System.out.println(stack.isEmpty());
    }
}
