package org.ignacio.rios.lambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;

public class consumer {

    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha ->{
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                                        System.out.println(f.format(fecha));};


        consumidor.accept(new Date());
    }
}
