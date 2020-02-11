import java.util.Scanner;
class code2
{
   public static void main(String args[])
   {
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number:");
      
      int num = scanner.nextInt();

      int fact = fact(num);
      System.out.println("Factorial of no. ="+fact);
   }
   static int fact(int n)
   {
       int output;
       if(n==1)
       {
         return 1;
       }
       
       output = fact(n-1)* n;
       return output;
   }
}