import javafx.geometry.Point2D;

public class Airport {
  private String name;
  private Point2D position;

  public Airport(String name) {
    this.position = WorldMap.getPosition(name);
    System.out.println("creating Airport named " + name);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}