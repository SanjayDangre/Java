import java.util.Scanner;
class PP1{
    public static void main(String []args){
        Scanner obc=new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a=obc.nextInt();
        System.out.println("Enter 2nd Number:");
        int b=obc.nextInt();
        System.out.println("Enter 3rd Number:");
        int c=obc.nextInt();
        System.out.println("Enter 4th Number:");
        int d=obc.nextInt();
        System.out.println("Enter 5th Number:");
        int e=obc.nextInt();
        int big=0;
          if(a>b){
            if(a>c){
                if(a>d){
                    if(a>e){
                        big=a;
                    }else{
                        big=e;
                    }
                }
            }
        }
        if(b>a){
            if(b>c){
                if(b>d){
                    if(b>e){
                        big=b;
                       } else {
                        big=e;
                    }
                }
            }
        }
        if(c>a){
            if(c>b){
                if(c>d){
                    if(c>e){
                        big=c;
                    }else {
                        big=e;
                    }
                }
            }
        }
        if(d>a){
            if(d>b){
                if(d>c){
                    if(d>e){
                        big=d;
                    }else {
                        big=e;
                    }
                }
            }
        }
        if(e>a){
             if(e>b){
                 if(e>c){
                     if(e>d){
                         big=e;
                        } else {
                         big=d;
                     }
                 }
             }
        }
        System.out.println("Biggest no. is "+big);
    }
}
                   
             
        