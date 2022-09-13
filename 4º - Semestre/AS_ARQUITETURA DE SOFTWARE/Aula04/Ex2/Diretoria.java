import java.util.ArrayList;
import java.util.List;

public class Diretoria implements DepartamentoComponent {

    private List<DepartamentoComponent> lista = new ArrayList<>();
    private String nome;

    public Diretoria(String nome){
        this.nome = nome;
    }

    public void adicionar(DepartamentoComponent comp) {
        lista.add(comp);
    }

    public void remover(DepartamentoComponent comp) {
        lista.remove(comp);
    }

    @Override
    public double getCusto() {
        double valor = 0F;
        for (DepartamentoComponent dc : lista) {
            valor = dc.getCusto();
        }
        return valor;
    }

    @Override
    public int getFuncionarios() {
        int quantidade = 0;
        for (DepartamentoComponent dc : lista) {
            quantidade = dc.getFuncionarios();
        }
        return quantidade;
    }
    
}
