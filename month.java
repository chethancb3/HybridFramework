import java.util.Scanner;
class month
{
	public static void main (String [] args)
	{
	Scanner s= new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	
	if (n>0 || n>12)
	{
	System.out.println(" entered number month is valid");
	
	}
	else
	System.out.println(" entered number month is invalid");
	
	
	}
}