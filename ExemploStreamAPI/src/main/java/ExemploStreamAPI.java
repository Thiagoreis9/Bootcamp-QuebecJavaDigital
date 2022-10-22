import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream().
                limit(5).
                collect(Collectors.toSet()).
                forEach(System.out::println);
        List<String> numerosAleatorios5Primeiros = numerosAleatorios.stream().
                limit(5).
                collect(Collectors.toList());
        System.out.println(numerosAleatorios5Primeiros);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        List<Integer> numerosInteiros = numerosAleatorios.stream().
                map(Integer::parseInt).
                collect(Collectors.toList());

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        numerosAleatorios.stream().map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares: ");
        numerosInteiros.removeIf(i -> i % 2 != 0);
        System.out.println(numerosInteiros);

        List<Integer> numerosAleatoriosInteger = Arrays.asList(1, 0, 4, 1, 2, 3, 9, 9, 6, 5);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatoriosInteger.stream()
                .skip(3).
                forEach(System.out::println);

        long countNumerosUnicos = numerosAleatoriosInteger.stream().distinct().count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

        int somaDosNumerosPares = numerosAleatoriosInteger.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        //collect(Collectors.groupingBy(new Function())
        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");

        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
    }
}