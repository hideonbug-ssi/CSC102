import java.util.Scanner;

public class Q11{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= (2 * n) - 1; i++) {
            for (int j = 1; j <= (2 * n) - 1; j++) {
                if (j == n - i + 1)
                    System.out.print("*");
                else if (i == 1 && j > n)
                    System.out.print("*");
                else if (j == (2 * n) - i && i <= n)
                    System.out.print("*");
                else if (j == (2 * n) - 1 && i <= n)
                    System.out.print("*");
                else if (i == n && j < n)
                    System.out.print("*");
                else if ((j == 1 || j == n) && i > n)
                    System.out.print("*");
                else if (i == (2 * n) - 1 && j < n)
                    System.out.print("*");
                else if (i > n && j == ((2 * n) - 1) - (i - n))
                    System.out.print("*");
                else if (i > n && j >= ((2 * n) - 1) - (i - n))
                    continue;
                else
                    System.out.print("-");
            }
            System.out.println();
        }
        input.close();
    }
}