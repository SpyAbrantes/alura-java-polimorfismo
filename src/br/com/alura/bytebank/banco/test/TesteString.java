package br.com.alura.bytebank.banco.test;

import java.util.Locale;

public class TesteString {

    public static void main(String[] args) {

        String nome = "Gabriel"; //Object Literal
        String outro = new String ("Alura"); //Má prática, sempre preferir a sintaxe literal

        String novo = outro.replace("A", "a");

        System.out.println(novo);

        String lowerCase = nome.toLowerCase();
        System.out.println(lowerCase);

        String upperCase = nome.toUpperCase();
        System.out.println(upperCase);

        char c = nome.charAt(3);
        System.out.println(c);

        int pos = nome.indexOf("riel");
        System.out.println(pos);

        String sub = nome.substring(1);
        System.out.println(sub);

        for (int i = 0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }

        String nome2 = "ALURA";
        CharSequence cs = new StringBuilder("al");

        nome2 = nome2.replace("AL", cs);

        System.out.println(nome2);
    }
}
