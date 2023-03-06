package org.ignacio.rios.lambda;

import org.ignacio.rios.lambda.Models.usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class consumer {

    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha ->{
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                                        System.out.println(f.format(fecha));};


        consumidor.accept(new Date());


        BiConsumer<Integer,Integer> suma = (numero1, numero2)->{
            System.out.println(numero1  +numero2);

        };
        suma.accept(360,450);

         Consumer<String> con = System.out::println; // cuando se recibe el mismo argumento que se pasa se puede abreviar


         Consumer<String> con2 = men ->{
             System.out.println(men);
         };

         con2.accept("holis otra forma de llamar a la funcion ");
         con.accept("holiss");

        List<String> nombres = Arrays.asList("ignacio","jose","Pedro");
        nombres.forEach(con2);

        Consumer<Integer> interes = Integer ->{
            System.out.println((Integer*75*30)/(36000));
        } ;

       // interes.accept(1000);
        List<Integer> numeros = Arrays.asList(6000000);
         numeros.forEach(interes);

        //Supplier<usuario> creaUsuario = ()-> new usuario();

        Supplier<usuario> creaUsuario = usuario::new;
        usuario u = creaUsuario.get();



        /*
         BiConsumer<usuario, String> asigna = (persona,nombre)->{
           persona.setNombres(nombre);

         }; es lo mismo que esto de abajo */
        BiConsumer<usuario, String> asigna = usuario::setNombres;


         asigna.accept(u,"IGNACIO");

        System.out.println("nombre ->>"+ u.getNombres());


        Supplier<String> devuelve = ()->{

            return "hola";
        };
        System.out.println("------|-|-|-|-|-|-|-|-----> " + devuelve.get());




         }






    }

