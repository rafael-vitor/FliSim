import javafx.geometry.Point2D;

import java.util.HashMap;
import java.util.Map;

public class WorldMap {

  public static Point2D getPosition(String name) {

    Map<String, Point2D> map = new HashMap<String, Point2D>();
//    Map map = new HashMap();


    Point2D posit = new Point2D(4, 2);

    map.put("AAA", new Point2D(10, 30));
    map.put("BBB", new Point2D(30, 0));
    map.put("CCC", new Point2D(0, 10));

    System.out.println("getting position for " + name);
    System.out.println("position =  " + map.get(name));

    return map.get(name);
  }
}
