package Domain;

//El enum encapsula los estados posibles de una reserva. Es parte del diseño que ayuda a hacer el código más legible y reutilizable, facilitando el cumplimiento SRP
public enum EStatus {
    Pendiente ("Pendiente"),
    Confirmada ("Confirmada"),
    Cancelada ("Cancelada");
    
    //Almacena la condición del estado
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

