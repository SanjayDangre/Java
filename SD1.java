class StringDemo1{
	public static void main(String[] args) {
		String s1="Sanjay";
		boolean b=s1.equalsIgnoreCase("sanjay");
		System.out.println(b);
		System.out.println(s1.equalsIgnoreCase("Sanjay"));
		String s2="Manoj";
		boolean b1=s1.equalsIgnoreCase(s2);
		System.out.println(b1);
	}
}