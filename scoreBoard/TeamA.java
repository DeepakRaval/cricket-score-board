package cricket.scoreBoard;

public class TeamA {

	int totalRuns;
	int wicket;
	double runRate;
	int wideBall;
	int noBall;
	int overs;
	
	
	
	public TeamA() {
		super();
	}


	public TeamA(int totalRuns, int wicket, double runRate, int wideBall, int noBall, int overs) {
		super();
		this.totalRuns = totalRuns;
		this.wicket = wicket;
		this.runRate = runRate;
		this.wideBall = wideBall;
		this.noBall = noBall;
		this.overs = overs;
	}
	
	
	public int getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	public int getWicket() {
		return wicket;
	}
	public void setWicket(int wicket) {
		this.wicket = wicket;
	}
	public double getRunRate() {
		return runRate;
	}
	public void setRunRate(double runRate) {
		this.runRate = runRate;
	}
	public int getWideBall() {
		return wideBall;
	}
	public void setWideBall(int wideBall) {
		this.wideBall = wideBall;
	}
	public int getNoBall() {
		return noBall;
	}
	public void setNoBall(int noBall) {
		this.noBall = noBall;
	}
	public int getOvers() {
		return overs;
	}
	public void setOvers(int overs) {
		this.overs = overs;
	}
}
