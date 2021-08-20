public class Administrador extends Funcionario implements Autenticavel{

    private int senha;

    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int Senha) {

    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }
}
