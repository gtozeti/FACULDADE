import java.util.Scanner;

public class Ex_3 {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int id = 0;

    Metodos.inserir(id, entrada.next(), entrada.next());

    // // Array de um tipo abstrato
    // Aluno[] listaAlunos = new Aluno[2];

    // for (int i = 0; i < listaAlunos.length; i++) {

    //   // Cada índice é associado um objeto
    //   listaAlunos[i] = new Aluno();

    //   listaAlunos[i].setId(id);
    //   id++;
    //   System.out.print("Digite um nome: ");
    //   listaAlunos[i].setNome(entrada.next());
    //   System.out.print("Digite um curso: ");
    //   listaAlunos[i].setCurso(entrada.next());

    // }

    imprime(listaAlunos);

  }

  public static void imprime(Aluno[] info) {
    for (int i = 0; i < info.length; i++) {
      System.out.printf("ID: %d | Nome: %s | Curso: %s", info[i].getId(), info[i].getNome(), info[i].getCurso());
      System.out.println();
    }
  }
}