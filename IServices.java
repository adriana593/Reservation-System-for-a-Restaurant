package Interface;
import Domain.*;

public interface IServices {
    boolean addReservation( Reservation r);
    boolean updateReservation(String idReservation, String customerName, int numberOfPeople, Date date, Time time);
    boolean confirmReservation (String id);
    boolean cancelReservation(String id);
    Reservation getReservation(String id);
    
    
}
