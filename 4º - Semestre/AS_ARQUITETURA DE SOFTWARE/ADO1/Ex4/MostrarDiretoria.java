package Ex4;

public class MostrarDiretoria {
    public static void main(String[] args) {

        Diretoria diretoria = new Diretoria();

        DiretoriaFilial diretoriaFilial1 = new DiretoriaFilial("Diretoria Nordeste");
        DiretoriaFilial diretoriaFilial2 = new DiretoriaFilial("Diretoria Centro-Oeste");

        DepartamentoComponent departamentoCompras = new Departamento(69000, 30);
        DepartamentoComponent departamentoVendas = new Departamento(130000, 20);
        DepartamentoComponent departamentoEstoque = new Departamento(30000, 10);

        DepartamentoComponent departamentoManut = new Departamento(229000, 15);
        DepartamentoComponent departamentoTi = new Departamento(1030000, 25);

        diretoriaFilial1.adicionar(departamentoCompras);
        diretoriaFilial1.adicionar(departamentoVendas);
        diretoriaFilial1.adicionar(departamentoEstoque);

        diretoriaFilial2.adicionar(departamentoManut);
        diretoriaFilial2.adicionar(departamentoTi);

        diretoria.adicionar(diretoriaFilial1);
        diretoria.adicionar(diretoriaFilial2);

        System.out.println("\n------------- Exercício 4 -------------\n");
        System.out.println("Total de funcionários da Diretoria Matriz: " + diretoria.getFuncionarios());
        System.out.println(String.format("Total de custo da Diretoria Matriz: R$ %.2f", diretoria.getCusto()));

        System.out.println("\nTotal de funcionários da Diretoria Filial 1: " + diretoriaFilial1.getFuncionarios());
        System.out.println(String.format("Total de custo da Diretoria Filial 1: R$ %.2f", diretoriaFilial1.getCusto()));

        System.out.println("\nTotal de funcionários da Diretoria Filial 2: " + diretoriaFilial2.getFuncionarios());
        System.out.println(String.format("Total de custo da Diretoria Filial 2: R$ %.2f", diretoriaFilial2.getCusto()));

    }
}
