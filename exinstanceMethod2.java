class exinstanceMethod2 
{
	public static void main(String[] args) 
	{
		exinstanceMethod2 str = new exinstanceMethod2();
		str.print("Result(+,/) = "+(10+5)+","+(10/2d));
	}

	public void print(String arg)
	{
		System.out.println(arg);
	}

	public void print(int arg)
	{
		System.out.println(arg);
	}

	public void print(double arg)
	{
		System.out.println(arg);
	}
}
