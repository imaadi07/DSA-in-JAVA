    public class Pallindrome {
        public static void main(String[] args) {
            int n = 121;
            System.out.println(isPallindrome(n));
        }

        public static boolean isPallindrome(int n) {
            int reverse = 0;
            int orignal = n;
            while(n != 0) {
                int rem = n %10;
                reverse = reverse * 10 + rem;
                n = n / 10;
            }

            if(orignal == reverse) {
                return true;
            } else {
                return false;
            }
        }
    }
