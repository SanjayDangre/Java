import java.util.Scanner;
class SumSeries2{
	public static void main(String[] args) {
		int sum=0;
		for (int no=1;no<=15;++no) {
			if (no%2==0) {
				sum=sum+no;
			}
		}
		System.out.print("The Sum is "+sum);
	}
}
