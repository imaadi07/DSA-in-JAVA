class MyStack {
    int[] data;
    int tos;

    public MyStack(int cap) {
        data = new int[cap];
        tos = -1;
    }

    int size() {
        return tos + 1;
    }

    void display() {
        for (int i = tos; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    void push(int val) {
        if (tos == data.length - 1) {
            int[] ndata = new int[2 * data.length];
            for(int i=0; i<data.length; i++) {
                ndata[i] = data[i];
            }
            data = ndata;
            tos++;
            data[tos] = val;
        } else {
            tos++;
            data[tos] = val;
        }
    }

    int pop() {
        if (tos == -1) {
            System.out.println("Nothing to pop here");
            return -1;
        } else {
            int val = data[tos];
            tos--;
            return val;
        }
    }

    int top() {
        if (tos == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return data[tos];
        }
    }
}

public class BasicStack1 {
    public static void main(String[] args) {
        MyStack st = new MyStack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.top());
        System.out.println(st.size());
    }
}
