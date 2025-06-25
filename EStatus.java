package Domain;
public enum EStatus {
    Pendiente ("Pendiente"),
    Confirmada ("Confirmada"),
    Cancelada ("Cancelada");
    
    
    public String c;
    
    private EStatus(String condition){
        this.c = c;
    }
    public void setStatus(String condition){
        this.c = c;
    }
    public String getStatus(){
        return c;
    }
}

