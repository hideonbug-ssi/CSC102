import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alp = input.nextLine().toLowerCase();
        int res = 0;
        int var = alp.length();
        for (int i = 0; i < var; i++) {
            if ((int) alp.charAt(i) < 123 && (int) alp.charAt(i) > 96) {
                res = res + (int) alp.charAt(i) - 96 - i;
            }
        }
        System.out.println(res);
        input.close();
    }
}
