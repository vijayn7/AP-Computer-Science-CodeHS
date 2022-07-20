public class BaseballTester
{
    public static void main(String[] args)
    {
        BaseballPlayer babeRuth = new BaseballPlayer("Babe Ruth", 2873, 8399);
        System.out.println(babeRuth);
        
        // Call the function printBattingAverage here
        babeRuth.printBattingAverage();
    }
}