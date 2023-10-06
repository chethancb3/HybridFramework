import java.util.Scanner;
class sum
{
	public static void main (String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int m=s.nextInt();
	System.out.println("enter another number");
	int n=s.nextInt();
	int sum=0;

		for (int i=m;i<=n;i++)
		{
		sum=sum+i;
			
		}
		System.out.println("summation of entered numbers"+sum);
	}

}