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
        conjuntoConvidado.exibirConvidados()
                .stream()
                .filter(c -> c.getCodigoConvite().equals(codigoConvite))
                .findFirst()
                .ifPresentOrElse(e -> {
                    System.out.println("Não é possível cadastrar o convidado '" + nome + "' pois já existe um convidado com código de convite '" + codigoConvite + "'\n");
                }, () -> {
                    conjuntoConvidado.adicionarConvidado(nome, codigoConvite);
                    System.out.println("Convidado Adicionado! Nome: '" + nome + "', Código: " + codigoConvite + "\n");
                });
    }

    public void removerConvidado(Integer codigoConvite) {
        conjuntoConvidado.removerConvidado(codigoConvite);
        System.out.println("Convidado #" + codigoConvite + " removido.");
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
