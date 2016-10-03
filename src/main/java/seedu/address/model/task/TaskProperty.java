package seedu.address.model.task;

import seedu.address.commons.exceptions.IllegalValueException;

public abstract class TaskProperty {
    protected String value;
    
    public TaskProperty(String property) throws IllegalValueException {
        assert property != null;
        if (!isValid(property)) {
            throw new IllegalValueException(this.getMessageConstraints());
        }
        this.value = property;
    }
    
    public boolean isValid(String test) {
        return test.matches(this.getValidationRegex());
    }
    
    public String getValue() {
        return this.toString();
    }
    
    protected abstract String getMessageConstraints();
    
    protected abstract String getValidationRegex();
    
    public abstract String toString();
    
    public abstract boolean equals(Object other);
    
    public abstract int hashCode();
}
