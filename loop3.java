class loop3{
	public static void main(String[] args) {
		for(int i=1;i<=4;++i){
		    for(int j=1;j<=4;++j){
		        if(i==2 && j==2){
		            System.out.print(" ");
		            continue;
		        }
		        System.out.print(i);
		    }
		    System.out.println( );
		}		
	}
}