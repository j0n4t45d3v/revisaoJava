package entidade;

import animal.Animal;

public class Mamifero extends Animal {
  private String pelagem;

  public Mamifero(String especie, String pelagem, String sistemaRespiratorio) {
    super(especie, sistemaRespiratorio);
    this.pelagem = pelagem;
  }

  public Mamifero() {
  }

  public String getPelagem() {
    return pelagem;
  }

  public void setPelagem(String pelagem) {
    this.pelagem = pelagem;
  }

  @Override
  public void emitirSom() {
    System.out.println("GRRR GRRAU");
  }
}
