package br.com.alura.bytebank.banco.test;

import br.com.alura.bytebank.banco.modelo.Conta;
import br.com.alura.bytebank.banco.modelo.ContaCorrente;
import br.com.alura.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencias {

    public static void main(String[] args) {

        Conta[] contas = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(10,20);
        ContaPoupanca cc2 = new ContaPoupanca(30, 40);

        contas[0]= cc1;
        contas[1]= cc2;

        ContaCorrente ref = (ContaCorrente) contas[0];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
    }
}
