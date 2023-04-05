import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int total = 1;
        while (n > 1) {
            if (n % 2 != 0) {
                total++;
            }
            n /= 2;
        }
        System.out.println(total);
    }
}