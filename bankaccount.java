import java.util.*;
interface atm
{
   void withdraw(double amount);
   void deposit(double amount);
   void checkBalance();
}
class bankaccount implements atm
{
 double balance;
  bankaccount(double balance)
 {
    this.balance=balance;
 }
 public void deposit(double amount)
 {
   balance=balance+amount;
   System.out.println("Deposited:New balance="+balance);
 }
 public void withdraw(double amount)
 {
   if(amount<=balance)
   {
   balance=balance-amount;
   System.out.println("Withdrawen:New balance="+balance);
 }
 else
 System.out.println("Insufficient balance");
}
public void checkBalance()
{
   System.out.println("Balance="+balance);
}
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   double balance,amount;
   int ch;
   System.out.println("enter the account balance");
   balance=sc.nextDouble();
   bankaccount obj=new bankaccount(balance);
   System.out.println("enter 1 for depositing,2 for withdrawal and 3 for checking the balance");
   System.out.println("enter the choice");
   ch=sc.nextInt();
   switch(ch)
   {
    case 1: System.out.println("enter the amount to be deposited ");
            amount=sc.nextDouble();
            obj.deposit(amount);
            break;
    case 2: System.out.println("enter the amount to be withdrawen ");
            amount=sc.nextDouble();
            obj.withdraw(amount);
            break; 
    case 3: obj.checkBalance();
            break; 
    default: System.out.println("Invalid choice");                     
}
}
}