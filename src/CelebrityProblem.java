import java.util.*;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] people = {
            {0,1,1,1,1},
            {1,0,0,1,0},
            {1,0,0,1,0},
            {0,0,0,0,0},
            {0,1,0,1,0},
        };
        findCelebrity(people);
    }

    public static void findCelebrity(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        // add all person to the stack
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }

        while(st.size() > 2) {
            int i = st.pop();
            int j = st.pop();

            if(arr[i][j] == 1) {
                // if i knows j -> means i is not a celeb
                st.push(j);
            } else {
                // if i dosen't know j -> means j is not celeb
                st.push(i);
            }
        }

        int pot = st.pop();
        for (int i = 0; i < arr.length; i++) {
            if(i != pot) {
                if(arr[i][pot] == 0 || arr[pot][i] == 1) {
                    System.out.println("No celebrity");
                    return;
                }
            }
        }
        System.out.println("Celebrity is: "+pot);
    }
}
