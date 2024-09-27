//Dannah Janelle M. Tiamson | Exercise No. 3

package package3;
import java.util.regex.*;
import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\tPassword Checker");
        System.out.println("==============================\n");
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();

        if (isPasswordValid(password, confirmPassword)) {
            System.out.println("==============================");
            System.out.println("Password is valid.");
        } else {
            System.out.println("==============================");
            System.out.println("Password is invalid.");
        }
    }

    public static boolean isPasswordValid(String password, String confirmPassword) {
        if (password == null || password.isEmpty()) {
            System.out.println("\nPassword cannot be empty.");
            return false;
        }

        if (password.length() < 8 || password.length() > 20) {
            System.out.println("\nPassword must be between 8 to 20 characters.");
            return false;
        }

        if (!password.equals(confirmPassword)) {
            System.out.println("\nPasswords do not match.");
            return false;
        }

        if (!Pattern.compile("[a-z]").matcher(password).find()) {
            System.out.println("\nPassword must contain at least one lowercase letter.");
            return false;
        }

        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            System.out.println("\nPassword must contain at least one uppercase letter.");
            return false;
        }

        if (!Pattern.compile("[0-9]").matcher(password).find()) {
            System.out.println("\nPassword must contain at least one digit.");
            return false;
        }

        if (!Pattern.compile("[!@#$%^&*()-_=+?]").matcher(password).find()) {
            System.out.println("\nPassword must contain at least one symbol.");
            return false;
        }

        return true; //password is valid, all pass
    }
}