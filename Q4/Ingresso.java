package Q4;

public class Ingresso {
  private Integer valor;

  public Ingresso() {
    this.valor = 5;
  }

  protected void setValor(Integer valor) {
    this.valor += valor;
  }

  public void imprimeValor() {
    System.out.println(this.valor);
  }
}
