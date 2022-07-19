public class PlayerTester
{
    public static void main(String[] args) {
       
       //Start here
       BasketballPlayer lj = new BasketballPlayer("Lebron James","team");
       BasketballPlayer mj = new BasketballPlayer("Michael Jordan");
       
       lj.addGame(100, 30);
       mj.addGame(69, 69);
       lj.addGame(100, 30);
       mj.addGame(69, 69);
       lj.addGame(100, 30);
       mj.addGame(69, 69);
       lj.addGame(100, 30);
       mj.addGame(69, 69);
       
       System.out.println("Lebron James Stats");
       lj.printPPG();
       lj.printAPG();
       System.out.println(lj);
       
       System.out.println();
       
       System.out.println("Michael Jordan Stats");
       mj.printPPG();
       mj.printAPG();
       System.out.println(mj);
    }
}