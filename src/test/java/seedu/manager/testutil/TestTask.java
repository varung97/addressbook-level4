package seedu.manager.testutil;

import seedu.manager.model.tag.UniqueTagList;
import seedu.manager.model.task.*;

/**
 * A mutable task object. For testing only.
 */
public class TestTask implements ReadOnlyTask {

    private Desc desc;
    private Priority priority;
    private Email email;
    private Phone phone;
    private UniqueTagList tags;

    public TestTask() {
        tags = new UniqueTagList();
    }

    public void setDesc(Desc desc) {
        this.desc = desc;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public Desc getDesc() {
        return desc;
    }

    @Override
    public Phone getPhone() {
        return phone;
    }

    @Override
    public Email getEmail() {
        return email;
    }

    @Override
    public Priority getPriority() {
        return priority;
    }

    @Override
    public UniqueTagList getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return getAsText();
    }

    public String getAddCommand() {
        StringBuilder sb = new StringBuilder();
        sb.append("add " + this.getDesc().getValue() + " ");
        sb.append("p/" + this.getPhone().value + " ");
        sb.append("e/" + this.getEmail().value + " ");
        sb.append("a/" + this.getPriority().getValue() + " ");
        this.getTags().getInternalList().stream().forEach(s -> sb.append("t/" + s.tagName + " "));
        return sb.toString();
    }
}
