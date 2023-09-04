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

    public Boolean atualizarLivroPorId(String id, Livro novoLivro) {
        Livro livro = this.retornarLivroPorId(id).get();
        if (livro != null) {
            novoLivro.setDataRegistro(livro.getDataRegistro());
            int indice = livros.indexOf(livro);
            livros.add(indice, novoLivro);
            livros.remove(indice + 1);
            return true;
        } else {
            return false;
        }
    }

    public Collection<Livro> retornarLivroPorAno(Integer ano) {
        return this.livros.stream()
                .filter(livro -> ano.equals(livro.getDataPublicacao().getYear()))
                .toList();
    }
}
