package repositorio;

import animal.Animal;

public class RepositorioLista implements InRepositorio{
  private Node inicio;
  private Node fim;

  public RepositorioLista() {
    this.inicio = null;
    this.fim = null;
  }


  @Override
  public void adicionar(Animal animal) {
    Node ani = new Node(animal);
    if(this.inicio == null){
      this.inicio = ani;
    }else{
      this.fim.setProximo(ani);
      ani.setAnterior(this.fim);
    }
    this.fim = ani;
  }

  @Override
  public void remover(String nome) {
    Node atual = this.inicio;

    while(atual != null && !atual.getValor().getEspecie().equals(nome)){
      atual = atual.getProximo();
    }

    if( atual.equals(this.inicio) && atual.getProximo() != null ){
      this.inicio = atual.getProximo();
    } else if (atual.equals(this.fim)) {
      this.fim = atual.getAnterior();
      this.fim.setProximo(null);
    } else {
      atual.getAnterior().setProximo(atual.getProximo());
      atual.getProximo().setAnterior(atual.getAnterior());
    }
  }

  @Override
  public void listarAnimais() {
    Node animal = this.inicio;

    while(animal != null){
      System.out.println(animal.getValor().getEspecie());
      animal = animal.getProximo();
    }
  }
}
