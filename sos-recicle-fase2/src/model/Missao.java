package model;



public class Missao {
    private int id;
    private String nome;
    private int pontuacao ;
    private Status status;
    private String objetivo;
    private String emailDoCriador;
    private String emailDoFornecedor;
    private Material material;
    private int qtdMaterial;
    
    
    
    public int getQtdMaterial() {
        return qtdMaterial;
    }

    public void setQtdMaterial(int qtdMaterial) {
        this.qtdMaterial = qtdMaterial;
    }

    public Missao() {
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getEmailDoCriador() {
        return emailDoCriador;
    }

    public void setEmailDoCriador(String emailDoCriador) {
        this.emailDoCriador = emailDoCriador;
    }

    public String getEmailDoFornecedor() {
        return emailDoFornecedor;
    }

    public void setEmailDoFornecedor(String emailDoFornecedor) {
        this.emailDoFornecedor = emailDoFornecedor;
    }

    

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int calcularPontuacao(int peso, int qtdMaterial){
        this.pontuacao = qtdMaterial * peso;
        
        return pontuacao;
    }

    @Override
    public String toString() {
        return "Missao{" + "nome=" + nome + ", pontuacao=" + pontuacao + ", status=" + status + ", objetivo=" + objetivo + ", emailDoCriador=" + emailDoCriador + ", emailDoFornecedor=" + emailDoFornecedor + ", material=" + material + '}';
    }
   
    
  //pontuacao = material x quantidade(kg) 6 metal 5 borracha 4 madeira 3 plastico 2 vidro 1 papel
    
}
