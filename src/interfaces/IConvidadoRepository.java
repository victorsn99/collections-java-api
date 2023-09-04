package interfaces;

import model.convidado.Convidado;

import java.util.Set;

public interface IConvidadoRepository {

    public void adicionarConvidado(String nome, Integer codigoConvite);
    public void removerConvidado(Integer codigoConvite);
    public Integer contarConvidados();
    public Set<Convidado> exibirConvidados();

}
