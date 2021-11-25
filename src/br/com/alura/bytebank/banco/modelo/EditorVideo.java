package br.com.alura.bytebank.banco.modelo;

public class EditorVideo extends Funcionario{


    public double getBonificacao() {
        System.out.println("Chamando Bonificacao do EDITOR DE VIDEO");
        return 150.0;
    }
}
