package repositorio;

import animal.Animal;

public interface InRepositorio {

  void adicionar (Animal animal);

  void remover(String nome);

  void listarAnimais();

}
