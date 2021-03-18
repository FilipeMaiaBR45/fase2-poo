package model;

public class UsuarioFornecedor extends Usuario {
    private int pontuacao;

    public UsuarioFornecedor() {
    }

    public UsuarioFornecedor(int pontuacao, String nome, String email, Endereco endereco, String telefone, int funcao) {
        super(nome, email, endereco, telefone, funcao);
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    public int somarPontuacao(int valorDaMissao){
        pontuacao = pontuacao + valorDaMissao;
        
        return pontuacao;
    }
    
    
}
