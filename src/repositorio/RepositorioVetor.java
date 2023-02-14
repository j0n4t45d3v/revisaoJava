package repositorio;

import animal.Animal;

public class RepositorioVetor implements InRepositorio{
  private Animal[] vetor;

  public RepositorioVetor() {
    this.vetor = new Animal[100];
  }

  @Override
  public void adicionar(Animal animal) {
    if(this.vetor[0] == null){
      this.vetor[0] = animal;
    }else{
      for (int i = 0; i < this.vetor.length; i ++) {
        if(this.vetor[i] == null){
          this.vetor[i] = animal;
          break;
        }
      }
    }
  }

  @Override
  public void remover(String nome) {
    for(int i = 0; i < this.vetor.length; i ++){
      if(this.vetor[i].getEspecie().equals(nome)){
        this.vetor[i] = null;
        break;
      }
    }
  }

  @Override
  public void listarAnimais() {
    for (Animal i : this.vetor) {
      if(i != null){
        System.out.println(i.getEspecie());
      }
    }
  }
}
