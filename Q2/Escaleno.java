package Q2;

import Q2.abstrato.Forma;
import Q2.interfaces.Triangulos;

public class Escaleno extends Forma implements Triangulos {
  @Override
  public void lados() {
    System.out.println(3);
  }

  @Override
  public void tipo() {
    System.out.println("Escaleno");
  }
}
