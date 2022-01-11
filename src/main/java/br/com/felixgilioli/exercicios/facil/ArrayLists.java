package br.com.felixgilioli.exercicios.facil;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Classe com métodos para trabalhar com listas do tipo {@link java.util.ArrayList}.
 */
public class ArrayLists {

    private ArrayLists() {}

    /**
     * Deve filtrar os elementos de {@param numeros} e retornar apenas os números que são impares.
     * @param numeros lista de inteiros.
     * @return lista de inteiros apenas com números impares.
     */
    public static List<Integer> getImpares(List<Integer> numeros) {
        List<Integer> listNumeroImpares = new ArrayList<>();
        for (Integer numero : numeros) {
            if (numero % 2 != 0) {
                listNumeroImpares.add(numero);
            }
        }
        return listNumeroImpares;
    }

    /**
     * Deve retornar a quantidade de pessoas que começam com a letra {@param letra}
     * @param pessoas lista contendo o nome das pessoas, ex: ["Felix", "Daiane"].
     * @param letra letra na qual deve você retornar a quantidade dos nomes que começam com ela, ex: "F"
     * @return quantidade de pessoas.
     */
    public static long getQuantidadeDePessoasQueComecamComALetra(List<String> pessoas, String letra) {
        List<String> pessoasQueComecamComLetra = new ArrayList<>();
        for ( String pessoa : pessoas ) {
            if (pessoa.substring(0, 1).equals(letra)) {
                pessoasQueComecamComLetra.add(pessoa);
            }
        }
        return pessoasQueComecamComLetra.size();
    }

    /**
     * Deve fazer a leitura de um valor inteiro.{@param valorEntrada}
     * Em seguida, calcule o menor número de notas possíveis(cédulas) onde o valor pode ser decomposto.
     * As notas que você deve considerar são de 100,50,20,10,5,2,1.
     * Na sequencia insira na ordem respetiva a demonstrada acima numa Lista de retorno a quantidade de cada cédula encontrada no calculo.
     *
     * @param valorEntrada Você receberá um valor inteiro N (0 < N < 1000000).
     * @return lista com a quantidade de cédulas encontradas para cada valor.
     */
    public static List<Integer> getMenorQuantidadeDeCedulasPossivelParaInteiro(int valorEntrada) {
        List<Integer> quantidadeDeCedulas = new ArrayList<>();

        int restante = valorEntrada;

        int qtdeCedulas100 = restante / 100;
        restante -= qtdeCedulas100 * 100;

        int qtdeCedulas50 = restante / 50;
        restante -= qtdeCedulas50 * 50;

        int qtdeCedulas20 = restante / 20;
        restante -= qtdeCedulas20 * 20;

        int qtdeCedulas10 = restante / 10;
        restante -= qtdeCedulas10 * 10;

        int qtdeCedulas5 = restante / 5;
        restante -= qtdeCedulas5 * 5;

        int qtdeCedulas2 = restante / 2;
        restante -= qtdeCedulas2 * 2;

        int qtdeCedulas1 = restante / 1;

        quantidadeDeCedulas.add(qtdeCedulas100);
        quantidadeDeCedulas.add(qtdeCedulas50);
        quantidadeDeCedulas.add(qtdeCedulas20);
        quantidadeDeCedulas.add(qtdeCedulas10);
        quantidadeDeCedulas.add(qtdeCedulas5);
        quantidadeDeCedulas.add(qtdeCedulas2);
        quantidadeDeCedulas.add(qtdeCedulas1);

        return quantidadeDeCedulas;
    }

    /**
     * Deve retornar a mesma lista de nomes recebida {@param pessoas}, mas ordenada
     * alfabéticamente em ordem crescente
     * @param pessoas
     * @return
     */
    public static List<String> getPessoasOrdenadasAlfabeticamenteCrescente(List<String> pessoas) {
        Collections.sort(pessoas);
        return pessoas;
    }

    /**
     * Deve retornar a mesma lista de nomes recebida {@param pessoas}, mas ordenada
     * alfabéticamente em ordem decrescente
     * @param pessoas
     * @return
     */
    public static List<String> getPessoasOrdenadasAlfabeticamenteDecrescente(List<String> pessoas) {
        Collections.sort(pessoas, Collections.reverseOrder());
        return pessoas;
    }


}
