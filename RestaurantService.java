package Services;

//Esta clase implementa la interface IServices, lo que permite adherirse al Open/Close (OCP): el sistema queda abierto para extender nuevas funcionalidades sin modificar las existentes. Además el uso de la interfaz para definir el comportamiento permite aplicar el Dependency Inversion Principle (DIP) en capas superiores, depender de la abstracción y no de la implementación concreta 
import Domain.*;
import Interface.IServices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RestaurantService implements IServices {
//SRP: La responsabilidad de esta clase es gestionar las reservas 
    private List<Reservation> reservations;

    //Constructor: Aquí debemos inicializar correctamente la lista para evitar errores
    //DIP: Recibe una lista pero se puede inyectar otra implementación en tiempo de ejecución
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
        // Método privado para buscar una reserva por ID
        // SRP: Este método se encarga únicamente de la búsqueda.
        private int searchID(String id){
        Reservation key = new Reservation(id, null,-1, null, null);
        Comparator<Reservation> c = new Comparator<Reservation>(){
            @Override
            public int compare(Reservation o1, Reservation o2) {
                return o1.getIDReservation().compareTo(o2.getIDReservation());
            }
    };
        // NOTA: Ordenar la lista y hacer binarySearch respeta OCP, pero puede ser optimizado para eficiencia.
        Collections.sort(reservations, c);
        return Collections.binarySearch(reservations,key, c);       
    }
        
        @Override
    public boolean confirmReservation(String id) { 
        int index = searchID(id);
           if(index >=0){
            Reservation reservation = reservations.get(index);
            reservation.setStatus(EStatus.Confirmada);
            return true;
        }else{
                return false;
        }        
    }

    @Override
    public boolean cancelReservation(String id) {
        int index = searchID(id);
        if (index < 0) {
            reservations.remove(index);
            return true;
        }else{ 
            return false; 
        }
    }  
    
    @Override
    public Reservation getReservation(String id) {
         int index = searchID(id);
            if(index >= 0){
                return reservations.get(index);
            }else{
            return null;
        }
    }
}
