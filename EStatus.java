package Domain;
public enum EStatus {
    Pendiente ("Pendiente"),
    Confirmada ("Confirmada"),
    Cancelada ("Cancelada");
    
    
    public String condition;
    
    private EStatus(String condition){
        this.condition = condition;
    }
    public void setStatus(String condition){
        this.condition = condition;
    }
    public String getStatus(){
        return condition;
    }
}

