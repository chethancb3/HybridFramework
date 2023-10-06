import java.util.Scanner;
class city
{
	public static void main (String [] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the city");
	String day=s.next();
	
	switch(day)
	{
		case"bengaluru" :System.out.println("In bengaluru city, the famous place is mantri mall"); 
		break;
		case"mysuru" :System.out.println("In mysuru city, the famous place is mysuru palace"); 
		break;
		case"hyderabad" :System.out.println("In hyderabad city, the famous place is charminar"); 
		break;
		case"thursday" :System.out.println("the game to be played is volleyball"); 
		break;
		case"friday" :System.out.println("the game to be played is snooker"); 
		break;
		case"saturday" :System.out.println("the game to be played is badminton"); 
		break;
		case"sunday" :System.out.println("the game to be played is hockey"); 
		break;
		default : System.out.println("enter in string the day of the week");
	}	
	}
}