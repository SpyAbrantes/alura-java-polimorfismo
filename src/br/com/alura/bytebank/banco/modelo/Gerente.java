package br.com.alura.bytebank.banco.modelo;

public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }

    public double getBonificacao(){
        System.out.println("Chamando Bonificacao do GERENTE");
        return super.getSalario();
    }
}
