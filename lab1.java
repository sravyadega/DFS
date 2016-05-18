import java.io.*;
import java.util.*;
class lab1
{
   public static void main(String args[])
   {
      
      Scanner input = new Scanner(System.in);
      String s1,s2;
      System.out.println("\n\t\tCheck whether two strings are equal or not");
		                  System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      do
      {
	 System.out.print("\n\t\t\t Enter the First string : ");
         s1 = input.next();
      }while (s1.equals(""));

      do
      {
	 System.out.print("\n\t\t\t Enter the Second string : ");
         s2 = input.next();
      }while (s2.equals(""));

      
      int l1,l2,i,flag=0;
      l1 = s1.length();
      l2 = s2.length();
      
	System.out.println("\n\t\t\t\tOUTPUT");
        System.out.println("\t\t\t\t******");
      
	if(l1==l2)
        {
         for(i=0;i<l2;i++)
         {
             if(s1.charAt(i)==s2.charAt(i))
                flag=0;
             else
             {
                flag=1;
                break;
             }
          }
        }
        else
          flag=1;
       
	
       if(flag==1)
          System.out.println("\n\t\t\tThe two strings are not equal!!!");
       else
          System.out.println("\n\t\t\tThe two strings are equal!!!");
   }
}

