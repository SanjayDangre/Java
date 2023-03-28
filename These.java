class These{
	int a,b;
	These(int a,int b){
		this.a=a;
		this.b=b;
	}
	void display(){
		System.out.println("a="+a+" b="+b);
	}
	public static void main(String[] args) {
		These obj=new These(40,80);
		obj.display();
	}
}