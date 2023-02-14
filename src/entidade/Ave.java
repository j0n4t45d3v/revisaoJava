package entidade;

import animal.Animal;

public class Ave extends Animal {
  private String invergaduraDaAsa;

  public Ave(String especie,  String sistemaRespiratorio, String invergaduraDaAsa) {
    super(especie,  sistemaRespiratorio);
    this.invergaduraDaAsa = invergaduraDaAsa;
  }

  public Ave() {
  }

  public String getInvergaduraDaAsa() {
    return invergaduraDaAsa;
  }

  public void setInvergaduraDaAsa(String invergaduraDaAsa) {
    this.invergaduraDaAsa = invergaduraDaAsa;
  }

  @Override
  public String emitirSom() {
    return "piu-piu";
  }
}
