import java.util.*;
class Account
{
    String customerName;
    String accountNumber;
    double balance;
    public Account(String customerName, String accountNumber, double initialBalance) 
   {
    this.customerName = customerName;
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
    }
    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
     public void displayBalance() 
    {
        System.out.println("Current Balance: " + balance);
    }
    public void withdraw(double amount) 
	{
        if (amount <= balance)
		{
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            }
        else 
		{
            System.out.println("Insufficient balance for withdrawal.");
        
       	}
    }
     public double getBalance()
    {
        return balance;
    }
}
class SavingsAccount extends Account {
    double interestRate=0.08;
    public SavingsAccount(String customerName, String accountNumber, double initialBalance) 
 {
        super(customerName, accountNumber, initialBalance);
    }
    public void addInterest() {
        double interest = balance * interestRate;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}
class CurrentAccount extends Account {
    double MIN_BALANCE = 500.0;
    double SERVICE_CHARGE = 50.0;
    public CurrentAccount(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, initialBalance);
    }
     public void withdraw(double amount) 
	{
        if (amount > balance) 
		{
            System.out.println("Insufficient balance for withdrawal.");
        	}
        if (balance - amount < MIN_BALANCE) 
		{
            System.out.println("Minimum balance violation. Service charge applied.");
            balance -= SERVICE_CHARGE; // Apply service charge
            System.out.println("Service charge: " + SERVICE_CHARGE);
        	}
    }
}
class Bank
{
public static void main(String []args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the customer name :");
	String name=s.next();
	System.out.println("Enter the Account Number :");
	String accNum=s.next();
	System.out.println("Enter the Account Balance :");
	double balance=s.nextDouble();
	System.out.println("Select the Account type \n1.Savings \n2.Current");
	int opt=s.nextInt();
	boolean exit=false;
	if(opt==1)
	{
		SavingsAccount sav=new SavingsAccount(name,accNum, balance);
		while(!exit)
			{
				System.out.println("-------MENU-------");
				System.out.println("1.Deposit \n2.Withdraw \n3.Compute Interest \n4.Display Details \n5.Exit");
				int choice=s.nextInt();
				switch(choice)
					{
						case 1:
							System.out.println("Enter the deposit amount");
							double amount=s.nextDouble();
							sav.deposit(amount);
							break;
						case 2:
							System.out.println("Enter the withdrawal amount");
							double w_amount=s.nextDouble();
							sav.withdraw(w_amount);
							break;
						case 3:
							sav.addInterest();
							break;
						case 4:
							sav.displayBalance();
							break;
						case 5:
							exit=true;
					}
			}
	}
	else if (opt==2)
		{
			CurrentAccount cur=new CurrentAccount(name,accNum, balance);
			while(!exit)
				{
					System.out.println("-------MENU-------");
					System.out.println("1.Deposit \n2.Withraw \n3.Compute Interest \n4.Display Details \n5.Exit");
					int choice=s.nextInt();
					switch(choice)
					{
						case 1:
							System.out.println("Enter the deposit amount");
							double amount=s.nextDouble();
							cur.deposit(amount);
							break;
						case 2:
							System.out.println("Enter the withdrawal amount");
							double w_amount=s.nextDouble();
							cur.withdraw(w_amount);
							break;
						case 3:
							System.out.println("Cannot Compute Interest for Current Account");
							break;
						case 4:
							cur.displayBalance();
							break;
						case 5:
							exit=true;
					}
				}
		}
	}
}
