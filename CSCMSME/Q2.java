import java.util.Scanner;

public class Q2 {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    sc.close();
    if(str1.length() > str2.length()){
    	System.out.println(str1.replace(str2,""));
    	}
    if(str2.length() > str1.length()){
    	System.out.println(str2.replace(str1,""));
    	}
	}
}
