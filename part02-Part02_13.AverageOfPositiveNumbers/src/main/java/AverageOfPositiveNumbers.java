
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double count = 0;
        double sum = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            
            if (number > 0) {
                count++;
                sum += number;
            }else {
                continue;
            }

        }

        double average = sum / count;
        System.out.println(average);

    }
}
