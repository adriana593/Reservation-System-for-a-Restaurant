package Services;

import Domain.*;
import Interface.IServices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RestaurantService implements IServices {

    private List<Reservation> reservations;

    public RestaurantService() {
        this.reservations = new ArrayList<>();
    }

    public RestaurantService(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void setReservation(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public boolean addReservation(Reservation reservation) {
         return reservations.add(reservation);
    }
    
    @Override
    public boolean updateReservation(String id, String customerName, int numberOfPeople, Date date, Time time) {
        int index =searchID(id);
        if (index >= 0 && reservations != null  ){
            Reservation reservation = reservations.get(index);
            reservation.setCustomerName(customerName);
            reservation.setDate(date);
            reservation.setNumberOfPeople(numberOfPeople);
            reservation.setTime(time); 
            return true;
        }else{
            return false;
        }
    }
        
        private int searchID(String id){
        Reservation key = new Reservation(id, null,-1, null, null);
        Comparator<Reservation> c = new Comparator<Reservation>(){
            @Override
            public int compare(Reservation o1, Reservation o2) {
                return o1.getIDReservation().compareTo(o2.getIDReservation());
            }
    };
        Collections.sort(reservations, c);
        return Collections.binarySearch(reservations,key, c);       
    }
          
}
