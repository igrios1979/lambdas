package org.ignacio.rios.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {

    public static void main(String[] args) {

         Function<String,String> fun = param ->{return "hola q tal " + param ;};
         String resultado = fun.apply("ignacio"); // metodo apply que pasa el parametro a la funcion
         System.out.println(resultado); // imprimo

         Function<String,String> fun2 = param ->{return param.toUpperCase();};

         // otra version Function<String,String> String::toUpperCase();

        System.out.println("-> "+fun2.apply("ignacio rios"));


        Function<String, Integer> convertirAEntero = Integer::parseInt;
        Integer resul = convertirAEntero.apply("123");


        System.out.println(""+ resul + 6);

        Float sueldo = 253000.0f;
        Float b= 0.0f;
        Float  porcentaje = 25f;
        Float redo = (sueldo * porcentaje);

        System.out.print( "Calculo porcentaje...    " + porcentaje + "%  -> "  );
        System.out.println( (redo/100));
        System.out.print( "sueldo + aumento  ... ");
        System.out.println( (redo/100)+sueldo);
        
        
        /*BiFunction<String,String,Integer> comparador = (a,w)->{
            int c = a.compareTo(w);
            return c;
        };*/

        BiFunction<String,String,Integer> comparador = String::compareTo;




        int comparator =  comparador.apply("cacho","cacho");
        System.out.println("comparator = " + comparator);



        if(comparator ==0){
            System.out.println("ambas cadenas con iguales");
        }else{
            System.out.println("nada que ver   " );
        }

        BiFunction<Integer,Double,Double> bi = (numero3,numero4)->{
           Double  elevate = Math.pow(numero3,numero4); 
            
          return elevate;  
        };

       Double finalelevate =  bi.apply(81,0.5);

        System.out.println("finalelevate = " + finalelevate);
        
        
    }


}
