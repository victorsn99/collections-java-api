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

    public Livro(String titulo, String autor, String editora, LocalDate dataPublicacao) {
        this.id = UUID.randomUUID().toString();
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
        this.dataRegistro = LocalDateTime.now();
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

    public String getDataRegistroFormatado() {
        return dataRegistro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "\nLivro #" + id + "\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Editora: " + editora + "\n" +
                "Publicado em: " + this.getDataPublicacaoFormatado() + "\n" +
                "Cadastrado no Sistema em " + this.getDataRegistroFormatado();
    }

    @Override
    public int compareTo(Livro l) {
        return this.autor.compareTo(l.getAutor());
    }
}
