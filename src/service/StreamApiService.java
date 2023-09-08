package service;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class StreamApiService {

    /**
     * Exemplo de método usando a <i>functional interface</i> {@link Consumer} para dizer quais números de uma lista são divisíveis dado um divisor.
     * @param numeros Números a serem verificados
     * @param divisor Divisor
     */
    public void listarDivisores(List<Integer> numeros, Integer divisor) {
        System.out.println("É Divisor - Número");

        numeros.forEach(numero -> {
            if (numero % divisor == 0) {
                System.out.println("Sim - " + numero);
            } else {
                System.out.println("Não - " + numero);
            }
        });
    };

    /**
     * Exemplo de método usando a <i>functional interface</i> {@link Supplier} para retornar uma saudação.
     */
    public void listarSaudacoes() {
        List<String> listarSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo!").limit(3).toList();
        listarSaudacoes.forEach(System.out::println);
    }

    /**
     * Exemplo de método usando a <i>functional interface</i> {@link Function} para retornar números dobrados à partir de uma lista de números.
     */
    public void dobrarNumeros() {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> numerosDobrados = numeros.stream().map(n -> n * 2).toList();
        numerosDobrados.forEach(System.out::println);
    }

    /**
     * Exemplo de método usando a <i>functional interface</i> {@link Predicate} para retornar palavras com mais de cinco caracteres.
     */
    public void retornarPalavrasComMaisDeCincoCaracteres() {
        List<String> palavras = Arrays.asList("java", "go", "javascript");
        palavras.stream().filter(palavra -> palavra.length() > 5).forEach(System.out::println);
    }

    /**
     * Exemplo de método usando a <i>functional interface</i> {@link BinaryOperator} para retornar a soma de números.
     */
    public void somarNumeros() {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);
        int resultado = numeros.stream().reduce(0, (n1, n2) -> n1 + n2); //Para ficar mais descritivo, pode ser substituído por Integer::sum
        System.out.println("Resultado: " + resultado);
    }
}
