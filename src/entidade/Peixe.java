package entidade;

import animal.Animal;

public class Peixe extends Animal {
  private boolean guelras;

  public Peixe(String especie, boolean guelras, String sistemaRespiratorio) {
    super(especie, sistemaRespiratorio);
    this.guelras = guelras;
  }

  public Peixe() {
  }

  public boolean isGuelras() {
    return guelras;
  }

  public void setGuelras(boolean guelras) {
    this.guelras = guelras;
  }

  @Override
  public String emitirSom() {
    return "Glub Glub";
  }
}
