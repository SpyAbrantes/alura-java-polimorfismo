package br.com.alura.bytebank.banco.modelo;

public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(String msg){
         super(msg);
    }
}
