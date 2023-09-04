package controller;

import model.livro.Livro;
import service.ConvidadoService;
import service.LivroService;
import service.TarefaService;

import java.time.LocalDate;
import java.util.Collection;

public class MainController {

    private final LivroService livroService;

    private final TarefaService tarefaService;

    private final ConvidadoService convidadoService;

    public MainController() {
        livroService = new LivroService();
        tarefaService = new TarefaService();
        convidadoService = new ConvidadoService();
    }

    public void executarMetodosLivros() throws InterruptedException {
        livroService.cadastrarLivro("As Fantasias Eletivas", "Carlos Henrique Schroeder", "Harper Collins", LocalDate.of(2021, 7,19));
        livroService.cadastrarLivro("1808", "Laurentino Gomes", "Objetivo", LocalDate.of(1997, 5,22));
        livroService.cadastrarLivro("Dentro da Baleia e Outros Contos", "George Orwell", "Principis", LocalDate.of(2021, 10,19));
        livroService.cadastrarLivro("Um Pouco de Ar, Por Favor", "George Orwell", "Principis", LocalDate.of(2019, 3,22));
        livroService.cadastrarLivro("Como Fazer Amigos e Influenciar Pessoas", "Dale Carnegie", "Sextante", LocalDate.of(2017, 4,29));
        livroService.cadastrarLivro("A Metamorfose", "Franz Kafka", "Planeta", LocalDate.of(2020, 7,21));


        livroService.listarPorAutor("George Orwell");
        livroService.listarTodosOrdenadoAutor();

        Collection<Livro> livrosKafka = livroService.listarPorAutor("Franz Kafka");
        Livro livro = livrosKafka.isEmpty() ? null : (Livro) livrosKafka.toArray()[0];
        String livroId = livro == null ? "" : livro.getId();

        livroService.listarPorId(livroId);
        livroService.atualizarLivroPorId(livroId, "O Processo", "Franz Kafka", "Planeta", LocalDate.of(2020, 7,21));
        livroService.listarPorId(livroId);
    }

    public void executarMetodosTarefas() {
        tarefaService.executarCadastroDuasTarefasListarPrimeiraTarefaEExcluir();
    }

    public void executarMetodosConvidados() {
        convidadoService.adicionarConvidado("João Victor", 1234);
        convidadoService.adicionarConvidado("Joana Souza", 1234); //Vai retornar erro em sysout pois já existe convidado com o código
        convidadoService.adicionarConvidado("Manuel Pereira", 9554);
        convidadoService.adicionarConvidado("Emanuela Medeiros", 8966);
        convidadoService.adicionarConvidado("Ana Caroline Campos", 2987);

        convidadoService.contarConvidados();

        convidadoService.exibirConvidados();

        convidadoService.removerConvidado(9554);
        convidadoService.exibirConvidados();
    }
}
