public class BillboardTester
{
    public static void main(String[] args)
    {
        Billboard top10 = new Billboard();
        top10.add(new Musician("Beyonce", 316, 100000000));
        top10.add(new Musician("The Beatles", 365, 600000000));
        top10.add(new Musician("Drake", 425, 150000000));
        top10.add(new Musician("Pink Floyd", 34, 250000000));
        top10.add(new Musician("Mariah Carey", 287, 200000000));
        top10.add(new Musician("Rihanna", 688, 250000000));
        top10.add(new Musician("Queen", 327, 170000000));
        top10.add(new Musician("Ed Sheeran", 536, 150000000));
        top10.add(new Musician("Katy Perry", 317, 143000000));
        top10.add(new Musician("Justin Bieber", 398, 140000000));

        //This musician should not be added to the top10 because they don't have enough records sold        
        top10.add(new Musician("Karel the Dog", 332, 60));
        
        //This musician should replace the artist with the least Weeks on the top 40 charts.
        top10.add(new Musician("Tracy the Turtle", 332, 150000000));
        
        //This musician should not replace an artist, but is a Platinum artist
        top10.add(new Musician("Alex Eacker", 100, 23400000));
        
        top10.printTop10();


    } 
}