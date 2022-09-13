import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> lista = new ArrayList<>();
    private String nome;

    public Composite(String nome) {
        this.nome = nome;
    }

    public void adicionar(Component comp) {
        lista.add(comp);
    }

    public void remover(Component comp) {
        lista.remove(comp);
    }

    @Override
    public double getPreco() {
        double total = 0F;
        for (Component component : lista) {
            total += component.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Composite [lista=" + lista + ", nome=" + nome + "]";
    }

    

}
