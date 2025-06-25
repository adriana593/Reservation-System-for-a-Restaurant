package Domain;

public class Reservation {
    private String IDReservation;
    private String customerName;
    private int numberOfPeople;
    private Date date;
    private Time time;
    private EStatus status;
    
    public Reservation (String ID, String customerName, int numberOfPeople, Date date, Time time){
        this.IDReservation = ID;
        this.customerName = customerName;
        this.date = date;
        this.numberOfPeople = numberOfPeople;
        this.time = time;
        
        this.status = EStatus.Pendiente;
       
    }

    public String getIDReservation() {
        return IDReservation;
    }

    public void setIDReservation(String ID) {
        this.IDReservation = ID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }
    
    
    
}
