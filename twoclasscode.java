import java.util.Scanner;
class Arithmatic{
    public void add(int a,int b){
        System.out.println("The addition is :"+(a+b));
    }
    public void sub(int a,int b){
        System.out.println("The subtraction is :"+(a-b));
    }
    public void mul(int a,int b){
        System.out.println("The multiplication is :"+(a*b));
    }
     public void div(int a,int b){
        System.out.println("The division is :"+(a/b));
     }
}
class Main{
        public static void main(String[]args){
             Scanner sc=new Scanner(System.in);   
            System.out.println("Enter Any Two Number");           
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            Arithmatic obj=new Arithmatic();  
            obj.add(n1,n2);
            obj.sub(n1,n2);
            obj.mul(n1,n2);
            obj.div(n1,n2);             
        }
}
            
        
    
    