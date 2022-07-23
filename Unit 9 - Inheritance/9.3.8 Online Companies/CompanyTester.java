public class CompanyTester
{
    public static void main(String[] args)
    {
        Company c = new Company("Name");
        OnlineCompany o = new OnlineCompany("Name", "Website");
        System.out.println(c.toString());
        System.out.println(o.toString());
    }
}