public class CoinTester
{
    public static void main(String[] args) {

       //Create your program here
       Coins w = new Coins(4, 3, 2, 1);
       //q,d,n,p
       //+2,+3,,+1
       
       w.addQuarter();
       w.addQuarter();
       
       w.addDime();
       w.addDime();
       
       w.addPenny();
       
       w.bankCount();
       w.bankValue();
    }
}