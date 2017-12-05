package Q4;

public class CamaroteInferior extends Vip {
  private String localizacao;

  public CamaroteInferior(String localizacao) {
    this.localizacao = localizacao;
  }

  public void imprimeLocalizacao() {
    System.out.println(this.localizacao);
  }
}
