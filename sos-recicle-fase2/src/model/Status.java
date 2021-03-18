package model;

public class Status {
    //(0 = missao em aberto)(1 = missao aceita)(2 = concluida)
    private int status;

    public Status() {
    }

    public Status(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
      
    
}
