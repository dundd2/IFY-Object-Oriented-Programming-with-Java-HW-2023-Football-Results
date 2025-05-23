public class TestAss2
{
    private Team team1;
    private Team team2;
    private Team team3;
    private Team team4;
    private FootMatch match12;
    private FootMatch match31;
    private FootMatch match23;
    private FootMatch match42;
    public TestAss2()
    {
        team1 = new Team("Brighton");
        team2 = new Team("Manchester United");
        team3 = new Team("Liverpool FC");
        team4 = new Team("Manchester City");

        match12 = new FootMatch("Brighton", "Manchester United");
        match31 = new FootMatch("Liverpool FC", "Brighton");
        match23 = new FootMatch("Manchester United", "Liverpool FC");
        match42 = new FootMatch("Manchester City", "Manchester United");
    }

    public void testTeam()
    {
        team1.getMatchResult(match12);
        team2.getMatchResult(match12);
        team3.getMatchResult(match12);

        team3.getMatchResult(match31);
        team1.getMatchResult(match31);

        team2.getMatchResult(match23);
        team3.getMatchResult(match23);

        team4.getMatchResult(match42);
        team2.getMatchResult(match42);

        System.out.println(team1);
        System.out.println(team2);
        System.out.println(team3);
        System.out.println(team4);
    }

    public void testMatches()
    {
        match12.setResult(4, 1);
        System.out.println(match12);
        match31.setResult(2, 2);
        System.out.println(match31);
        match23.setResult(0, 0);
        System.out.println(match23);
        match42.setResult(0, 2);
        System.out.println(match42);
    }
}