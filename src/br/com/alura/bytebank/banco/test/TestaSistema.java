package br.com.alura.bytebank.banco.test;

import br.com.alura.bytebank.banco.modelo.Gerente;
import br.com.alura.bytebank.banco.modelo.SistemaInterno;

public class TestaSistema {

    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
    }
}
