
class Stack1{
    int top;
    int capacity;
    int[] arr;

    Stack1(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    void push(int x) {
        if(top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
        System.out.println(x + " pushed");
    }

    int pop() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if(top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void Display() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack elements: ");
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
        System.out.println();
    }
}

public class StackFromArray {
    public static void main(String[] args) {
        Stack1 st = new Stack1(5);
        st.push(20);
        st.push(40);
        st.Display();
    }
}
