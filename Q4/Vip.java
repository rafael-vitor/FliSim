package Q4;

public class Vip extends Ingresso {

  @Override
  public void imprimeValor() {
    this.setValor(10);
    super.imprimeValor();
  }
}
