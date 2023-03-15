import java.util.Scanner;
class SS1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        if(n%2==0){
           System.out.println("The no. is even");
        }
        else{
           System.out.println("The no. is odd");
        }
    }
}
           
            