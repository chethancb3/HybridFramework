import java.util.Scanner;
class fibonacci
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter the number");
	int a=s.nextInt();
	int n1=0;
	int n2=1;
	 
	for (int i=1; i<=a; i++)
		{
	 	int n3= n1+n2;
		System.out.println( n3);
		
		n1=n2;
		n2=n3;
		}
	
	}
}