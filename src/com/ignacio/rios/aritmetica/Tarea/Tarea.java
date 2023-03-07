package com.ignacio.rios.aritmetica.Tarea;

import java.util.function.Function;

public class Tarea {

    public static void main(String[] args) {

        Function<String,String> procesar = (frase)->{

            String procesada = frase.replaceAll("[,.\\s]+", "").toUpperCase();
            return procesada;
        };

        String fraseOriginal = "Hola, ¿cómo hf  ...estás?";
        String fraseProcesada = procesar.apply(fraseOriginal);
        System.out.println(fraseProcesada);


    }
}
