package org.sda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Person model
 *
 * @author Sander
 */
@AllArgsConstructor
@Getter
@ToString

public class Person { ///Outer class
    private String firstName;
    private String lastName;
    private String username;
    private int age;

    public boolean isAdult() {
        return age >= 18;


    }

    //Non-static nested class: without keywords 'static'
    @Getter
    @Setter
    @ToString
    public class Employee { //Inner class
        public void username() {
            username = firstName.concat(lastName).toLowerCase().replace(" ", ""); // changing the value of outer class (Person)

        }
    }

    //Static nested class: nt bound to outer class
    @Getter
    public static class Customer{
        public void username(Person person) {
            person.username =  person.firstName.concat(person.lastName).toUpperCase().replace(" ", "");
        }
    }
}