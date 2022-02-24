public class Metodos {

    // Privado e "global" dentro da Classe Metodo

    private static Aluno[] lista = new Aluno[1];
    private static int n = 0;

    public static void inserir(Aluno aluno) {
        if (n == lista.length){
            lista = alocarNovoArray();
        }
        lista[n] = aluno;
        n ++;

    }

    public static void mostrar(){
        for (int i = 0 ; i < n; i++){
            System.out.println(lista[i]);
        }
    }

    public static Aluno[] alocarNovoArray() {
        Aluno[] novo = new Aluno[lista.length + 3];
        //Copia de um array
        System.arraycopy(lista, 0, novo, 0, lista.length);
        return novo;
    }

}
