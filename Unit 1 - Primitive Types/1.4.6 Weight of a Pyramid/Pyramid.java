public class Pyramid 
{
    public static void main(String[] args)
    {
        int numBlocks;
        double blockweight = 2.5;
        
        numBlocks = 2500000;
        
        double sum = (numBlocks*blockweight);
        
        System.out.print("The pyramid weighs ");
        System.out.print(+ sum);
        System.out.print(" tons");
    }
}