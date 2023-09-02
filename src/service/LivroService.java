package service;

import model.livro.CatalogoLivros;
import model.livro.Livro;

import java.time.LocalDate;
import java.util.Collection;

public class LivroService {

    CatalogoLivros catalogo = new CatalogoLivros();

    /**
    * Método para cadastrar um livro.
    * @param titulo O título do livro
    * @param autor O autor do livro
    * @param editora A editora que publicou o livro
    * @param dataPublicacao A data que o livro foi publicado pela editora
    * */
    public void cadastrarLivro(String titulo, String autor, String editora, LocalDate dataPublicacao) {
       catalogo.adicionarLivroAoCatalogo(new Livro(titulo, autor, editora, dataPublicacao));
    }

    /**
     * Método para listar livros de um autor.
     * @param autor O autor do livro
     * */
    public void listarPorAutor(String autor) {
        System.out.println("\n----Listando livros pelo autor '" + autor + "'----");
        catalogo.retornarLivrosPorAutor(autor).forEach(e -> System.out.println(e.toString()));
    }

    /**
     * Método para listar todos os livros ordenado por autor.
     * */
    public void listarTodosOrdenadoAutor() {
        System.out.println("\n----Listando livros ordenados por autor----");
        catalogo.retornarLivrosOrdenadosPorAutor().forEach(e -> System.out.println(e.toString()));
    }

    /**
     * Método para listar todos os livros publicados em um ano específico.
     * */
    public void listarTodosPorAno(Integer ano) {
    }
}
