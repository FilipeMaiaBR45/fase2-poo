
package model;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String emailRecebedor;
    private String emailFornecedor;

    
    
    public Endereco() {
    }
    
    

    public Endereco(String rua, int numero, String bairro, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String getEmailRecebedor() {
        return emailRecebedor;
    }

    public void setEmailRecebedor(String emailRecebedor) {
        this.emailRecebedor = emailRecebedor;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + '}';
    }
    
    
    
}
