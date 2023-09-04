package service;

import repository.LivroRepository;
import model.livro.Livro;

import java.time.LocalDate;
import java.util.Collection;

public class LivroService {

    LivroRepository catalogo = new LivroRepository();

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
    public Collection<Livro> listarPorAutor(String autor) {
        System.out.println("\n----Listando livros pelo autor '" + autor + "'----");
        Collection<Livro> livros = catalogo.retornarLivrosPorAutor(autor);
        livros.forEach(e -> System.out.println(e.toString()));
        return livros;
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
        System.out.println("\n----Listando livros filtrando pelo ano de '" + "'----");
        catalogo.retornarLivroPorAno(ano).forEach(e -> System.out.println(e.toString()));
    }

    /**
     * Método para atualizar um livro.
     * */
    public void atualizarLivroPorId(String id, String titulo, String autor, String editora, LocalDate dataPublicacao) throws InterruptedException {
        System.out.println("\n----Atualizando o livro #" + id + "----");
        Thread.sleep(4000); //Apenas para ver o update da data e hora de atualização funcionando
        Boolean ok = catalogo.atualizarLivroPorId(id, new Livro(id, titulo, autor, editora, dataPublicacao));
        if (ok) {
            System.out.println("Livro #" + id + " atualizado.");
        } else {
            System.out.println("Livro não atualizado.");
        }
    }

    /**
     * Método para listar um livro dado um ID.
     * */
    public void listarPorId(String livroId) {
        System.out.println("\n----Listando livros filtrando pelo ID #" + livroId + "----");
        System.out.println(catalogo.retornarLivroPorId(livroId).get().toString());
    }
}
