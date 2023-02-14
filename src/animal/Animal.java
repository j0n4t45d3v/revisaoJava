package animal;

public abstract class Animal implements InterfaceAnimal {
  private String especie;
  private String sistemaRespiratorio;

  public Animal(String especie,  String sistemaRespiratorio) {
    this.especie = especie;

    this.sistemaRespiratorio = sistemaRespiratorio;
  }


  public Animal() {
  }




  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public String getSistemaRespiratorio() {
    return sistemaRespiratorio;
  }

  public void setSistemaRespiratorio(String sistemaRespiratorio) {
    this.sistemaRespiratorio = sistemaRespiratorio;
  }
}
