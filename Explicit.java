class Narrowing{
    public static void main(String[] args){
        double d = 200.06; 
        long I = (long)d; 
        //explicit type casting
        int i = (int)I; 
        //explicit type casting
        System.out.println("Double Data type value "+d);
         //fractional part lost
         System.out.println("Long Data type value "+I); 
         //fractional part lost
         System.out.println("Int Data type value "+i);
         }
}
