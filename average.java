import java.util.Scanner;
class average
{
	public static void main (String [] args)
	{
	Scanner s= new Scanner(System.in);
	System.out.println("enter the number");
	float n=s.nextFloat();
	float num=n;
	for(float i=n-1; i>=1; i--)
	{
	n=n+i;
	
	}
	float avg=n/num;
	System.out.println(" average of given number is" +avg);
	
	}
}