class exoverloadStatic 
{
	public static void main(String[] args) 
	{
		print("Result : "+(10+2));
	}

	public static void print(String arg)
	{
		System.out.println(arg);
	}

	public static void print(int arg)
	{
		System.out.println(arg);
	}

	public static void print(double arg)
	{
		System.out.println(arg);
	}
}
