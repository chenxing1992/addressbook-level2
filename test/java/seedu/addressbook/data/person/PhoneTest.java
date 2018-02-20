package seedu.addressbook.data.person;


import org.junit.Test;
import seedu.addressbook.data.exception.IllegalValueException;

import static org.junit.Assert.*;

public class PhoneTest {
    /**
     * Junit test for phone number pattern
     * case 1: Validates if phone number returns false if user enters wrong pattern
     *
     *
      */

    @Test
    public void isValidPhone() {


        try {
            Phone validatePhone = new Phone("FakeNumber", true);
            assertEquals("Person phone numbers should only contain numbers", validatePhone.toString());
        } catch (IllegalValueException e) {
            System.out.println("Person phone numbers should only contain numbers");


        }
    }
}