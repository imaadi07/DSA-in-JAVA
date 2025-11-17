import java.util.*;

public class TwoStackArray {

    public static class TwoStack {
        int[] data;
        int tos1;
        int tos2;

        public TwoStack(int cap) {
            data = new int[cap];
            tos1 = -1;
            tos2 = data.length;
        } 

        // Return the size of 1st stack
        public int size1() {
            return tos1 + 1;
        }

        // Return the size of 2nd stack
        public int size2() {
            return  data.length - tos2;
        }

        // Push a new element in 1st stack
        public void push1(int val) {
            if(tos2 == tos1 + 1) {
                System.out.println("Stack Overflow");
            } else {
                tos1++;
                data[tos1] = val;
            }
        }

        // Push a new element in 2nd stack
        public void push2(int val) {
            if(tos1 == tos2 - 1) {
                System.out.println("Stack Overflow");
            } else {
                tos2--;
                data[tos2] = val; 
            }
        }

        // Remove element from top of the 1st stack
        public int pop1() {
            if(size1() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                int val = data[tos1];
                tos1--;
                return val;
            }
        }

        // Remove element from top of the 2nd stack
        public int pop2() {
            if(size2() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                int val = data[tos2];
                tos2++;
                return val;
            }
        }
        
        // Return the element present on the top of the 1st stack
        public int top1() {
            if(size1() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                int val = data[tos1];
                return val;
            }
        }

        // Return element present on the top of the 2nd stack
        public int top2() {
            if(size2() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                int val = data[tos2];
                return val;
            }
        }
    }
    public static void main(String[] args) {
        TwoStack ts = new TwoStack(10);

        ts.push1(10);
        ts.push1(20);
        ts.push2(100);
        ts.push2(200);

        System.out.println(ts.top1());
        System.out.println(ts.top2());
        System.out.println(ts.pop1());
        System.out.println(ts.pop2());
    }
}
