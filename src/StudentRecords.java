import java.util.ArrayList;
import java.util.Scanner;

public class StudentRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> rolls = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();

        System.out.println("Enter student records (roll-score), one per line:");
        System.out.println("Press ENTER on a blank line to stop input.\n");

        while (true) {
            String input = sc.nextLine().trim();

            // Stop if user hits enter on empty line
            if (input.isEmpty()) {
                break;
            }

            // Validate format
            if (!input.contains("-")) {
                System.out.println("Invalid input format. Use roll-score (e.g., 101-89). Try again.");
                continue;
            }

            String[] parts = input.split("-");
            if (parts.length != 2) {
                System.out.println("Invalid input format. Use roll-score (e.g., 101-89). Try again.");
                continue;
            }

            try {
                int roll = Integer.parseInt(parts[0].trim());
                int score = Integer.parseInt(parts[1].trim());

                int index = rolls.indexOf(roll);
                if (index == -1) {
                    rolls.add(roll);
                    scores.add(score);
                } else if (score > scores.get(index)) {
                    scores.set(index, score);
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid number detected. Try again.");
            }
        }

        // Sorting logic (descending)
        for (int i = 0; i < scores.size() - 1; i++) {
            for (int j = i + 1; j < scores.size(); j++) {
                if (scores.get(i) < scores.get(j)) {
                    int tempScore = scores.get(i);
                    scores.set(i, scores.get(j));
                    scores.set(j, tempScore);

                    int tempRoll = rolls.get(i);
                    rolls.set(i, rolls.get(j));
                    rolls.set(j, tempRoll);
                }
            }
        }

        // Print results
        System.out.println("\nFinal Sorted Records (by highest score):");
        for (int i = 0; i < rolls.size(); i++) {
            System.out.println(rolls.get(i) + "-" + scores.get(i));
        }
    }
}
