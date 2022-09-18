package Ex4;

import java.util.ArrayList;
import java.util.List;

public class Diretoria implements DepartamentoComponent {

    private List<DiretoriaFilial> lista = new ArrayList<>();

    public Diretoria(){};

    public void adicionar(DiretoriaFilial df) {
        lista.add(df);
    }

    public void remover(DiretoriaFilial df) {
        lista.remove(df);
    }

    @Override
    public double getCusto() {
        double valor = 0F;
        for (DiretoriaFilial df : lista) {
            valor += df.getCusto();
        }
        return valor;
    }

    @Override
    public int getFuncionarios() {
        int quantidade = 0;
        for (DiretoriaFilial df : lista) {
            quantidade += df.getFuncionarios();
        }
        return quantidade;
    }
    
}
