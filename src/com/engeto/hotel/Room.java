package com.engeto.hotel;

import java.math.BigDecimal;

public class Room {

    private int room;
    private int numberOfBed;
    private double pricePerNight;

    private Boolean withBalcony;

    private Boolean withSeaView;

    public Room(int room, int numberOfBed, double pricePerNight, Boolean withBalcony, Boolean withSeaView) {
        this.room = room;
        this.numberOfBed = numberOfBed;
        this.pricePerNight = pricePerNight;
        this.withBalcony = withBalcony;
        this.withSeaView = withSeaView;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Boolean getWithBalcony() {
        return withBalcony;
    }

    public void setWithBalcony(Boolean withBalcony) {
        this.withBalcony = withBalcony;
    }

    public Boolean getWithSeaview() {
        return withSeaView;
    }

    public void setWithSeaview(Boolean withSeaView) {
        this.withSeaView = withSeaView;
    }

    public void getDescription() {
        if (getRoom() == 1) {
            System.out.println("číslo pokoje:   " + getRoom() + "   počet postelí:    " + getNumberOfBed() + "   cena za noc:   " + getPricePerNight());
            if (withBalcony && withSeaView)
                System.out.println("Pokoj s balkonem s výhledem na moře\n");
            else if (!withBalcony && withSeaView)
                System.out.println("Pokoj bez balkonu a s výhledem na moře\n");
            else if (withBalcony && !withSeaView)
                System.out.println("Pokoj s balkonem a bez výhledu na moře\n");
            else
                System.out.println("Bez balkonu a výhledu na moře\n");


        }
        if (getRoom() == 2) {
            System.out.println("číslo pokoje:   " + getRoom() + "   počet postelí:    " + getNumberOfBed() + "   cena za noc:   " + getPricePerNight());
            if (withBalcony && withSeaView)
                System.out.println("Pokoj s balkonem s výhledem na moře\n");
            else if (!withBalcony && withSeaView)
                System.out.println("Pokoj bez balkonu a s výhledem na moře\n");
            else if (withBalcony && !withSeaView)
                System.out.println("Pokoj s balkonem a bez výhledu na moře\n");
            else
                System.out.println("Bez balkonu a výhledu na moře\n");
        }
        if (getRoom() == 3) {
            System.out.println("číslo pokoje:   " + getRoom() + "   počet postelí:    " + getNumberOfBed() + "   cena za noc:   " + getPricePerNight());
            if (withBalcony && withSeaView)
                System.out.println("Pokoj s balkonem s výhledem na moře\n");
            else if (!withBalcony && withSeaView)
                System.out.println("Pokoj bez balkonu a s výhledem na moře\n");
            else if (withBalcony && !withSeaView)
                System.out.println("Pokoj s balkonem a bez výhledu na moře\n");
            else
                System.out.println("Bez balkonu a výhledu na moře\n");
        }
    }
}





