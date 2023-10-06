//Java Program to illustrate the use of break statement    
//inside an inner loop   
public class star
 {  
	public static void main(String[] args) 
	{  
               
            for(int i=1;i<=3;i++)
		{    
                      
                    for(int j=1;j<=3;j++)
			{    
                        if(i==2&&j==2)
			{    
                              
                            //continue;    
                        }    
                        System.out.println(i+" "+j);    

                   	 }  
			continue;  
           	 }    
	}  
} 