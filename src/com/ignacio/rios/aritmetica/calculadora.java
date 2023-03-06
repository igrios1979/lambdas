package com.ignacio.rios.aritmetica;

import java.util.function.BiFunction;

public class calculadora {

public double calcular(double a, double b, Arithmetic lambda){

    return lambda.operation(a,b);
}

public double calcularBi(double a, double b, BiFunction<Double,Double,Double> lambda){

    return lambda.apply(a,b);


}


}
