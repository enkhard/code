public class Main {
  public static void main(String[] args) {
    System.out.println("2024 Q1");
    Feeder f1 = new Feeder (2400);
    //System.out.println(f1.getCurrentFood());
    //f1.simulateOneDay(12);
    f1.simulateManyDays(10, 4);
  }
}
