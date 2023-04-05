public class Q25 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = 1; i <= b - a + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(b - j + " ");
            }
        }
        System.out.println();
    }
}
