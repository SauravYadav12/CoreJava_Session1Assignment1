class Sum{
	
	public static void main(String[] args)
	{
		int a , b, c;

		System.out.println("Enter the First No :");
		a = Integer.parseInt(System.console().readLine());

		System.out.println("Enter the Second No :");
		b = Integer.parseInt(System.console().readLine());

		c = a-(-b);

		System.out.println("The sum of" + a + "and" + b +"is :" + c);

	}
}