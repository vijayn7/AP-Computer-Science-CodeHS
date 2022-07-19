public class WebsiteTester
{
    public static void main(String[] args)
    {
        // Start here!
        
        Website good = new Website("goodSchool", "edu", 0);
        Website codehs = new Website("codehs", "com", 1000000);
        Website com = new Website();
        
        System.out.println(good);
        System.out.println(codehs);
        System.out.println(com);
    }
}