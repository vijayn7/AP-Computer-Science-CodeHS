public class BankTester
{
    public static void main(String[] args)
    {
        Account account = new Account("name", 100);
        StudentAccount stu = new StudentAccount("name", 100);
        System.out.println(account.getBalance());
        System.out.println(stu.getBalance());
        stu.deposit(10);
        account.deposit(10);
        System.out.println(account.getBalance());
        System.out.println(stu.getBalance());
        stu.withdrawal(60.0);
        account.withdrawal(60.0);
        System.out.println(account.getBalance());
        System.out.println(stu.getBalance());
    }
}