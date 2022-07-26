import java.util.*;
public class CompanyTester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Company> companies = new ArrayList<Company>();
        
        while(true) {
            System.out.print("Please enter a company name, enter 'exit' to quit: ");
            String name = sc.nextLine();
            if(name.equals("exit")) {
                break;
            }
            System.out.print("Is this an online company, 'yes' or 'no': ");
            String online = sc.nextLine();
            if(online.equals("yes")) {
                System.out.print("Please enter the website address: ");
                String website = sc.nextLine();
                Company company = new OnlineCompany(name, website);
                companies.add(company);
            }
            else {
                System.out.print("Please enter the street address: ");
                String streetAddress = sc.nextLine();
                System.out.print("Please enter the city address: ");
                String city = sc.nextLine();
                System.out.print("Please enter the state address: ");
                String state = sc.nextLine();
                
                Company company = new Company(name, streetAddress, city, state);
                companies.add(company);
            }
        }
        for(Company company : companies) {
            System.out.println(company.toString());
            System.out.println("");
        }
    }
}