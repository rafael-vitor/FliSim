package Q2;

import Q2.abstrato.Forma;
import Q2.interfaces.Quadrilateros;

public class Quadrado extends Forma implements Quadrilateros {

  @Override
  public void lados() {
    System.out.println(4);
  }

  @Override
  public void area() {
    System.out.println("10m²");
  }
}
