public class Scoreboard {
  private String team1;
  private String team2;
  private int score1;
  private int score2;
  private boolean turn;

  public Scoreboard(String t1, String t2){
    team1= t1;
    team2 = t2;
    score1= 0;
    score2= 0;
    turn = true;
  }

  public void recordPlay( int s){
    if ( s ==0){
      turn = !turn;
    }
    else
    {
       if ( turn ){
          score1 += s;
        }
       else{
          score2 += s;
        }
    }
  }
  public String getScore(){
    String n ="";
    if (turn){
      n= team1;
    }
    else{
      n= team2;
    }
    return score1 + "-"+ score2+ "-"+ n;
  }




  
}
