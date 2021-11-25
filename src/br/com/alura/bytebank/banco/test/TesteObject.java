package br.com.alura.bytebank.banco.test;

import br.com.alura.bytebank.banco.modelo.ContaCorrente;
import br.com.alura.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

    public static void main(String[] args) {

        Object cc = new ContaCorrente(22, 33);
        Object cp = new ContaPoupanca(44, 55);

        System.out.println(cc);
        System.out.println(cp);
    }
}
