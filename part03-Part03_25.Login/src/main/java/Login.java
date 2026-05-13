
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        String savedName1 = "alex";
        String savedName2 = "emma";
        String savedPassword1 = "sunshine";
        String savedPassword2 = "haskell";

        if (savedName1.equals(username) && savedPassword1.equals(password)) {
            System.out.println("You have successfully logged in!");
        }else if (savedName2.equals(username) && savedPassword2.equals(password)) {
            System.out.println("You have successfully logged in!");
        }else {
            System.out.println("Incorrect username or password!");
        }
    }
}
