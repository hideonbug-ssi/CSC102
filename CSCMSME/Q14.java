import java.util.Scanner;

public class Q14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int minInYear = 365 * 60 * 24;
    int min = input.nextInt();
    int years = (min / minInYear);
    int days = (min / 60 / 24) % 365;
    System.out.println(years + " " + days);
    input.close();
  }
}