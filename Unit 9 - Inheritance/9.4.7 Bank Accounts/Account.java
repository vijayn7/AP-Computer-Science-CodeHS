public class Account
{
    private String name;
    private double balance;
    
    // Initialize values in constructor
    public Account(String clientName, double openingBal){
       name = clientName;
       balance = openingBal;
    }
    
    // Complete the accessor method
    public double getBalance(){
        return balance;
    }
    
    // Add amount to balance
    public void deposit(double amount){
       balance += amount;
    }
    
    // Subtract amount from balance
    public void withdrawal(double amount){
        balance -= amount;
    }
    
    // Should read: Regular account with a balance of $__.__
    public String toString(){
       return "Regular account with a balance of $" + balance;
       
    }
}