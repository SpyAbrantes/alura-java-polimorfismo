package br.com.alura.bytebank.banco.test;

import br.com.alura.bytebank.banco.modelo.ContaCorrente;
import br.com.alura.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111, 321);
        cc.deposita(200.00);
        try{
            cc.saca(200.00);
        } catch (SaldoInsuficienteException ex){
            System.out.println("Exception " + ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println("Saldo" + cc.getSaldo());
    }
}
