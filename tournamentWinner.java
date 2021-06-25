import java.util.*;

class Program {
	
	int HOME_TEAM_WON = 1;

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		// Instantiate a HashMap, a tourniWinner variable, and add the tourniWinner variable to hashMap
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		String tourniWinner = "";
		scores.put(tourniWinner, 0);
			
			
		// Iterate through the competitions and results arrays to find the winner of each match
		for (int idx = 0; idx < competitions.size(); idx++){
			ArrayList<String> match = competitions.get(idx);
			int result = results.get(idx);
			
			String homeTeam = match.get(0);
			String awayTeam = match.get(1);
			
			String matchWinner = (result == HOME_TEAM_WON) ? homeTeam : awayTeam;
			// System.out.println(matchWinner);
			// Update HashMap by incrementing points or adding winner to the HashMap
			updateScores(matchWinner, 3, scores);
			
			if ( scores.get(matchWinner) > scores.get(tourniWinner) ) {
				tourniWinner = matchWinner;
			}
		}
		
		// for (Map.Entry<String,Integer> pair : scores.entrySet()) {
		// 	String key = pair.getKey();
		// 	int value = pair.getValue();
		// 	// do stuff
		// 	System.out.println(String.format("%s, %d", key, value ));
		// }
		
		// Return the the team with the highest score
		return tourniWinner;
  }
	
	public void updateScores(String matchWinner, int points, HashMap<String, Integer> scores) {
		// System.out.println(matchWinner);
		if (!scores.containsKey(matchWinner)) {
			scores.put(matchWinner, 0);
		}
		scores.put(matchWinner, scores.get(matchWinner) + 3);
	}
}
