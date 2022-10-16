package sistema;

import patternState.*;

public class USaGerenciamentoTarefas {
    public static void main(String[] args) {
        Context tarefa = new Context();
        tarefa.requisitarAtrasada();
        tarefa.requisitarConcluida();

        tarefa.requisitarPendente();

        tarefa.requisitarConcluida();
        tarefa.requisitarConcluida();


    }
}