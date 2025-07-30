package Bus_reservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Booking {
          String passengerName;
          int busno;
          Date date;
          
          Booking() throws ParseException{
        	  Scanner scanner = new Scanner(System.in);
        	  System.out.println("Enter name of Passenger: ");
        	  passengerName = scanner.next();
        	  System.out.println("Enter Bus number: ");
        	  busno = scanner.nextInt();
        	  System.out.print("Enter date dd-mm-yyyy: ");
        	  String dateInput = scanner.next();
        	  SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy");
        	  
        	  
        	  date = dataFormat.parse(dateInput);
        	  
          }
          
          public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses)
          {
        	  int capacity = 0;
        	  for(Bus bus:buses) {
        		  if(bus.getBusno() == busno)
        			  capacity = bus.getCapacity();
        	  }
        	  int booked = 0;
        	  for(Booking b:bookings) {
        		  if(b.busno == busno && b.date.equals(date)) {
        			  booked++;
        			  
        		  }
        	  }
        	  return booked<capacity?true:false;
        	  
          }
}
