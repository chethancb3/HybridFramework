import java.util.Scanner;
class count
{
	public static void main (String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int m=s.nextInt();
	System.out.println("enter another number");
	int n=s.nextInt();
	
		if(n>m)
		{
		int counnt =n-m-1;
		System.out.println("count of numbers are" +counnt);
		}
		else
		{
		int counnt=m-n-1;
		System.out.println("count of numbers are" +counnt);
		}
}

}