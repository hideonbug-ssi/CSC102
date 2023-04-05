public class Q1{
  public static void main(String[] args){

	java.util.Scanner scan = new java.util.Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
    
    if(b>a && a>c || c>a && a>b){
        System.out.print(a);
    }
    if(a>b && b>c || c>b && b>a){
        System.out.print(b);
    }
    if(a>c && c>b || b>c && c>a){
        System.out.print(c);
    }
    scan.close();
  }
}