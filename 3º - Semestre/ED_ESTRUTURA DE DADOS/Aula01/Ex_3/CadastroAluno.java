import java.util.Scanner;

public class CadastroAluno {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    //int id = 0;

    // Array de um tipo abstrato
   // Aluno[] listaAlunos = new Aluno[1];

    // for (int i = 0; i < listaAlunos.length; i++) {

    //   // Cada índice é associado um objeto
    //   listaAlunos[i] = new Aluno(id, entrada.next(), entrada.next());
    //   id++;
    //   Metodos.inserir(listaAlunos[i]);

    // }

    Aluno al1 = new Aluno(1, "Aa", "9");
    Aluno al2 = new Aluno(2, "Bb", "8");
    Aluno al3 = new Aluno(3, "Cc", "7");
    Aluno al4 = new Aluno(4, "Dd", "6");
    Aluno al5 = new Aluno(5, "Ee", "5");

    Metodos.inserir(al1);
    Metodos.inserir(al2);
    Metodos.inserir(al3);
    Metodos.inserir(al4);
    Metodos.inserir(al5);

    Metodos.mostrar();
    entrada.close();

    //  IMPLEMENTAR O REMOVER
    

  }

}