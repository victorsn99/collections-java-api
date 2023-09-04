import controller.MainController;
import model.livro.Livro;
import service.LivroService;
import service.TarefaService;

import java.time.LocalDate;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Gerenciador de livros e tarefas!\n");

            MainController controller = new MainController();
            controller.executarMetodosTarefas();
            controller.executarMetodosLivros();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao executar a aplicação! Motivo: " + e.getMessage());
        }
    }


}