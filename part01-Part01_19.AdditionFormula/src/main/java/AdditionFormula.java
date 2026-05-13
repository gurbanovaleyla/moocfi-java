
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int first_number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second_number = Integer.valueOf(scanner.nextLine());
        int result = first_number + second_number;
        System.out.println(first_number + " + " + second_number + " = " + result);

    }
}
