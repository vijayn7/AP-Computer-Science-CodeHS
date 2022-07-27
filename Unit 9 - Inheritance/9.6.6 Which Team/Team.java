public class Team {

    private String name;
    private String location;
    private int wins;
    private int losses;

	public Team(String name, String location, int wins, int losses) {
		this.name = name;
		this.location = location;
		this.wins = wins;
		this.losses = losses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

    public String toString(){
        return wins + " - " + losses;
    }
}