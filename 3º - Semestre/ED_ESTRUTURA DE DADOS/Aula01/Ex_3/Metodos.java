public class Metodos {
    static Aluno[] lista = new Aluno[3];
    static int n = 0;

    public static void inserir(int id, String nome, String curso) {

        lista[n] = new Aluno();

        lista[n].setId(id);
        lista[n].setNome(nome);
        lista[n].setCurso(curso);
        n ++;

    }

}
