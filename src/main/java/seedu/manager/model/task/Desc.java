package seedu.manager.model.task;

import seedu.manager.commons.exceptions.IllegalValueException;

/**
 * Represents a Task's desc in the task manager.
 * Guarantees: immutable; is valid as declared in {@link #isValidDesc(String)}
 */
public class Desc extends TaskProperty {
    public static final String MESSAGE_CONSTRAINTS = "Task priorities should be either low, med or high";
    public static final String VALIDATION_REGEX = "[\\p{Alnum} ]+";
    
    /**
     * Validates given desc.
     *
     * @throws IllegalValueException if given desc string is invalid.
     */
    public Desc(String desc) throws IllegalValueException {
        super(desc);
    }
    
    @Override
    protected String getMessageConstraints() {
        return MESSAGE_CONSTRAINTS;
    }

    @Override
    protected String getValidationRegex() {
        return VALIDATION_REGEX;
    }


    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Desc // instanceof handles nulls
                && this.value.equals(((Desc) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
