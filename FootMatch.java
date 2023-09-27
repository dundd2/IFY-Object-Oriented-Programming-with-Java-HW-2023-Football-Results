
public class FootMatch 
{
    private String homeTeamName;
    private String awayTeamName;
    private int homeGoals;
    private int awayGoals;
    private String result;

    /**
     *constructor (set up before match takes place
     */
    public FootMatch(String hteam, String ateam)
    {
        homeTeamName = hteam;
        awayTeamName = ateam;
        homeGoals = 0;
        awayGoals = 0;
    }
    /**
     * After match is played set the result
     */
    public void setResult(int hgoals, int agoals)
    {
        homeGoals = hgoals;
        awayGoals = agoals;
        if (hgoals > agoals) {
            result = homeTeamName + "(homeTeam)won the match";
        } else if (agoals > hgoals) {
            result = awayTeamName + "(awayTeam) won the match";
        } else if (agoals == hgoals) {
            result = "This match  is a draw";
        }
        System.out.println(result);
    }
    /**
     * get methods for the team object to invoke
     */
    public String getHomeTeamName()
    {
        return homeTeamName;
    }
    
    public String getAwayTeamName()
    {
        return awayTeamName;
    }
    
    public int getHomeGoals()
    {
        return homeGoals;
    }
    
    public int getAwayGoals()
    {
        return awayGoals;
    }
    
    public void printResult()
    {
        if (homeGoals > awayGoals) {
            result = "home win";
        } else if (awayGoals > homeGoals) {
            result = "away win";
        } else if (awayGoals == homeGoals) {
            result = "draw";
        }
    }

    public String toString()
    {
        return "Result: " + homeTeamName + " " + homeGoals + " : " + awayTeamName + " " + awayGoals;
    }

}