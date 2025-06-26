import Domain.*;
import Services.RestaurantService;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class RestaurantServiceTest {
    public RestaurantService service;

    @Before
     public void setUp() {
        service = new RestaurantService(new ArrayList<>());
    }
     
    @Test
    public void testAddReservation(){
        // Se crea y agrega una nueva reserva.
        Reservation reservation = new Reservation("1", "José Miguel", 30 , new Date(24, 12, 2025) , new Time(23, 30));
        service.addReservation(reservation);
        
        // Se valida que la lista de reservas ya no esté vacía y que los datos de la reserva agregada sean correctos.
        assertFalse(service.getReservations().isEmpty());
        assertTrue(service.getReservations().contains(reservation));
     }    
   @Test
    public void testUpdateReservation() {
        // Se crea y agrega una nueva reserva.
        Reservation reservation = new Reservation("2", "Ana Gomez", 3, new Date(28, 2, 2025) , new Time(14, 30));
        service.addReservation(reservation);
        
        // Se definen nuevos datos para actualizar la reserva.
        String newName = "Ana Actualizada";
        int newNumber = 5;
        Date date = new Date(2025, 2, 30);
        Time time = new Time(12, 40);
        
        // Se actualiza la reserva.
        service.updateReservation("2", newName, newNumber, date, time);
        
        // Se recupera la reserva actualizada.
        Reservation updated = service.getReservations().get(0);
        assertEquals(newName, updated.getCustomerName());
        assertEquals(newNumber, updated.getNumberOfPeople());
        assertEquals(date, updated.getDate());
        assertEquals(time, updated.getTime());
    } 
    @Test
    public void testConfirmReservation() {
        // Se agrega una reserva con estado por defecto 'Pendiente'.
        Reservation reservation = new Reservation("3", "Carlos Lopez", 2, new Date(3, 4, 2025), new Time(17, 00) );
        service.addReservation(reservation);
        
        // Se ejecuta la confirmación.
        service.confirmReservation("3");
        
        // Se verifica que el estado de la reserva haya cambiado a 'Confirmada'.
        Reservation confirmed = service.getReservations().get(0);
        assertEquals(EStatus.Confirmada, confirmed.getStatus());
    }
  } 
