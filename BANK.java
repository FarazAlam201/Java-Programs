import java.util.Date;
 class Account{
	private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    //Constructors
    Account(){
    id=0;
    balance=0;
    annualInterestRate=0;
    dateCreated= new Date();
    }
    /** constructor that creates an account with the specified id and initial balance.*/
    public Account(int id, double balance){
    this.id= id;
    this.balance= balance;
    dateCreated= new Date();
    }
public int getId(){return id; }
public void setId(int id){this.id= id;}
public double getBalance(){return balance;}
public void setBalance(double balance){this.balance= balance;}
public double getAnnualInterestRate(){return annualInterestRate;}
public void setAnnualInterestRate(double annualInterestRate){
this.annualInterestRate= annualInterestRate;}
/**accessor method for dateCreated*/
public Date getDateCreated(){return dateCreated;}
/**method named getMonthlyInterestRate() that returns the monthly interest rate.*/
public double getMonthlyInterestRate(){return annualInterestRate/12;}
/**method named getMonthlyInterest() that returns the monthly interest.*/
public double getMonthlyInterest(){
        return balance*(getMonthlyInterestRate()/100);
    }
/**method named withdraw that withdraws a specified amount from the account.*/
public double withdraw(double amountToWithdraw){
balance-=amountToWithdraw;
return balance;}	
    /**method named deposit that deposits a specified amount to the account.*/
public double deposit(double amountToDeposit){
balance+=amountToDeposit;
return balance;
    }
}
public class BANK{
public static void main (String [] args){
Account obj= new Account(1122, 20000);
obj.setAnnualInterestRate(4.5);
System.out.println("Account ID: " + obj.getId());
System.out.println("Balance: " + obj.getBalance());
System.out.println("WithDraw Amount: " + obj.withdraw(2500));
System.out.println("Deposit Amount: " + obj.deposit(3000));
System.out.println("Monthly Interest: " + obj.getMonthlyInterest());
System.out.println("Date account was created: "+ obj.getDateCreated());
    	}
}
