public class StudentAccount extends Account
{
    // Complete this class with Override methods.   
    
    public StudentAccount(String studentName, double openingBal){
        super(studentName, openingBal);
    }
    
    // Students get a $1 bonus on depositing
    public void deposit(double amount){
       super.deposit(amount + 1);
    }
    
    // Students pay a $2 fee for withdrawing
    public void withdrawal(double amount){
        super.withdrawal(amount + 2);
    }
    
    // toString() Should read: Student account with a balance of $__.__
    public String toString(){
       return "Student account with a balance of $" + super.getBalance();
       
    }
}