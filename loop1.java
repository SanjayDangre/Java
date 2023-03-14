class loop1{
	public static void main(String[] args) {
		for(int i=1;i<=4;++i){
		    for(int j=1;j<=4;++j){
		        if(j==3){
		            continue;
		        }
		        System.out.print(i);
		    }
		    System.out.println( );
		}		
	}
}