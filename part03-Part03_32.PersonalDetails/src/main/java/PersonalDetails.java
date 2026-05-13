
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        //double averageBirthYears = 0;
        int count = 0;
        int sum = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            String name = parts[0];
            int birthYear = Integer.valueOf(parts[1]);

            if (name.length() > longestName.length()) {
                longestName = name;
            }
            
            sum += birthYear;
            count++;

            }

            System.out.println("Longest name: " + longestName);
            System.out.println("Average of the birth years: " + (1.0 * sum / count));          
        
    }
}
