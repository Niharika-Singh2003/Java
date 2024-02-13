import java.util.Scanner;

class bank {
    private int accountno;
    String accName;
    float balance;
    Scanner jin = new Scanner(System.in);

    
    public bank() {
        System.out.println("Enter the account number");
        accountno = jin.nextInt();
        jin.nextLine();

        System.out.println("Enter account holder name");
        accName = jin.nextLine();

        System.out.println("Enter the Account Balance");
        balance = jin.nextFloat();
    }

    public void cashWithdrawal() {
        float amount;
        System.out.println("Enter the amount you want to withdraw from your account");
        amount = jin.nextFloat();
        balance -= amount;
        System.out.println("Amount debited from your account successfully");
    }

    public void cashDeposit() {
        float amount;
        System.out.println("Enter the amount you want to deposit");
        amount = jin.nextFloat();
        balance += amount;
        System.out.println("Amount credited to your account successfully");
    }

    public void checkBalance() {
        System.out.println(balance + " is the amount in your account with name " + accName +
                " and account number " + accountno);
    }
} // end of bank class

class useBank {
    public static void main(String[] args) {
        // Creating an object of the bank class will invoke the constructor
        bank obj = new bank();

        // Checking balance after account registration
        obj.checkBalance();

        System.out.println("Balance before cash deposit");
        obj.cashDeposit();

        // Checking balance after cash deposit
        System.out.println("Balance after cash deposit");
        obj.checkBalance();

        // Performing cash withdrawal
        obj.cashWithdrawal();

        // Checking balance after cash withdrawal
        System.out.println("Balance after cash withdrawal");
        obj.checkBalance();
    }
}














































// import java.util.Scanner;


// class bank
// {
// private int accountno;
// String accName;
// float balance;
// Scanner jin = new Scanner(System.in);



// public void registerAccount()
// {

// System.out.println("enter the account number");
// accountno = jin.nextInt();

// jin.nextLine();

// System.out.println("Enter account holder name");
// accName = jin.nextLine();

// System.out.println("Enter the Account Balance");
// balance = jin.nextFloat();

// }


// public void cashWidrawl()
// {
// float amount;
// System.out.println("enter the amount you want to withdraw from your account");
// amount = jin.nextFloat();
// balance -= amount;
// System.out.println("amont debited from your account succesfully");
// }




// public void cashdeposit()
// {
// float amount;
// System.out.println("enter the amount you want to deposit");
// amount = jin.nextFloat();
// balance += amount;
// System.out.println("amount credited to your account succesfully");
// }



// public void checkbalance()
// {
// System.out.println(balance + " is the amount in your account with name " + accName + " and account number " + accountno );

// }
// } // end fo bank class


// class usebank
// {
// public static void main(String[] args)
// {
// bank obj =  new bank();
// obj.registerAccount();
// obj.checkbalance();
// System.out.println("Balance before cash deposit");
// obj.cashdeposit();
// System.out.println("Balance after cash deposit");
// obj.checkbalance();
// obj.cashWidrawl();
// System.out.println("Balance after cash withDrawl");
// obj.checkbalance();
 
// }
// }