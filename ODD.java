import java.util.Scanner;
 class ODD
{
	public static void main (String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int m=s.nextInt();
	System.out.println("enter the number");
	int n=s.nextInt();
	for(int i=m;i<=n;i++)
	{
		if(i%2==1)
		{
		System.out.print(i +"\n");
		i++;
		
		}
	}

	}
}

