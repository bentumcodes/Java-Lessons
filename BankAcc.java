import java.util.Scanner;

public class BankAcc {
    private String accName;
    private int accNo;
    private final double MINBALANCE = 500.00; //user min balance
    private double balance;

    BankAcc (String accName, int accNo){//this constructor set the default values 
        this.accName = accName;
        this.accNo = accNo;
        //this.balance = 0.00;
    }
    void accDisplay(){ // initial account display before deposit
        System.out.println("Your Bank details are:\n" +
                            "User ID: "+accName+ "\n"+ 
                            "Account No: "+accNo+ "\n"+
                            "Balance: " + MINBALANCE);
    }
    
    void accDisplayAfter(){
        System.out.println("Hello "+accName+ "!" + "\n"+
                            "Your new Balance details is: "+ "\n"+
                            "New Balance: "+balance +"\n"+
                            "Thanks for Banking with us!");
    }
    public  double deposit(double amt){
        this.balance = amt + MINBALANCE;
        return balance;
    }
    public double withdraw(double amtWithdraw){
            balance -= amtWithdraw;
            return balance;
        }
    void checksBal(){
        System.out.println("Hello, "+accName+ "\n"+
                            "Your current balance is: "+accSign+balance);

    }
    public void getBal(){
        double finalBal = 0.00;
    }
    char accSign = (char)(36);
    void outroMsg(){
        System.out.println("Thank you for banking with us");
    }

    public static void main(String[] args){
        //set an account
        Scanner input = new Scanner(System.in);
        System.out.println(" ");

        System.out.println("Welcome to Bentum Bank!"+"\n"+
                            "The safety of your money is our priority");
        
        System.out.println("What is Your Account ID?: ");
        String userID = input.nextLine();

        System.out.println("Enter Account Number: ");
        int accNumber = input.nextInt();
       

        //display user credentials
        BankAcc bk = new BankAcc(userID,accNumber);
        bk.accDisplay();

        System.out.println(" "); //creates a space for clarity
        
        //to deposit an amount
        System.out.println("Enter the amount to deposite: ");
        double amt = input.nextDouble();
        bk.deposit(amt);
        bk.accDisplayAfter();
         System.out.println(" ");

         //to withdraw an amount
         System.out.println("Enter the amount to Withdraw: ");
         double userWithdraw = input.nextDouble();
         bk.withdraw(userWithdraw);
         input.nextLine(); //clears old user entry to allow the next command to run
        bk.accDisplayAfter();

        System.out.println(" ");
         //to check balance
        System.out.println("Do you want to check your balance [Yes or No]");
        String userAns = input.nextLine();

        if(userAns == "yes"){

            bk.checksBal();
        }
        else ()
           bk.outroMsg();
        }
        
       
        

    }




}

