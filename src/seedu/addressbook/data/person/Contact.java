package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {


    public final String value;
    boolean isPrivate;

    /**
     * Validate give contact information.
     *
     * @throws IllegalValueException if given contact string is invalid.
     */
    public Contact(){
        this.isPrivate = true;
        this.value = "";

    }
    public Contact(String personContact, boolean isPrivate) {
        String trimmed = personContact.trim();
        this.value = trimmed;
        this.isPrivate = isPrivate;

    }


    @Override
    public int hashCode() {
        return value.hashCode();
    }


    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Phone // instanceof handles nulls
                && this.value.equals(((Phone) other).value)); // state check
    }

    public boolean isPrivate() {
        return isPrivate;
    }

}