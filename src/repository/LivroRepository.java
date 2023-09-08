package repository;

import model.livro.Livro;

import java.util.*;

public class LivroRepository {

    private List<Livro> livros;

    public LivroRepository() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivroAoCatalogo(Livro livro) {
        livros.add(livro);
    }

    public Optional<Livro> retornarLivroPorId(String id) {
        return this.livros.stream()
                .filter(livro -> livro.getId().equals(id))
                .findFirst();
    }

    public Collection<Livro> retornarLivrosPorAutor(String autor) {
        return this.livros.stream()
                .filter(livro -> livro.getAutor().equals(autor))
                .toList();
    }

    public Collection<Livro> retornarLivrosOrdenadosPorAutor() {
        Collections.sort(livros);
        return livros;
    }

    public Boolean atualizarLivroPorId(String id, Livro novoLivro) {
        Boolean[] atualizado = {false};
        this.retornarLivroPorId(id).ifPresent(l -> {
            novoLivro.setDataRegistro(l.getDataRegistro());
            int indice = livros.indexOf(l);
            livros.add(indice, novoLivro);
            livros.remove(indice + 1);
            atualizado[0] = true;
        });
        return atualizado[0];
    }

    public Collection<Livro> retornarLivroPorAno(Integer ano) {
        return this.livros.stream()
                .filter(livro -> ano.equals(livro.getDataPublicacao().getYear()))
                .toList();
    }
}
