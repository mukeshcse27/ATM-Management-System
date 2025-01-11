import java.util.*;

class Atm
{
    public static void main (String [] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Welcome to ATM");
       System.out.println("Enter PIN");
       int pin=sc.nextInt();
       int balance=10000;
       int withdrawal=0;
       int deposit =0;
       if (pin==1234)
       {
        System.out.println("Select Any one option");
        System.out.println("Check Bank balance>--press 1");
        System.out.println("deposit money--press 2");
        System.out.println("Withdrawal money--press 3");
         System.out.println("Press valid option:");
         int opt=sc.nextInt();
         if (opt==1)
         {
            System.out.println("your remaining balance is :"+balance);
         }
         else if (opt==2)
         {
            System.out.print("enter amount for deposit:");
            int dep=sc.nextInt();
            balance=balance+dep;
            System.out.println("Balance is :"+balance);

         }
         else if (opt==3)
         {
             System.out.print("enter amount for withdrawal :");
             int with=sc.nextInt();
             balance=balance-with;
             System.out.println(" Balance is: "+balance );
         }
        else 
        {
            System.out.println("invalid option!!");
        }

       }
       else
       {
        System.out .println("Incorrect pin!!");
       }
    }
}
