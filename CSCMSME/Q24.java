import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine().toLowerCase();
        char guess = input.nextLine().charAt(0);
        input.close();
        int index;
        int result = 0;
        int[] nums = new int[word.length()];

        for (index = word.indexOf(guess); index >= 0; index = word.indexOf(guess, index + 1)) {
            nums[result] = index;
            result++;
        }

        if (result != 0) {
            System.out.println(result);
            for (int i = 0; i < result; i++) {
                System.out.print(nums[i]);
                if (i != result - 1) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.println("ERROR");
        }
    }
}
