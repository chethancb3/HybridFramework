import java.util.Scanner;
class F
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=n-1; i>=1; --i)
		{
			n=n*i;
			
		}
	System.out.println(n);
	}
}