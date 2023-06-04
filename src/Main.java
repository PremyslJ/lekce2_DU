import com.engeto.hotel.Booking;
import com.engeto.hotel.Guest;
import com.engeto.hotel.Room;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.engeto.hotel.Room.*;
import static java.time.LocalDate.*;

public class Main {
    public static void main(String[] args) {

        // vytvoření pole
        List<Guest> guestList = new ArrayList<>();

        // vytvoření objektů hostů
        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993,3,19));
        Guest guest2 = new Guest(" Jan", "Dvořáček", LocalDate.of(1995,5,5));
          guestList.add(guest1);
          guestList.add(guest2);


          LocalDate date= guest1.getDateOfBirth();
        System.out.println(""+date.getDayOfMonth()+"."+date.getMonth()+"."+date.getYear());
//
//        List<Guest> guestList = new ArrayList<>();
//
//        guestList.add(new Guest("Adéla", "Malíková", LocalDate.of(1993, 03, 13)));
//        guestList.add(new Guest("  Jan", "  Dvořák", of(1995, 05, 5)));
//
//         for(int i = 0; i<20; i++){
//        guestList.add(new Guest(""+i, "  Dvořák", LocalDate.of(1995,05,5)));
//
//    }
       for (Guest guest : guestList) {
            System.out.println("ID  " + guest.getId() + "   " + guest.getName() + "   " + guest.getSurname() + "    (" + guest.getDateOfBirth() + ")");
        }
        System.out.println("                   ");
        // vytvoření objektů pokojů
        Room apartment1 = new Room(1, 1, 1000, true, false);
        Room apartment2 = new Room(2, 1, 1000, true, true);
        Room apartment3 = new Room(3, 3, 2400, false, false);
        //výpis pokojů
        apartment1.getDescription();
        apartment2.getDescription();
        apartment3.getDescription();

        List<Guest>otherGuests = new ArrayList<>();
        otherGuests.add(guest2);

        List<Booking>bookingList = new ArrayList<>();

        // vytvoření objektů rezervací
        Booking booking1 = new Booking(apartment1,guestList.get(0),LocalDate.of(2021,7,19),LocalDate.of(2021,7,26));
        Booking booking2 = new Booking(apartment1,guestList.get(1), LocalDate.of(2022,7,19),LocalDate.of(2022,7,26));
        Booking booking3 = new Booking(apartment3,guestList, LocalDate.of(2021,9,1),LocalDate.of(2021,9,14));
        bookingList.add(booking1);
        bookingList.add(booking2);
        bookingList.add(booking3);

        //výpis rezervací
        booking1.getDescription();
        booking2.getDescription();
        booking3.getDescription();

//        System.out.println(bookingList);
//        bookingList.toString();
//        for(Booking booking: bookingList) {
//            System.out.println(booking.getRoom()+" " +booking.getGuest());
        }

        }










