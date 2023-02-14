import entidade.Ave;
import entidade.Mamifero;
import entidade.Peixe;
import animal.Animal;
import repositorio.InRepositorio;
import repositorio.RepositorioLista;
import repositorio.RepositorioVetor;

public class Main {
  public static void main(String[] args) {
//    InRepositorio repositorioAnimal = new RepositorioLista();
    InRepositorio repositorioAnimal = new RepositorioVetor();

    Animal urso = new Mamifero("urso", "pelagem espeça", "pulmonar");
    Animal sardinha = new Peixe("sardinha", true, "guelras");
    Animal pombo = new Ave("pombo", "saco aereo", "70 cm");

    repositorioAnimal.adicionar(pombo);
    repositorioAnimal.adicionar(sardinha);
    repositorioAnimal.adicionar(urso);

    repositorioAnimal.listarAnimais();

    System.out.println("---------------------");
    repositorioAnimal.remover("urso");

    repositorioAnimal.listarAnimais();

  }
}