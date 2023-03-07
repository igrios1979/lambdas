package com.ignacio.rios.aritmetica.Tarea;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Tareados {
    public static void main(String[] args) {
        Function<String, String> procesarFrase = (frase) -> {
            String[] palabras = frase.split("\\s+");
            Map<String, Long> conteo = Arrays.<String>stream(palabras)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            String masRepetida = conteo.entrySet().stream()
                    .max(Map.Entry.comparingByValue())
                    .get().getKey();
            return masRepetida;
        };
        String fraseOriginal = "La casa de la casa de la casa es azul";
        String palabraMasRepetida = procesarFrase.apply(fraseOriginal);
        System.out.println("La palabra más repetida es: " + palabraMasRepetida);
    }
}













