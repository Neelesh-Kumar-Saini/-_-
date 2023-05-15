import java.util.Scanner;

class ATM{
    public static void main(String[] args)
    {
        int currBalance = 10000, withdraw = 0, deposit = 0;
        int ATMpin = 1234;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to SBI ATM ");
            System.out.println("PLEASE INSERT YOUR ATM CARD");
            System.out.println("ENTER YOUR ATM PIN");

            int pin = sc.nextInt();

            if (pin==ATMpin){
                while(true)
                {
                
                    System.out.println("Select option 1 for Balance");
                    System.out.println("Select option 2 for Withdraw");
                    System.out.println("Select option 3 for Deposit");
                    System.out.println("Select option 4 for Transfer");
                    System.out.println("Select option 5 for Exit");

                    int op = sc.nextInt();

                switch(op)
                {
                    case 1:
                        System.out.println("Your Account balance is: "+currBalance);
                        break;

                    case 2:
                        System.out.println("Enter Withdrawal amount ");
                        withdraw = sc.nextInt();

                        if(currBalance>=withdraw)
                        {
                            currBalance= currBalance - withdraw;
                            System.out.println("Please collect the cash");
                        }

                        else
                        {
                            System.out.println("Oops...Your account doesn't have sufficient amount to withdraw");
                        }

                        break;

                    case 3: 

                        System.out.println("Enter the amount to be deposited in your account");
                        deposit = sc.nextInt();
                        currBalance += deposit;
                        System.out.println("Your account has been successfully deposited in your account");
                        break;

                    case 4:
                        System.out.println("Please enter the amount you want to transfer: ");
                        int amount = sc.nextInt();

                        if(amount > currBalance)
                        System.out.println("Oops!!! The Balance is insufficient in your account");
                        else
                        {
                            System.out.println("The amount has been transferred successfully");
                            currBalance = currBalance - amount;
                        }

                        break;

                    case 5:

                        System.out.println("Please collect the card");
                        System.out.println("Thank you for using ATM");
                        break;
                        
                    default:
                    {
                        System.out.println("Please select the correct option... ");
                    }
                }
            
                }
            }
            
            else 
            {
                System.out.println("Please enter the correct ATM pin");
            }
        }
    }

}