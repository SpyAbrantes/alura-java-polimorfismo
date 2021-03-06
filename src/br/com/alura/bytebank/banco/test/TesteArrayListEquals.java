package br.com.alura.bytebank.banco.test;

import br.com.alura.bytebank.banco.modelo.Conta;
import br.com.alura.bytebank.banco.modelo.ContaCorrente;
import br.com.alura.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(22, 22);
        Conta cc2 = new ContaPoupanca(22, 22);
        lista.add(cc1);

        boolean existe = lista.contains(cc2);
        System.out.println("Já existe? " + existe);

        for(Conta conta : lista){
            System.out.println(conta);
        }
    }
}