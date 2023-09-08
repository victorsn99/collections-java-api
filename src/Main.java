import controller.MainController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Gerenciador de livros e tarefas!\n");

            Scanner sc = new Scanner(System.in);
            MainController controller = new MainController();
            boolean continuar = true;

            for (int i = 0; i == i; i++) {
                if (continuar) {
                    System.out.println("---------------------------------\nEscolha uma operação:\n\n1 - Executar Métodos da Tarefa\n2 - " +
                            "Executar Métodos de Livros\n3 - Executar Métodos de Convidados\n4 - Executar Métodos de Exemplos para Consumer\n" +
                            "5 - Executar Métodos Saudação\n" +
                            "0 - Sair\n");

                    int opcao = sc.nextInt();

                    switch (opcao) {
                        case 0:
                            continuar = false;
                            break;
                        case 1:
                            controller.executarMetodosTarefas();
                            break;
                        case 2:
                            controller.executarMetodosLivros();
                            break;
                        case 3:
                            controller.executarMetodosConvidados();
                            break;
                        case 4:
                            controller.executarMetodoListarDivisores();
                            break;
                        case 5:
                            controller.executarMetodoSaudacao();
                            break;
                    }
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao executar a aplicação! Motivo: " + e.getMessage());
        }
    }


}