package br.com.felixgilioli.exercicios.facil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Classe com métodos para trabalhar com objetos do tipo {@link java.time.LocalDate}.
 */
public class LocalDates {

    private LocalDates() {}

    /**
     * Deve retornar a quantidade de dias que se passaram entre as datas {@param inicio} e {@param fim}.
     * @param inicio data de início.
     * @param fim data de fim.
     * @return quantidade de dias entre as datas.
     */
    public static long getQuantidadeDeDiasEntreDatas(LocalDate inicio, LocalDate fim) {
        return Math.abs(ChronoUnit.DAYS.between(inicio, fim));
    }

    /**
     * Deve retornar uma data no futuro com base na data inicial {@param inicio} acrescida de
     * uma determinada quantidade de anos {@param anos}
     * @param inicio
     * @param anos
     * @return
     */
    public static LocalDate getDataAnosAFrente(LocalDate inicio, long anos) {
        return inicio.plusYears(anos);
    }

    /**
     * Deve retornar uma data no passado com base na data inicial {@param inicio} decrescida
     * de uma determinada quantidade de meses {@param meses}
     * @param inicio
     * @param meses
     * @return
     */
    public static LocalDate getDataMesesAtras(LocalDate inicio, long meses) {
        return inicio.minusMonths(meses);
    }

    /**
     * Deve retornar a data fornecida {@param data} formatada em uma string de acordo com o
     * padrão brasileiro e separada por barras, como em 02/12/2020
     * @param data
     * @return
     */
    public static String getDataFormatadaComBarrasNoPadraoBrasileiro(LocalDate data) {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(data);
    }

    /**
     * Deve retornar a data fornecida {@param data} formatada em uma string de acordo com o
     * padrão norte-americano e separada por hífens, como em 2020-12-02
     * @param data
     * @return
     */
    public static String getDataFormatadaComHifensNoPadraoNorteAmericano(LocalDate data) {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd").format(data);
    }
}
