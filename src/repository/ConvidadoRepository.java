package repository;

import model.convidado.Convidado;
import interfaces.IConvidadoRepository;

import java.util.HashSet;
import java.util.Set;

public class ConvidadoRepository implements IConvidadoRepository {

    private Set<Convidado> convidados;

    public ConvidadoRepository() {
        this.convidados = new HashSet<>();
    }

    @Override
    public void adicionarConvidado(String nome, Integer codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    @Override
    public void removerConvidado(Integer codigoConvite) {
        this.convidados.removeIf(e -> e.getCodigoConvite().equals(codigoConvite));
    }

    @Override
    public Integer contarConvidados() {
        return convidados.size();
    }

    @Override
    public Set<Convidado> exibirConvidados() {
        return this.convidados;
    }
}
