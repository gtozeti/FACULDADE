public class MonstarDiretoria {
    public static void main(String[] args) {
        
        Diretoria diretoria = new Diretoria("Power Guido");

        DepartamentoComponent dp1 = new Departamento("Viagra", 69.69, 69);
        DepartamentoComponent dp2 = new Departamento("Amendoin", 11.11, 11);

        diretoria.adicionar(dp1);
        diretoria.adicionar(dp2);

        System.out.println(diretoria.getFuncionarios());
        System.out.println(diretoria.getCusto());



    }
}
