
package model;

public class Usuario {
    private String nome; 
    private String email; 
    private Endereco endereco; 
    private String telefone; 
    private int funcao;
    private String senha;

  
    public Usuario() {
    }

    public Usuario(String nome, String email, Endereco endereco, String telefone, int funcao) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.funcao = funcao;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getFuncao() {
        return funcao;
    }

    public void setFuncao(int funcao) {
        this.funcao = funcao;
    }
      public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
//    public String cadastrarUsuario() {
//       
//        
//       return "usuario de email: " + email + "cadastrado com sucesso"; 
//    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", email=" + email + ", endereco=" + endereco + ", telefone=" + telefone + ", funcao=" + funcao + ", senha=" + senha + '}';
    }

        
}
