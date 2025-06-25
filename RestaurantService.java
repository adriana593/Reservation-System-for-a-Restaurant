package Services;

import Domain.*;
import Interface.IServices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class RestaurantService implements IServices{
    
    private  List<Reservation> reservations ;
    
    public RestaurantService (){
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
    
}
