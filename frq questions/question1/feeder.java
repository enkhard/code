public class Feeder{
  
  private int currentFood;
  
  public Feeder ( int f){
    currentFood= f;
  }
  
  public int getCurrentFood(){
    return currentFood;
  }
  
  public void simulateOneDay(int numBirds){
    boolean normal = ((Math.random()*100+1) <= 95);
    System.out.println("is it a normal day: " + normal );
    if (normal){
      int gramsEaten =(int)(Math.random()*41+10);
      System.out.println("grams per bird: " + gramsEaten);
      int total = gramsEaten * numBirds;
      if ( total > currentFood){
        currentFood= 0;
      }
      else{
        currentFood -= total;
      }  
    }
    else
    {
      currentFood=0;
    }
    System.out.println( "current food: " + currentFood);
    }


  public int simulateManyDays(int numBirds, int numDays){
  int count =0;
  while( count < numDays && currentFood > 0){
    simulateOneDay(numBirds);
    count++;
  }
return count;
    
  }
}
