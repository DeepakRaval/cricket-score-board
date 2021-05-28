package cricket.scoreBoard;

import java.util.Random;

public class ScoreBoard {


	public void firstInning(int overs, int inning) {
		
		 int totalBallsToPlay = 0;
		 int totalRuns = 0;
		 int wideBall = 0;
		 int noBall = 0;
		 int wicket = 0;
		 int totalOver = 0;
		 double runRate = 0;
		
		totalBallsToPlay = (overs * 6);
		/*
		 * 5 = wide 7 = noBoll 8 = wicket
		 */
		int[] instances = { 0, 1, 2, 3, 4, 6, 5, 7, 8};

		for (int i = 1; i <= totalBallsToPlay; i++) {
			int randomInstances = new Random().nextInt(instances.length);

			if (wicket > 9) {
				break;
			}

			if (randomInstances == 0) {
				totalRuns = totalRuns + 0;
			} else if (randomInstances == 1) {
				totalRuns = totalRuns + 1;
			} else if (randomInstances == 2) {
				totalRuns = totalRuns + 2;
			} else if (randomInstances == 3) {
				totalRuns = totalRuns + 3;
			} else if (randomInstances == 4) {
				totalRuns = totalRuns + 4;
			} else if (randomInstances == 5) {
				totalBallsToPlay++;
				totalRuns++;
				wideBall++;
			} else if (randomInstances == 6) {
				totalRuns = totalRuns + 6;
			} else if (randomInstances == 7) {
				totalBallsToPlay += 1;
				totalRuns++;
				noBall++;
			} else if (randomInstances == 8) {
				wicket++;
			}

			if ((totalBallsToPlay % 6) == 0) {
				totalOver++;
			}
		}

//		 int actualBallPlayed = totalBallsToPlay - (wideBall + noBall);
//		 double actualBall = actualBallPlayed;
//		 double overPlayed = (actualBall / 6);
//		 System.out.println(overPlayed);

		double totalRuns1 = totalRuns;
		double overs1 = overs;
		runRate = (totalRuns1 / overs1);
		System.out.println("\n********* end of first inning *************");
		
		 TeamA a = new TeamA(totalRuns, wicket, runRate, wideBall, noBall,totalOver);
		 System.out.println("Target : "+ (totalRuns + 1)+  " | Wickets : "+wicket + " | Run Rate : "+runRate);

		 secondInning(a, overs);
			

	}

	 public void secondInning(TeamA a1, int overs) {
		 
		 int totalBallsToPlay = 0;
		 int totalRuns = 0;
		 int wideBall = 0;
		 int noBall = 0;
		 int wicket = 0;
		 int totalOver = 0;
		 double runRate = 0;
		 
	 int totalOfA = a1.getTotalRuns();
//	  System.out.println("total runs of team A = " + totalOfA);
	
	 totalBallsToPlay = (overs * 6);
	
	 int[] instances = { 0, 1, 2, 3, 4, 6, 5, 7, 8};
	
	 for (int i = 1; i <= totalBallsToPlay; i++) {
	 int randomInstances = new Random().nextInt(instances.length);
	
	 if ((wicket > 9) || (totalRuns > totalOfA)) {
//	  System.out.println("*** All out at ***");
	 break;
	 }
	
	 if (randomInstances == 0) {
	 totalRuns = totalRuns + 0;
	 } else if (randomInstances == 1) {
	 totalRuns = totalRuns + 1;
	 } else if (randomInstances == 2) {
	 totalRuns = totalRuns + 2;
	 } else if (randomInstances == 3) {
	 totalRuns = totalRuns + 3;
	 } else if (randomInstances == 4) {
	 totalRuns = totalRuns + 4;
	 } else if (randomInstances == 5) {
	 totalBallsToPlay++;
	 totalRuns++;
	 wideBall++;
	 } else if (randomInstances == 6) {
	 totalRuns = totalRuns + 6;
	 } else if (randomInstances == 7) {
	 totalBallsToPlay += 1;
	 totalRuns++;
	 noBall++;
	 } else if (randomInstances == 8) {
	 wicket++;
	 }
	
	 if ((totalBallsToPlay % 6) == 0) {
	 totalOver++;
	 }
	 }
	
//	 int actualBallPlayed = totalBallsToPlay - (wideBall + noBall);
//	 double actualBall = actualBallPlayed;
//	 double overPlayed = (actualBall / 6.0);
//	 System.out.println(overPlayed);
	 
	 double totalRuns1 = totalRuns;
	 double overs1 = overs;
	 runRate = (totalRuns1 / overs1);
	
	 TeamB b = new TeamB(totalRuns, wicket, runRate, wideBall, noBall, totalOver);
	 System.out.println("\n******** End of second inning **************");
	 System.out.println("Run chased : "+ (totalRuns + 1)+  " | Wickets : "+ wicket + " | Run Rate : "+runRate);
	
	 new ScoreBoard().finalResult(a1, b);
	 }




	public void finalResult(TeamA ta, TeamB tb) {

		int tsa = ta.getTotalRuns(), tsb = tb.getTotalRuns();
		int twa = ta.getWicket(), twb = tb.getWicket();
		double rta = ta.getRunRate(), rtb = tb.getRunRate();
		int wba = ta.getWideBall(), wtb = tb.getWideBall();
		int nba = ta.getNoBall(), nbb = tb.getNoBall();
//		int ota = ta.getOvers(), otb = tb.getOvers();
		
		if (ta.getTotalRuns() > tb.getTotalRuns()) {
			System.out.println("\n Team A WIN by " + (tsa - tsb) + " Runs");
		} else if (ta.getTotalRuns() < tb.getTotalRuns()) {
			System.out.println("\n Team B WIN by " + (tsb - tsa) + " Runs");
		} else {
			System.out.println("\n This Match is *Draw*");
		}

		System.out.println("\n|||||||||||||||||| SCORE BOARD ||||||||||||||||||||||");
		System.out.println("Total Score          : Team A = " + tsa + "   : " + "TeamB = " + tsb + "   :");
		System.out.println("Total Wicket         : Team A = " + twa + "    : " + "TeamB = " + twb + "    :");
		System.out.println("Total Run Rate       : Team A = " + rta + " : " + "TeamB = " + rtb + " :");
		System.out.println("Total Wide Balls     : Team A = " + wba + "    : " + "TeamB = " + wtb + "    :");
		System.out.println("Total No Balls       : Team A = " + nba + "    : " + "TeamB = " + nbb + "    :");
//		System.out.println("Total Overs Played   : Team A = " + ota + "    : " + "TeamB = " + otb + "    :");


	}

}
