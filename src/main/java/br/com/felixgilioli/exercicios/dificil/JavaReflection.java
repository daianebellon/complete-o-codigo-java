package br.com.felixgilioli.exercicios.dificil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe com exercícios sobre java reflection.
 */
public class JavaReflection {

    private JavaReflection() {}

    /**
     * Deve retornar o nome dos atributos do objeto {@param objeto}.
     * obs: os nomes devem ser retornados em ordem alfabetica.
     * @return lista com nome dos atributos.
     */
    public static List<String> getNomeDosAtributosDoObjeto(Object objeto) {
        if (objeto == null) {
            List<String> objects = new ArrayList<>();
            return objects;
        }

        Class<?> clazz = objeto.getClass();
        List<String> strings = new ArrayList<>();

        for ( int i = 0; i < clazz.getDeclaredFields().length; i++ ) {
            Field declaredField = clazz.getDeclaredFields()[i];
            strings.add(declaredField.getName());
        }
        return strings.stream().sorted().collect(Collectors.toList());
    }

}
