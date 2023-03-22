class Static3{
	static int i=5;
	static public void show(){
		System.out.println(i);
	}

	static{
		show();
	}
	public static void main(String[] args) {
		i++;
		System.out.println(i);
	}
}