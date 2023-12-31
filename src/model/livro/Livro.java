package model.livro;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Livro implements Serializable, Comparable<Livro> {

    private final String id;

    private String titulo;

    private String autor;

    private String editora;

    private LocalDate dataPublicacao;

    private LocalDateTime dataRegistro;

    private LocalDateTime dataAtualizacao;

    /**
     * Construtor Para Insert
     * @param titulo
     * @param autor
     * @param editora
     * @param dataPublicacao
     */
    public Livro(String titulo, String autor, String editora, LocalDate dataPublicacao) {
        this.id = UUID.randomUUID().toString();
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
        this.dataRegistro = LocalDateTime.now();
    }

    /**
     * Construtor Para Update
     * @param id
     * @param titulo
     * @param autor
     * @param editora
     * @param dataPublicacao
     */
    public Livro(String id, String titulo, String autor, String editora, LocalDate dataPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
        this.dataAtualizacao = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public String getDataPublicacaoFormatado() {
        return dataPublicacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getDataRegistroFormatado() {
        return dataRegistro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public String getDataAtualizacaoFormatado() {
        return (dataAtualizacao == null ? null : dataAtualizacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    @Override
    public String toString() {
        return "\nLivro #" + id + "\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Editora: " + editora + "\n" +
                "Publicado em: " + this.getDataPublicacaoFormatado() + "\n" +
                "Cadastrado no Sistema em " + this.getDataRegistroFormatado() + "\n" +
                "Atualizado no Sistema em " + (this.getDataAtualizacaoFormatado() == null ? "N/A" : this.getDataAtualizacaoFormatado());
    }

    @Override
    public int compareTo(Livro l) {
        return this.autor.compareTo(l.getAutor());
    }
}
