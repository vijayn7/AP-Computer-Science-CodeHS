public  class FootballTeam extends Team {

    private int ties;


	public FootballTeam(String name, String location,
                    int wins, int losses, int ties) {
		super(name, location, wins, losses);
		this.ties = ties;
	}

	public int getTies() {
		return ties;
	}

	public void setTies(int ties) {
		this.ties = ties;
	}

	@Override
    public String toString(){
        return super.getWins() + " - " + super.getLosses() + " - " + ties;
    }
}