import java.util.Scanner;
public class Exception_Handling_TCF
{
	public static void main(String[] args)
	{
		int a,b,c;
		char ch;
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter two numbers");
			a = in.nextInt();
			b = in.nextInt();
			try
			{
				c=a/b;
				System.out.println(a+" / "+b+" = "+c);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception has occured");
				System.out.println(e);
			}
			finally
			{
				System.out.println("The program has been executed");
			}
			System.out.println("Do you want to continue? Y/N");
			ch=in.next().charAt(0);
			if(ch=='n'||ch=='N')
			{
				System.out.println("Exiting from the program...");
				break;
			}
		}
	}
}