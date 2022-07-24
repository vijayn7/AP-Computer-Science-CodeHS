public class EmployeeTester
{
    public static void main(String[] args)
    {
        HourlyEmployee h = new HourlyEmployee("name", 9.50, 40);
        Employee w = new Employee("name", 120000);
        System.out.println(h);
        System.out.println(w);
    }
}