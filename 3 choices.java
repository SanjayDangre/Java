import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the Choice");
		   System.out.println("1.Square\n2.Cube\n3.Check Leap Year");
		   int n=sc.nextInt();
		   switch(n) {
		       case 1:
		           System.out.println("Enter Any Number");
		           int A=sc.nextInt();
		           System.out.println("The Square is"+(A*A));
		           break;
		           case 2:
		               System.out.println("Enter Any Number");
		               int B=sc.nextInt();
		               System.out.println("The Cube is"+(B*B*B));
		               break;
		               case 3:
		               System.out.println("Enter Any Year");
		               int C=sc.nextInt();
		                 if(C%4==0){
		                     System.out.println("The year is Leap ");
		                 }
		                 else{
		                     System.out.println("The year is not Leap");
		                 }  
		   }
	}
}