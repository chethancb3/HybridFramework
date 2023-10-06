import java.util.Scanner;
class all
{
	
	public static void main(String[] args)
	{
	Scanner s= new Scanner(System.in);
	double balance =10000;
	System.out.println(" enter the operation to be performed");
	System.out.println(" 1.deposite\n2.check balance\n3.withdraw");
	int choice=s.nextInt();
	
	switch(choice)
	{

	case 1:System.out.println(" enter the amount to be deposited");
		{
		double deposite=s.nextDouble();
		balance=balance+deposite;
		System.out.println("the current updated balance "+balance);
		}
		break;
	
	case 2:System.out.println("the balance is"+balance);
	break;
	
	case 3:
	{
	System.out.println(" enter the amount to be withdrawn");
	double withdraw=s.nextDouble();

		if (withdraw>=0)
		{
			if(withdraw<=balance)
			{
			balance=balance-withdraw;
			System.out.println(" the current updated balance is"+balance);
			}
			else 
			System.out.println(" the amount that you want to withdraw is more than the balance");
		}
		else
		System.out.println("inappropriate withdraw");
	}
		break;
	
		default:System.out.println(" select the option shown above");
	
	}
	}
}

