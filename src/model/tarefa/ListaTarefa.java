package model.tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListaTarefa {

    private List<Tarefa> tarefas;

    public ListaTarefa(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public Tarefa adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        this.tarefas.add(tarefa);
        return tarefa;
    }

    public List<Tarefa> adicionarTarefas(List<Tarefa> tarefas) {
        List<Tarefa> tarefasCadastrar = tarefas;
        this.tarefas.addAll(tarefasCadastrar);
        return tarefasCadastrar;
    }

    public void removerTarefaPorDescricao(String descricao) {
        this.tarefas.removeIf(e -> e.getDescricao().equals(descricao));
    }

    public void removerTarefaPorId(String id) {
        this.tarefas.removeIf(e -> e.getId().equals(id));
    }

    public Optional<Tarefa> listarTarefaPorId(String id) {
        return this.tarefas.stream()
                .filter(tarefa -> tarefa.getId().equals(id))
                .findFirst();
    }
}
