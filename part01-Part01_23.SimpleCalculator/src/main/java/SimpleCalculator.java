
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first_number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second_number = Integer.valueOf(scanner.nextLine());
        int sum = first_number + second_number;
        int difference = first_number - second_number;
        int product = first_number * second_number;
        double quotient = 1.0 * first_number / second_number;
        System.out.println(first_number + " + " + second_number + " = " + sum);
        System.out.println(first_number + " - " + second_number + " = " + difference);
        System.out.println(first_number + " * " + second_number + " = " + product);
        System.out.println(first_number + " / " + second_number + " = " + quotient);





    }
}
