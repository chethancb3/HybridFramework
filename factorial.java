import java.util.Scanner;
class factorial
{
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int b=s.nextInt();
		for (int i=(b-1);i>=1;i--)
		{
		b= b*i;
		System.out.println(b);
		}
		
		
	}

}