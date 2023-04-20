package newPro;
import java.util.Scanner;
public class Atm_interface
{
    public static void main(String args[] )
    { 
        int balance = 5000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Your account balance is  "+ balance);
        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Transfer");
            System.out.println("Choose 4 for Transaction History");
            System.out.println("Choose 5 to exit the ATM operation");
            System.out.print("Choose the operation you want to perform:");
            int n = sc.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = sc.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully deposited");
                System.out.println("");
                System.out.println( " Your updated account balance is "+ balance);
                break;
 
                case 3:
                System.out.println("Enter the account number of the nominee");
                int acc=sc.nextInt();
                System.out.println("The account number of the nominee is "+ acc);
                System.out.println("Enter the amount in rupees you want to transfer");
                int amount=sc.nextInt();
                if(amount<=balance){
                    System.out.println("Your amount of "+ amount+" has been successfully transferred ");
                }
                else{
                    System.out.println("Insufficient balance");
               
                }
                break;

                case 4:
                System.out.println("Transaction history");
                System.out.println("your recent transaction was of ");
                //Sorry I could not perform this operation if you could guide me through this it will be of great help
                break;
 
                case 5:
                System.exit(0);
            }
        }
    }
}