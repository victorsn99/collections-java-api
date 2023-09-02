package model;

import java.util.UUID;

public class Tarefa {

    private final String id;

    private String descricao;

    public Tarefa(String descricao) {
        this.id = UUID.randomUUID().toString();
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }
}
