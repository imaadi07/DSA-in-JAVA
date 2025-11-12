public class SmalletNoInInt {
    public static void main(String[] args) {
     int number = 12345;
     int smallestNum = 9;

     while(number > 0) {
         int digit = number % 10;
         if(digit < smallestNum) {
             smallestNum = digit;
         }
         number = number/10;
     }
        System.out.println(smallestNum);
    }
}

