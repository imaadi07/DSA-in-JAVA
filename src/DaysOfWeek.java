import java.util.ArrayList;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DaysOfWeek {


    public class WeekDaysProgram {

    // Function to display current time
        public static void showCurrentTime() {
        // Get current time
            LocalTime currentTime = LocalTime.now();

        // Format time (HH:mm:ss)
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Print formatted time
            System.out.println("Current Time: " + currentTime.format(formatter));
        }

        public static void Days() {
             ArrayList<String> days = new ArrayList<>();

        // Add days
            days.add("Monday");
            days.add("Tuesday");
            days.add("Wednesday");
            days.add("Thursday");
            days.add("Friday");
            days.add("Saturday");
            days.add("Sunday");

        // Display days
            System.out.println("Days of the Week:");
                for (String day : days) {
                    System.out.println(day);
                }
    }

    public static void main(String[] args) {
       showCurrentTime();
       Days();
    }
}
}
