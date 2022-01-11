package br.com.felixgilioli.exercicios.medio;

/**
 * Classe com métodos para trabalhar com Strings.
 */
public class Strings {

    private Strings() {}

    /**
     * Deve retornar a quantidade de letras maiúsculas que a string {@param str} contém.
     * @param str string.
     * @return inteiro informando a quantidade de letras maiúsculas.
     */
    public static int getQuantidadeLetrasMaiusculas(String str) {
        if (str == null) {
            return 0;
        }

        int quantidadeLetras = 0;
        for ( int i = 0; i < str.length(); i++ ) {
            if(Character.isUpperCase(str.charAt(i))) {
                quantidadeLetras++;
            }
        }
        return quantidadeLetras;
    }

    /**
     * Deve retornar a quantidade de letras minúsculas que a string {@param str} contém.
     * @param str string.
     * @return inteiro informando a quantidade de letras minúsculas.
     */
    public static int getQuantidadeLetrasMinusculas(String str) {
        if (str == null) {
            return 0;
        }

        int quantidadeLetras = 0;
        for ( int i = 0; i < str.length(); i++ ) {
            if(Character.isLowerCase(str.charAt(i))) {
                quantidadeLetras++;
            }
        }
        return quantidadeLetras;
    }

    /**
     * Deve retornar a quantidade de caracteres especiais(*, #, @, !, etc) que a string {@param str} contém.
     * @param str string.
     * @return inteiro informando a quantidade de caracteres especiais.
     */
    public static int getQuantidadeCaracteresEspeciais(String str) {
        if (str == null) {
            return 0;
        }

        int quantidadeCaracteresEspeciais = 0;
        for ( int i = 0; i < str.length(); i++ ) {
            if(str.substring(i, i+1).matches("[^A-Za-z0-9]")) {
                quantidadeCaracteresEspeciais++;
            }
        }
        return quantidadeCaracteresEspeciais;
    }

}
