package br.com.alura.bytebank.banco.modelo;

public class Designer extends Funcionario{


    public double getBonificacao() {
        System.out.println("Chamando Bonificacao do DESIGNER");
        return 200.0;
    }
}