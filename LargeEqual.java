import java.util.Scanner;
class SS3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Number:");
		int A=sc.nextInt();
    	int B=sc.nextInt();
		int C=sc.nextInt();
		int Big=0;
		if(A>B){
		    if(A>C){
		        Big=A;
		    }
		    else{
		        Big=C;
		    }
		}		
		if(B>A){
		        if(B>C){
		            Big=B;
		        }
		        else{
		            Big=C;
		        }
		}
		if(C>A){
		        if(C>B){
		            Big=C;
		        }
		        else {
		            Big=B;
		        }
		}
		else{
		      Big=A;
		      System.out.println("The Number are equal");
		        }	
		System.out.println("The Big Number is "+Big);
	}
}