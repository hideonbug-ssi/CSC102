public class Q5 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        if (num <= 1)
            System.out.println("No");
        else {
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println("Yes");
            else
                System.out.println("No");
            sc.close();
        }
    }
}
