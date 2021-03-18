package model;

public class UsuarioRecebedor extends Usuario{
    private int nivel = 0;

    public UsuarioRecebedor() {
    }

    public UsuarioRecebedor(int nivel, String nome, String email, Endereco endereco, String telefone, int funcao) {
        super(nome, email, endereco, telefone, funcao);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    //-----------------------------------------------------------------------------------------------------------
    
   
    
}
