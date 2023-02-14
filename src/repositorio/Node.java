package repositorio;

import animal.Animal;

public class Node{
  private Animal valor;
  private Node proximo;
  private Node anterior;

  public Node(Animal valor) {
    this.valor = valor;
    this.proximo = null;
    this.anterior = null;
  }

  public Animal getValor() {
    return valor;
  }

  public void setValor(Animal valor) {
    this.valor = valor;
  }

  public Node getProximo() {
    return proximo;
  }

  public void setProximo(Node proximo) {
    this.proximo = proximo;
  }

  public Node getAnterior() {
    return anterior;
  }

  public void setAnterior(Node anterior) {
    this.anterior = anterior;
  }
}
