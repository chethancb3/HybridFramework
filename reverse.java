class reverse
{
  	public static void main(String[] args) 
	{

    	int num = 198411; 
	int reverse = 0;
    
    	System.out.println("Original Number: " +num);

   
   	 while(num != 0) 
	{
      	int digit = num % 10;
      	reverse = reverse * 10 + digit;

     	num /= 10;
    	}

    	System.out.println("Reversed Number: " + reverse);
  	}
}