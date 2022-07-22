public class BookTester
{
    public static void main(String[] args)
    {
        Fiction hungerGames = new Fiction();
        
        hungerGames.setPages(374);
        hungerGames.setName("The Hunger Games");
        hungerGames.setAuthor("Suzanne Collins");
        
        Dict websters = new Dict();
        websters.setPages(720);
        websters.setName("Webster's Dictionary");
        websters.setWords(171476);
        
        System.out.println(hungerGames.getName());
        System.out.println(websters.getName());
    }
}