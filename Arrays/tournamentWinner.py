def tournamentWinner(competitions, results):
    # Write your code here.
	teams = { }
	index = 0
	tourn_winner = ''
	
	for match in competitions:
		
		if results[index] == 1:
			winning_team = match[0]
		else:
			winning_team = match[1]
		# print(winning_team)	
		if index == 0:
			tourn_winner = winning_team
			teams[tourn_winner] = 0
		
		if winning_team in teams:
			cur_score = teams.get(winning_team)
			cur_score += 3
			teams[winning_team] = cur_score
			if (teams.get(winning_team) > teams.get(tourn_winner)):
				tourn_winner = winning_team
		else:
			teams[winning_team] = 3
		index += 1
		
		
	
	# for key, value in teams.items():
	# 	print (key, value)
    # return ""
	return tourn_winner
