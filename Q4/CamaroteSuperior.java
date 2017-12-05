package Q4;

public class CamaroteSuperior extends Vip {

  @Override
  public void imprimeValor() {
    this.setValor(100);
    super.imprimeValor();
  }
}
