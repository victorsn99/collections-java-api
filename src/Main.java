import model.livro.Livro;
import service.LivroService;
import service.TarefaService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gerenciador de livros e tarefas!\n");

        //TarefaService tarefaService = new TarefaService();
        //tarefaService.executarCadastroDuasTarefasListarPrimeiraTarefaEExcluir();

        LivroService livroService = new LivroService();
        livroService.cadastrarLivro("As Fantasias Eletivas", "Carlos Henrique Schroeder", "Harper Collins", LocalDate.of(2021, 7,19));
        livroService.cadastrarLivro("1808", "Laurentino Gomes", "Objetivo", LocalDate.of(1997, 5,22));
        livroService.cadastrarLivro("Dentro da Baleia e Outros Contos", "George Orwell", "Principis", LocalDate.of(2021, 10,19));
        livroService.cadastrarLivro("Um Pouco de Ar, Por Favor", "George Orwell", "Principis", LocalDate.of(2019, 3,22));

        livroService.listarPorAutor("George Orwell");
        livroService.listarTodosOrdenadoAutor();
    }


}