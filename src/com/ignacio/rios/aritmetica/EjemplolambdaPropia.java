package com.ignacio.rios.aritmetica;

public class EjemplolambdaPropia {

    public static void main(String[] args) {

        Arithmetic suma = Double::sum;
        Arithmetic resta = (a, b) -> a - b;


        calculadora cal = new calculadora();

        System.out.println(" |=> " + cal.calcular(10, 2, suma));
        System.out.println(" |=> " + cal.calcular(45, 25, resta));
        System.out.println("cal.calcular(10,5,(a,b)->a*b) = " + cal.calcular(10, 5, (a, b) -> a * b));
        System.out.println("cal.calcular(10,5,(a,b)->a/b) = " + cal.calcular(10, 5, (a, b) -> a / b));

        System.out.println("cal.calcularBi(1000,5,(a,b)->a/b) = " + cal.calcularBi(1000, 5, (a, b) -> a / b));


    }
}