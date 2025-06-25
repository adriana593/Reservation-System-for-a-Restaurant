package Domain;

public class Reservation {
    private String IDR;
    private String cN;
    private int nOP;
    private Date d;
    private Time t;
    private EStatus s;
    
    public Reservation (String ID, String cN, int nOP, Date d, Time t){
        this.IDR = ID;
        this.cN = cN;
        this.d = d;
        this.nOP = nOP;
        this.t = t;
        
        this.s = EStatus.Pendiente;
       
    }

    public String getIDR() {
        return IDR;
    }

    public void setIDR(String ID) {
        this.IDR = ID;
    }

    public String getCN() {
        return cN;
    }

    public void setCN(String cN) {
        this.cN = cN;
    }

    public int getNOP() {
        return nOP;
    }

    public void setNOP(int nOP) {
        this.nOP = nOP;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public Time getT() {
        return t;
    }

    public void setT(Time t) {
        this.t = t;
    }

    public EStatus getS() {
        return s;
    }

    public void setS(EStatus s) {
        this.s = s;
    }
    
    
    
}
