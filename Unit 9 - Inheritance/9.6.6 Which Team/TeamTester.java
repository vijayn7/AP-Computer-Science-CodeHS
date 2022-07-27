public  class TeamTester {

    public static void main(String[] args) {
        FootballTeam dolphins = new FootballTeam("Dolphins", "Miami", 8, 4, 1);
        Team cubs = new BaseballTeam("Cubs", "Chicago", 80, 65, "National");
        Team lizards = new Team("Lizards", "New York", 9, 5);

        //Print out all available information for the Dolphins
        System.out.println(dolphins.getName());
        System.out.println(dolphins.getLocation());
        System.out.println(dolphins.getWins());
        System.out.println(dolphins.getLosses());
        System.out.println(dolphins.getTies());
        System.out.println(dolphins);

        //Print out all available information for the Cubs
        System.out.println(cubs.getWins());
        System.out.println(cubs.getLosses());
        System.out.println(cubs.getName());
        System.out.println(cubs.getLocation());
        System.out.println(cubs);

        //Print out all available information for the Lizards
        System.out.println(lizards.getName());
        System.out.println(lizards.getLocation());
        System.out.println(lizards.getWins());
        System.out.println(lizards.getLosses());
        System.out.println(lizards);

    }
}