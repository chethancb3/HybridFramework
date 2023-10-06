import java.util.Scanner;
class weekd
{
	public static void main (String [] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the day");
	String day=s.next();
	
	switch(day)
	{
		case"monday" :System.out.println("the game to be played is cricket"); 
		break;
		case"tuesday" :System.out.println("the game to be played is football"); 
		break;
		case"wednesday" :System.out.println("the game to be played is handball"); 
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