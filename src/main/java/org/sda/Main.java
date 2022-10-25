package org.sda;

import org.sda.model.*;

public class Main {
    public static void main(String[] args) {
        // ENCAPSULATION
        //No-arg constructor call
        Person person = new Person();
        System.out.println(person.toString());
        System.out.println(person.getId());

        //All-argument constructor call
        Person person1 = new Person(12345L, "Sander", "Hintsov", "sander@gmail.com", "+3726161511", "Seedri tee");
        System.out.println(person1.toString());
        System.out.println(person1.getEmail());


        Person person2 = new Person();
        person2.setFirstName("Tony");
        person2.setLastName("Stark");
        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());

        Dog dog = new Dog(true, "GERMAN SHEPPERD");
        System.out.println(dog);
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());


        //INHERITANCE
        Passenger passenger = new Passenger("CARD", "Pärnu");
        passenger.setEmail("passenger@gmail.com"); // Access Person fields using Passenger object

        PrivatePassenger privatePassenger = new PrivatePassenger("25151611616", "Tartu maantee", "CARD");
        privatePassenger.setPersonalIDCode("25151611616"); // Access private passenger's field
        privatePassenger.setDestinationAddress("Tartu"); // Access Passenger's field
        privatePassenger.setPhoneNumber("+37254626644"); // Access Person's field



        //Overriding
        Person personOverride = new Person();
        personOverride.setEmail("sander1@gmail.com");
        System.out.println(personOverride.getEmail());

        Passenger passengerOverride = new Passenger();
        passengerOverride.setEmail("sander1@gmail.com");
        System.out.println(passengerOverride.getEmail());


        //Polymorphism
        Person person3 = new Person(12345L, "Pärnu");
        Person person4 = new Passenger("CARD", "Viljandi");
        System.out.println(person3.toString());
        System.out.println(person4.toString());

        //Calling parent methods
        Passenger passenger1 = new Passenger();
        passenger1.setAddress("Tallinn"); // Person address
        passenger1.setDestinationAddress("Tartu"); // Passenger.destinationAddress
        System.out.println(passenger1.getAddresses());


    }
    }