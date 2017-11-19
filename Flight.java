import java.time.LocalDateTime;
import java.util.TimerTask;

public class Flight extends TimerTask {

  private double height;

  private Airport fromWhere;

  private Airport toWhere;

  private FlightStatus flightStatus;

  public int getCounter() {
    return counter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }

  private int counter;

  public Flight(String fromWhere, String toWhere) {
    this.fromWhere = new Airport(fromWhere);
    this.toWhere = new Airport(toWhere);
    System.out.println("creating flight from " + fromWhere);
    System.out.println("to " + toWhere);
    System.out.println("at " + LocalDateTime.now());

  }

  public void selectNextState(String inp) {
    System.out.println("select next state" + inp);
    try {
      Thread.sleep(6000);
    } catch (InterruptedException e) {
    }
  }

  public void moveToNextState() {
    System.out.println("moving to next state");
    System.out.println("current state: " + counter);
    System.out.println("next state: " + (counter + 1));
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
    }

    this.counter = counter + 1;
  }

  @Override
  public void run() {
    System.out.println("Timer task started at:" + LocalDateTime.now());
    moveToNextState();
    System.out.println("Timer task finished at:" + LocalDateTime.now());

  }

  @Override
  public String toString() {
    System.out.println("printing super to string");
    return super.toString();
  }
}