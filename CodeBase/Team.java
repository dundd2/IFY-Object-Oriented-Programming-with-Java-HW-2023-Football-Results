
import java.util.ArrayList;

public class Team
{
    // goals for and against are set at zero and then can be increased by accessing a match involving the team
    private String teamName;
    private ArrayList<FootMatch> results;
    private int totalGoalsFor;
    private int totalGoalsAgainst;
    private int totalPoints;

    //constructor function sets name of team
    public  Team(String tname)
    {
        teamName = tname;
        results = new ArrayList<FootMatch>();
        totalGoalsFor = 0;
        totalGoalsAgainst = 0;
        totalPoints = 0;
    }

    /*
     * this method checks if the match involves this team
     * then gets the goals for and against this team
     * adding them to the cumulative record.
     */

    public void getMatchResult(FootMatch match) {
        int ourGoals = 0;
        int theirGoals = 0 ;
        if (match.getHomeTeamName().equals(teamName)) {
            ourGoals = match.getHomeGoals();
            theirGoals = match.getAwayGoals();
            totalGoalsFor += ourGoals;
            totalGoalsAgainst += theirGoals;
            if (ourGoals > theirGoals) {
                totalPoints +=3;
            } else if (ourGoals == theirGoals) {
                totalPoints +=1;
            }
        } else if (match.getAwayTeamName().equals(teamName)) {
            ourGoals = match.getAwayGoals();
            theirGoals = match.getHomeGoals();
            totalGoalsFor += ourGoals;
            totalGoalsAgainst += theirGoals;
            if (ourGoals > theirGoals) {
                totalPoints += 3;
            } else if (ourGoals == theirGoals) {
                totalPoints += 1;
            }
        } else {
            System.out.println("This match does not involve " + teamName);
        }
        results.add(match);
    }

    private void upDateStatistics()
    {
        totalPoints = 0;
        for (FootMatch match : results) {
            if (match.getHomeTeamName().equals(teamName)) {
                if (match.getHomeGoals() > match.getAwayGoals()) {
                    totalPoints += 3;
                } else if (match.getHomeGoals() == match.getAwayGoals()) {
                    totalPoints += 1;
                }
            } else if (match.getAwayTeamName().equals(teamName)) {
                if (match.getAwayGoals() > match.getHomeGoals()) {
                    totalPoints += 3;
                } else if (match.getAwayGoals() == match.getHomeGoals()) {
                    totalPoints += 1;
                }
            }
        }
    }

    public String getTeamName()
    {
        return teamName;
    }

    public void listHomeMatches()
    {
        System.out.println("Home Matches:");
        for (FootMatch match : results) {
            if (match.getHomeTeamName().equals(teamName)) {
                System.out.println(match);
            }
        }
    }

    public void listAwayMatches()
    {
        System.out.println("Away Matches:");
        for (FootMatch match : results) {
            if (match.getAwayTeamName().equals(teamName)) {
                System.out.println(match);
            }
        }
    }

    public void listAllMatches()
    {
        System.out.println("All Matches:");
        for (FootMatch match : results) {
            System.out.println(match);
        }
    }

    public void listMatchesByOpponentsName(String aName)
    {
        System.out.println("Matches Against " + aName + ":");
        for (FootMatch match : results) {
            if (match.getHomeTeamName().equals(teamName) && match.getAwayTeamName().equals(aName)) {
                System.out.println(match);
            } else if (match.getHomeTeamName().equals(aName) && match.getAwayTeamName().equals(teamName)) {
                System.out.println(match);
            }
        }
    }

    public void listMatchesWon()
    {
        System.out.println("Matches Won: ");
        for (FootMatch match : results) {
            if (match.getHomeTeamName().equals(teamName) && match.getHomeGoals() > match.getAwayGoals()) {
                System.out.println(match);
            } else if (match.getAwayTeamName().equals(teamName) && match.getAwayGoals() > match.getHomeGoals()) {
                System.out.println(match);
            }
        }
    }

    public void listMatchesLost()
    {
        System.out.println("Matches Lost: ");
        for (FootMatch match : results) {
            if (match.getHomeTeamName().equals(teamName) && match.getHomeGoals() < match.getAwayGoals()) {
                System.out.println(match);
            } else if (match.getAwayTeamName().equals(teamName) && match.getAwayGoals() < match.getHomeGoals()) {
                System.out.println(match);
            }
        }
    }

    public String toString()
    {
        return "Total Goals For:" + totalGoalsFor + "\\nTotal Goals Against:" + totalGoalsAgainst + "\\nTotal Points:" + totalPoints;
    }
}

