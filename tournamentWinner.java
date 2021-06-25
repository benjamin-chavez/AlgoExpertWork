import java.util.*;

class Program {
	
	int HOME_TEAM_WON = 1;
	
  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    String tournamentWinner = "";
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		scores.put(tournamentWinner, 0);
		
		for (int idx = 0; idx < competitions.size(); idx++) {
			ArrayList<String> match = competitions.get(idx);
			String matchWinner = (results.get(idx) == HOME_TEAM_WON) ? match.get(0) : match.get(1);
			
			updateTeams(matchWinner, 3, scores);
			
			if (scores.get(matchWinner) > scores.get(tournamentWinner)){
				tournamentWinner = matchWinner;
				// curScore = scores.get(matchWinner);
				// scores.put(tournamentWinner, curScore);
			}
		}

    return tournamentWinner;
  }
	
	public void updateTeams(String matchWinner, int points, HashMap<String, Integer> scores) {
		if (!scores.containsKey(matchWinner)) {
			scores.put(matchWinner, 0);	
		} 
			scores.put(matchWinner, scores.get(matchWinner) + points);
	}
}
