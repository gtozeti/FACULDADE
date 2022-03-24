public class Biblioteca{
    public static void main(String[] args) {
        
        Livro l1 = new Livro(1,"Clarissa Pinkola Estés", "Mulheres que correm com os lobos",34.90);
        Livro l2 = new Livro(2,"Rachael Lippincott", "Todo esse tempo",28.10);
        Livro l3 = new Livro(3,"Steven Levitsky", "Como as democracias morrem",32.90);
        Livro l4 = new Livro(4,"Reginaldo Prandi", "Mitologia dos orixás",59.0);
        Livro l5 = new Livro(5,"Chimamanda Ngozi Adichie", "Para educar crianças feministas",16.0);
        Livro l6 = new Livro(6,"George S Clason", "O homem mais rico da Babilônia",16.0);
        Livro l7 = new Livro(7,"Amanda Lovelace", "A princesa salva a si mesma neste livro",18.90);
        Livro l8 = new Livro(8,"Jennifer Niven", "Por lugares incríveis",21.90);
        Livro l9 = new Livro(9,"Itamar Vieira Junior", "Torto arado",35.10);
        Livro l10 = new Livro(10,"Greg Mckeown", "Essencialismo",36.99);


        Metodos.inserirLivro(l1);
        Metodos.inserirLivro(l2);
        Metodos.inserirLivro(l3);
        Metodos.inserirLivro(l4);
        Metodos.inserirLivro(l5);
        Metodos.inserirLivro(l6);
        Metodos.inserirLivro(l7);
        Metodos.inserirLivro(l8);
        Metodos.inserirLivro(l9);
        Metodos.inserirLivro(l10);

        Metodos.mostrarLivro();
        System.out.println("\n\n");
        Metodos.removerLivro(3);        
        Metodos.mostrarLivro();
        System.out.println("\n\n");
        Metodos.ordenaLivro();
        Metodos.mostrarLivro();
        System.out.println("\n\n");
        Metodos.buscaLivro("direito arado");
        Metodos.buscaLivro("Essencialismo");
        Metodos.buscaLivro("por lugares incríveis");
        System.out.println("\n\n");

    }
}