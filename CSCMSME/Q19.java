import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(); // number of queries

        // Process each query
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int m = sc.nextInt();

            // Calculate (a^b) mod m using fast modular exponentiation
            long result = 1;
            while (b > 0) {
                if (b % 2 == 1) {
                    result = (result * a) % m;
                }
                a = (int) ((long) a * a % m);
                b /= 2;
            }
            System.out.println(result);
        }
        sc.close();
    }
}
