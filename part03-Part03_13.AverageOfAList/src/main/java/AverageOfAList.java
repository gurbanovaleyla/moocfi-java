
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            list.add(number);
        }
        double count = list.size();
        double sum = 0;
        for(int number: list) {
            sum += number;
        }
        System.out.println("Average: " + (sum / count));
        
    }
}
