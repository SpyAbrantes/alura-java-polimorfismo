package br.com.alura.bytebank.banco.modelo;

/**
 * Classe que representa um cliente no ByteBank
 *
 * @author Gbariel Abrantes
 * @version 0.1
 */
public class Cliente implements Autenticavel{

    private AutenticacaoUtil autenticador;
    private String nome;
    private String cpf;
    private String profissao;

    public Cliente(){
        this.autenticador = new AutenticacaoUtil();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }


}
