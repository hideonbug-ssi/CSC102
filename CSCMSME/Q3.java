import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		long fact = 1;
		if(num<0)
			System.out.println("error");
		
		else if(num<=1)
			System.out.println(num);
		
		else {
			for(int counter = num; counter >= 2; counter-- ) {
				fact = fact * counter;
			}
			System.out.println(fact);
		}
	}
}
