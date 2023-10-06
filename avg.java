import java.util.Scanner;
class avg
{
	public static void main(String [] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value");
	int a=s.nextInt();
	int b=a;
	for(int i=1;i<=a;i++)
	{
	a=a*i;
	int average=a/b;
	
	}
	System.out.println("average of number is "+average);
	}
}