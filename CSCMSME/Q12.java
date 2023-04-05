import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        String username = scanner.nextLine();

        // Print greeting message
        System.out.println("Hello, " + username + ".");

        scanner.close();
    }
}
