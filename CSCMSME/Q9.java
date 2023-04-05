import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i;
        sc.close();
        if (a < 4) {
            System.out.println("DIE");
        } else {
            for (i = 1; i < b - 1; ++i) {
                System.out.print(i + " ");
            }
            for (i = b + 2; i <= a; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
