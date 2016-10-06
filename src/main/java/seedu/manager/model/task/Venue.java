package seedu.manager.model.task;

import seedu.manager.commons.exceptions.IllegalValueException;

/**
 * Represents a Task's venue number in the task manager.
 * Guarantees: immutable; is valid as declared in {@link #isValidVenue(String)}
 */
public class Venue {

    public static final String MESSAGE_VENUE_CONSTRAINTS = "Task venue numbers should only contain numbers";
    public static final String VENUE_VALIDATION_REGEX = "\\d+";

    public final String value;

    /**
     * Validates given venue.
     *
     * @throws IllegalValueException if given venue string is invalid.
     */
    public Venue(String venue) throws IllegalValueException {
        assert venue != null;
        venue = venue.trim();
        if (!isValidVenue(venue)) {
            throw new IllegalValueException(MESSAGE_VENUE_CONSTRAINTS);
        }
        this.value = venue;
    }

    /**
     * Returns true if a given string is a valid task venue number.
     */
    public static boolean isValidVenue(String test) {
        return test.matches(VENUE_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Venue // instanceof handles nulls
                && this.value.equals(((Venue) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
