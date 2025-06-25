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
  } 
