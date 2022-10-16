package sistema;

import patternState.*;

public class USaGerenciamentoTarefas {
    public static void main(String[] args) {
        Context tarefa = new Context();

        tarefa.requisitarAbaixa();
        tarefa.requisitarCorrida();
        tarefa.requisitarEspera();
        tarefa.requisitarPulo();


    }
}