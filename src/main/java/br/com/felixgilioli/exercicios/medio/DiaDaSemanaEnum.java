package br.com.felixgilioli.exercicios.medio;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Enum com dias da semana.
 */
public enum DiaDaSemanaEnum {

    DOMINGO("Domingo"),
    SEGUNDA_FEIRA("Segunda-feira"),
    TERCA_FEIRA("Terça-feira"),
    QUARTA_FEIRA("Quarta-feira"),
    QUINTA_FEIRA("Quinta-feira"),
    SEXTA_FEIRA("Sexta-feira"),
    SABADO("Sábado");

    private final String descricao;

    DiaDaSemanaEnum(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna a descrição do dia da semana.
     * @return descrição do dia da semana.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Deve retornar um enum {@link DiaDaSemanaEnum} com base na descrição {@param descricao}.
     * @param descricao descrição do enum.
     * @return enum.
     */
    public static DiaDaSemanaEnum getEnumPelaDescricao(String descricao) {
        for (DiaDaSemanaEnum diaDaSemanaEnum : values()) {
            if (diaDaSemanaEnum.getDescricao().equals(descricao)) {
                return Arrays.stream(DiaDaSemanaEnum.values())
                        .filter(e -> e.getDescricao().equals(descricao))
                        .findFirst().get();
            }
        }
        return null;
    }

}
