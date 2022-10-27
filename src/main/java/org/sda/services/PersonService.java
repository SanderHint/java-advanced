package org.sda.services;

import org.sda.models.Person;

import java.time.LocalDate;

/**
 *PersonService interface to handle Person related operations
 *
 * @author Sander Hintsov
 */
public interface PersonService {

    // Static field is allowed but not the normal field. So cant use int age; for example
    static final int AVERAGE_AGE = 20;

    /**
     * To get the date of birth of the Person
     *
     * @param age Age of the Person
     * @return Date of birth
     */
    int getPersonDOB(int age);

    /**
     * To get full name of the person
     *
     * @param person Person person
     * @return
     */
    String getPersonFullName(Person person);

    //static method definition is allowed
    static int getAverageAge() {
        return AVERAGE_AGE;
    }
}
