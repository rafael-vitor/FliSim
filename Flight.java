import java.time.LocalDateTime;

public class Flight {

  public Flight(String fromWhere, String toWhere) {
    this.fromWhere = new Airport(fromWhere);
    this.toWhere = new Airport(toWhere);
    System.out.println("creating flight from " + fromWhere);
    System.out.println("to " + toWhere);
    System.out.println("at " + LocalDateTime.now());

  }
  private double speed;

  private double height;

  private Airport fromWhere;

  private Airport toWhere;

  private FlightStatus flightStatus;
}