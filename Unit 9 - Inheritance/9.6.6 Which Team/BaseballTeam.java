public class BaseballTeam extends Team {

    private String league;

	public BaseballTeam(String name, String location,
                    int wins, int losses, String league) {
		super(name, location, wins, losses);
		this.league = league;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

}