import java.util.Scanner;

public class Q20 {
    public static void sout(int height, int width, String field[][]) {
        for (int i = height - 1; i >= 0; i--) {
            for (int j = 0; j < width; j++) {
                if (field[i][j] == null)
                    System.out.print("-");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mx = -10, width = 0;
        int[] H = new int[n + 5];
        for (int i = 0; i < n; i++) {
            H[i] = sc.nextInt();
            mx = Math.max(H[i], mx);
            width += (H[i] * 2) - 1;
        }
        int height = mx;
        String[][] field = new String[height + 10][width + 10];
        int indx = 0;
        for (int k = 0; k < n; k++) {
            int tempH = H[k];
            int tempW = (tempH * 2) - 1;
            for (int i = 0; i < tempH; i++) {
                for (int j = 0; j < tempW; j++) {
                    if (j >= i && j < tempH)
                        field[i][indx + j] = "*";
                    else if (j < tempW - i && j >= tempH)
                        field[i][indx + j] = "*";
                }
            }
            indx += (H[k] * 2) - 1;
        }
        sout(height, width, field);
        sc.close();
    }
}
