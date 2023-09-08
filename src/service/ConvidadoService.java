package service;

import repository.ConvidadoRepository;
import model.convidado.Convidado;

import java.util.Set;

public class ConvidadoService {

    private final ConvidadoRepository convidadoRepository;

    public ConvidadoService() {
        this.convidadoRepository = new ConvidadoRepository();
    }

    public void adicionarConvidado(String nome, Integer codigoConvite) {
        convidadoRepository.exibirConvidados()
                .stream()
                .filter(c -> c.getCodigoConvite().equals(codigoConvite))
                .findFirst()
                .ifPresentOrElse(e -> {
                    System.out.println("Não é possível cadastrar o convidado '" + nome + "' pois já existe um convidado com código de convite '" + codigoConvite + "'\n");
                }, () -> {
                    convidadoRepository.adicionarConvidado(nome, codigoConvite);
                    System.out.println("Convidado Adicionado! Nome: '" + nome + "', Código: " + codigoConvite + "\n");
                });
    }

    public void removerConvidado(Integer codigoConvite) {
        convidadoRepository.removerConvidado(codigoConvite);
        System.out.println("Convidado #" + codigoConvite + " removido.");
    }

    public void contarConvidados() {
        Integer quantidade = convidadoRepository.contarConvidados();
        System.out.println("Quantidade de convidados: " + quantidade);
    }

    public void exibirConvidados() {
        Set<Convidado> convidados = convidadoRepository.exibirConvidados();
        System.out.println("Lista de convidados: \n" + convidados);
    }
}
