package br.com.alura.bytebank.banco.modelo;

public interface Autenticavel {


     void setSenha(int Senha);

     boolean autentica(int senha);

}
