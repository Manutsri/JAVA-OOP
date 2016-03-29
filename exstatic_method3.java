import java.util.Scanner;
class exstatic_method3 
{
	public static void main(String[] args) 
	{
		sum(result);
	}

public static void sum(int result)
	{
		int a, b;
		Scanner stdIn = new Scanner(System.in);

		a = stdIn.nextInt();
		b = stdIn.nextInt();

		result = a + b;

		System.out.println(result);
	}
}
