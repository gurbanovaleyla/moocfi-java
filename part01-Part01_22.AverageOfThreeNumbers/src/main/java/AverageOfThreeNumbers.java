
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first_number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second_number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int third_number = Integer.valueOf(scanner.nextLine());
        double average = 1.0 * (first_number + second_number + third_number) / 3;
        System.out.println("The average is " + average);


    }
}
