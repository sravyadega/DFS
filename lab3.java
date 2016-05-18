import java.util.*;
class lab3
{

    public static void main (String args[]) 
    {
	Scanner input = new Scanner(System.in);
	String s1;
	System.out.println("\n\t\t\t\tSum Of Digits");
	System.out.println("\t\t\t\t~~~~~~~~~~~~~");
	do
      	{
	   System.out.print("\n\t\t\t    Enter the Number : ");
           s1 = input.next();
      	}while (s1.equals(""));
		
        int n,s,b,temp;
	try
	{
	   n=Integer.parseInt(s1);
	   temp=n;
	   s=0;
	   while (n!=0)
	   {
	     b=n%10;
	     s=s+b;
	     n=(int)n/10;
 	   }
 	   System.out.println("\n\t\t\t\t    Output");
	   System.out.println("\t\t\t\t    ~~~~~~");
          System.out.println("\n\t\t\tThe Sum of the digits of '"+temp+"' is: "+s);
	}
  	catch(NumberFormatException e)
	{
	    System.out.println("\n\t\t\t\tInvalid Input!..");
	}
    }
}
