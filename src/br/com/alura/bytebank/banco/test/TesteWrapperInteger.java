package br.com.alura.bytebank.banco.test;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        Integer idadeRef =29; // Autoboxing, é criado um objeto do tipo Integer.
        int primitivo = new Integer(21); // Unboxing // Construtor deprecated, valueOf();

        List <Integer> lista = new ArrayList<>();
        lista.add(idadeRef);
        lista.add(primitivo); // autoboxing

        int i1 = lista.get(0); //unboxing
        Integer i2 = lista.get(1);

        System.out.println(i1);
        System.out.println(i2);

        Integer valorRef = Integer.valueOf(33);
        int valorPri = valorRef.intValue();

        System.out.println(valorPri);


        Integer iParseando1 = Integer.valueOf("42");
        int iParseando2 = Integer.parseInt("44");

        System.out.println(iParseando1);
        System.out.println(iParseando2);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

    }
}
