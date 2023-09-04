package model.convidado;

public class Convidado {

    private String nome;

    private Integer codigoConvite;

    public Convidado(String nome, Integer codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoConvite() {
        return codigoConvite;
    }

    public void setCodigoConvite(Integer codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado \n" +
                "Nome: " + nome + "\n" +
                "Código do Convite:" + codigoConvite + "\n\n";
    }
}
