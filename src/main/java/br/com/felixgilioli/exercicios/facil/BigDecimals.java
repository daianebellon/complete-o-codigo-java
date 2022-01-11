package br.com.felixgilioli.exercicios.facil;

import jdk.jfr.Percentage;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Classe com métodos para trabalhar com {@link java.math.BigDecimal}.
 */
public class BigDecimals {

    private BigDecimals() {}

    /**
     * Deve retornar o valor com base no percentual.
     * Exemplo de entrada: valor=1000, percentual=10.
     * Exemplo de saída: 100.
     * @param valor valor total.
     * @param percentual percentual.
     * @return valor com base no percentual.
     */
    public static BigDecimal getValorComBaseNoPercentual(BigDecimal valor, BigDecimal percentual) {
        if (percentual.equals(BigDecimal.ZERO) || valor.equals(BigDecimal.ZERO)) {
            return BigDecimal.ZERO;
        }
        return valor.multiply(percentual).divide(new BigDecimal("100"));
    }
}
