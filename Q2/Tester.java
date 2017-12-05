package Q2;

public class Tester {
  public static void main(String[] args) {
    Quadrado quadrado = new Quadrado();
    Equilatero equilatero = new Equilatero();
    Escaleno escaleno = new Escaleno();
    Retangulo retangulo = new Retangulo();

    quadrado.lados();
    quadrado.sobre();
    quadrado.area();

    equilatero.lados();
    equilatero.tipo();
    equilatero.sobre();

    escaleno.lados();
    escaleno.tipo();
    escaleno.sobre();

    retangulo.area();
    retangulo.lados();
    retangulo.sobre();



  }
}
