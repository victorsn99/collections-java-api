import model.ListaTarefa;
import model.Tarefa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!\n\n");

        executarCadastroDuasTarefasListarPrimeiraTarefaEExcluir();
    }

    public static void executarCadastroDuasTarefasListarPrimeiraTarefaEExcluir() {
        ListaTarefa tarefas = new ListaTarefa();
        Tarefa tarefa1 = tarefas.adicionarTarefa("- Ir ao mercado \n- Lavar louça \n- Estudar Java");
        Tarefa tarefa2 = tarefas.adicionarTarefa("- Estudar Python e IA \n- Ir à academia");

        System.out.println("Listando tarefa #" + tarefa1.getId());
        Tarefa tarefaPorId = tarefas.listarTarefaPorId(tarefa1.getId()).get();
        if (tarefaPorId != null) {
            System.out.println("Tarefa #" + tarefaPorId.getId() + " listada com sucesso. \nDescrição: \n" + tarefaPorId.getDescricao());
            System.out.println("\n\nExcluindo tarefa #" + tarefa1.getId());
            tarefas.removerTarefaPorId(tarefaPorId.getId());
            if(tarefas.listarTarefaPorId(tarefa1.getId()).isEmpty()) {
                System.out.println("Tarefa #" + tarefa1.getId() + " excluída com sucesso.");
            }
        } else {
            System.out.println("Tarefa inexistente.");
        }

        
    }
}