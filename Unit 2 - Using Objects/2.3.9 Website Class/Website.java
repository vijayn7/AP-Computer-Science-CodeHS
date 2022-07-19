public class Website
{
    String domain;
    String topLevelDomain;
    int numUsers;
    
    public Website()
    {
        domain = "";
        topLevelDomain = "com";
        numUsers = 0;
    }
    
    public Website(String domainName, String topDomain)
    {
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = 0;
    }
    
    public Website(String domainName, String topDomain, int numPeople)
    {
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = numPeople;
    }

    public String toString()
    {
        String res =  "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";
        
        return res;
    }
}