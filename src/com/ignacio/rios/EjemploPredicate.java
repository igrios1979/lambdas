package com.ignacio.rios;

import org.ignacio.rios.lambda.Models.usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {

    public static void main(String[] args) {


        Predicate<Integer> test = num -> num >10;
        boolean  a = test.test(12);

        System.out.println(a);

        Predicate<String> t2 = rol -> rol.equals("Admin"); // intefaz funcional que devuelve un boolean
        boolean z = t2.test("Admpin");
        System.out.println("t2 = " + z);

        BiPredicate<String,String> t3 = (frase1,frase2)-> frase1.contentEquals(frase2);
        System.out.println(t3.test("hol5a","hola"));

        BiPredicate<Integer,Integer> t4 = (h,b)-> h<b;
        System.out.println("t4.test(1,2) = " + t4.test(10,2));
        
        usuario uno = new usuario();
        usuario dos = new usuario();
        
        uno.setNombres("ignacio");
        dos.setNombres("ignacio ");
        
        BiPredicate<usuario,usuario> t6 = (u,r)-> u.getNombres().equals(r.getNombres());

        System.out.println("t6.test(uno,dos) = " + t6.test(uno,dos));
        


    }


}
