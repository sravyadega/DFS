import java.util.*;
class lab2
{
   public static void main(String args[])
   {
      
      String str1=new String();
      Scanner input = new Scanner(System.in);
      System.out.println("\n\t\t\tReverse of the String");
      System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~");
      do
      {
	 System.out.print("\n\t\t\tEnter the string : ");
         str1 = input.next();
      }while (str1.equals(""));
      
      System.out.println("\n\t\t\t\tOUTPUT");
      System.out.println("\t\t\t\t******");
      System.out.println("\n\t\t\tEntered String : "+str1);
      System.out.print("\n\t\t\tReverse String : ");
      
      for(int i=str1.length()-1;i>=0;i--)
          System.out.print(str1.charAt(i));
      System.out.println("");
   }
}

