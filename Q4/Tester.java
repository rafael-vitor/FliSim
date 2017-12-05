package Q4;

public class Tester {
  public static void main(String[] args) {
    Ingresso ingresso = new Ingresso();
    Vip vip = new Vip();
    Normal normal = new Normal(5);
    CamaroteInferior camaroteInferior = new CamaroteInferior("Cadeira 5");
    CamaroteSuperior camaroteSuperior = new CamaroteSuperior();



    ingresso.imprimeValor();
    vip.imprimeValor();
    normal.imprimeIngressoNormal();
    camaroteInferior.imprimeLocalizacao();
    camaroteSuperior.imprimeValor();
  }
}

