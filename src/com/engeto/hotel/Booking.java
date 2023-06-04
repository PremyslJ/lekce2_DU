package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Room room;
    private Guest guest;
    private List<Guest> otherGuests =new ArrayList<>();
    private LocalDate bookingFrom;
    private LocalDate bookingTo;

    public Booking(Room room, Guest guest, LocalDate bookingFrom, LocalDate bookingTo) {
        this.room = room;
        this.guest = guest;
        this.bookingFrom = bookingFrom;
        this.bookingTo = bookingTo;
    }

    public Booking(Room room, List<Guest> otherGuests, LocalDate bookingFrom, LocalDate bookingTo) {
        this.room = room;
        this.otherGuests = otherGuests;
        this.bookingFrom = bookingFrom;
        this.bookingTo = bookingTo;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public LocalDate getBookingFrom() {
        return bookingFrom;
    }

    public void setBookingFrom(LocalDate bookingFrom) {
        this.bookingFrom = bookingFrom;
    }

    public LocalDate getBookingTo() {
        return bookingTo;
    }

    public void setBookingTo(LocalDate bookingTo) {
        this.bookingTo = bookingTo;
    }
    public void getDescription() {

        System.out.println("Pokoj číslo: " + getRoom().getRoom());
        if (guest != null) {
            System.out.println(this.guest.getName() + "  " + this.guest.getSurname() + "   " + getBookingFrom() + "    " + getBookingFrom());
        }
        else
            for(Guest guest: otherGuests) {

                System.out.println(guest.getName()+" "+guest.getSurname()+"  "+getBookingFrom()+"   "+getBookingTo());
          }


    }
}
