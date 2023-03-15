import java.util.Scanner;
class SS3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int n=sc.nextInt();
		if(n<0){
		    System.out.println("The Number is Negative");
		}if(n>0){
		    System.out.println("The Number is Positive");
		}
		else {
		     System.out.println("The Number is Zero");
		}
	}
}