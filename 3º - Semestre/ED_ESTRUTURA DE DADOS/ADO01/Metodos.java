public class Metodos{
    
    // Array de objetos da classe
    private static Livro[] lista = new Livro[1];

    // Váriavel de controle de quantidade total de livros
    private static int numeroLivro = 0;

    // Metodo para inserir um novo livro
    public static void inserirLivro(Livro livro){
        // Caso a inserção de um novo livro, seja do tamanho igual ao vetor livro, ele redimensiona o array
        if (numeroLivro == lista.length){
            lista = redimensionarLivro();
        }
        lista[numeroLivro] = livro;
        numeroLivro ++;

    }

    // Metodo para redimensionar o array de objetos da classe
    public static Livro[] redimensionarLivro(){
        Livro[] novaLista = new Livro[lista.length + 1];
        System.arraycopy(lista, 0, novaLista, 0, lista.length);
        return novaLista;
    }

    // Metodo para redimensionar o array de objetos da classe após exclusão de um livro por ID
    public static void removerLivro(int id){   
        Livro[] novaLista = new Livro[lista.length - 1];
        int j = 0;
        for (int i = 0; i < lista.length; i++){
            if (lista[i].getId() != id){
                novaLista[j] = lista[i];
                j++;
            }
        }
        lista = novaLista;
        
    }

    // Metodo para fazer a chamada do método MergeSort passando os parâmetros da lista de livros
    public static void ordenaLivro(){
        lista = mergeSort(0, lista.length, lista);

    }

    // Metodo para realizar a chmada da busca binária de um título na lista de livros
    public static void buscaLivro(String titulo){
        System.out.println(buscaBinaria(lista, titulo));
    }


    // Metodo para mostrar os livros armazenados
    public static void mostrarLivro(){
        for (Livro x : lista){
            System.out.println(x.toString());
        }
       
    }

    // Metodo MergeSort para ordenação da lista de livros
    public static Livro[] mergeSort (int p, int n , Livro[] v) {
		if (p < n - 1) {
			int q = (p + n) / 2;
			mergeSort(p, q, v);
			mergeSort(q, n, v);
			intercala (p, q, n, v);
			
		}
        return v;
	}

    // Metodo intercala, complemento do mergeSort para ordenação
    public static void intercala(int p, int q, int n, Livro[] v) {
		Livro[] w = new Livro[n-p];
		int i = p;
		int j = q;
		int k = 0;
		
		while (i < q && j < n) {
			if (v[i].getAutor().compareToIgnoreCase(v[j].getAutor()) <= 0) {
				w[k] = v[i];
				i++;
			}
			else {
				w[k] = v[j];
				j++;
			}
			k++;
		}
		while ( i < q) {
			w[k] = v[i];
			i++;
			k++;
		}
		while ( j < n) {
			w[k] = v[j];
			j++;
			k++;
		}
		
		for (int x = p, y = 0; x < n; x++, y++) {
			v[x] = w[y];
			
		}

        lista = w;
	}


    // Metodo de busca binária por título do livro
    public static String buscaBinaria(Livro[] v, String x) {
		int i = 0;
		int f = v.length - 1;
		int m;
		while (i <= f) {
			m = (i + f) / 2;
			if (x.compareToIgnoreCase(v[m].getTitulo()) == 0)
				return v[m].toString();
			if (x.compareToIgnoreCase(v[m].getTitulo()) < 0)
				f = m - 1;
			else
				i = m + 1;
		}
		return "O título informado não se encontra nos registros!!";
	}

}