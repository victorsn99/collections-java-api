package service;

import repository.ConvidadoRepository;
import model.convidado.Convidado;

import java.util.Set;

public class ConvidadoService {

    private ConvidadoRepository conjuntoConvidado;

    public ConvidadoService() {
        this.conjuntoConvidado = new ConvidadoRepository();
    }

    public void adicionarConvidado(String nome, Integer codigoConvite) {
        conjuntoConvidado.adicionarConvidado(nome, codigoConvite);
    }

    public void removerConvidado(Integer codigoConvite) {
        conjuntoConvidado.removerConvidado(codigoConvite);
    }

    public void contarConvidados() {
        Integer quantidade = conjuntoConvidado.contarConvidados();
        System.out.println("Quantidade de convidados: " + quantidade);
    }

    public void exibirConvidados() {
        Set<Convidado> convidados = conjuntoConvidado.exibirConvidados();
        System.out.println("Lista de convidados: \n" + convidados);
    }
}
