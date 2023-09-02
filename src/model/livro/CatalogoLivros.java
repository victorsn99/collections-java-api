package model.livro;

import java.util.*;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
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
}
