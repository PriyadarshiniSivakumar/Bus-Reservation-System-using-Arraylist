package Bus_reservation;
import java.util.Scanner;
import java.text.ParseException;
import java.util.ArrayList;

public class Bus_demo {
	public static void main(String[] args) throws ParseException {
		// Bus buses[] = new Bus[50];  //arraylist - collection
		
		//ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		
		buses.add(new Bus(1, true, 2));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		
		int userOption =1;
		Scanner scanner  = new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		
		while(userOption==1) {
			System.out.println("Enter 1 to book and 2 to exit");
			userOption = scanner.nextInt();
			if(userOption == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
					
				}
				else
					System.out.println("Sorry, Bus is Full. Try another Bus or Date...");
				
			}
					}
	}

}
