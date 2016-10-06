package guitests.guihandles;

import guitests.GuiRobot;
import javafx.scene.Node;
import javafx.stage.Stage;
import seedu.manager.model.task.ReadOnlyTask;

/**
 * Provides a handle to a task card in the task list panel.
 */
public class TaskCardHandle extends GuiHandle {
    private static final String DESC_FIELD_ID = "#desc";
    private static final String PRIORITY_FIELD_ID = "#priority";
    private static final String PHONE_FIELD_ID = "#phone";
    private static final String EMAIL_FIELD_ID = "#email";

    private Node node;

    public TaskCardHandle(GuiRobot guiRobot, Stage primaryStage, Node node){
        super(guiRobot, primaryStage, null);
        this.node = node;
    }

    protected String getTextFromLabel(String fieldId) {
        return getTextFromLabel(fieldId, node);
    }

    public String getFullDesc() {
        return getTextFromLabel(DESC_FIELD_ID);
    }

    public String getPriority() {
        return getTextFromLabel(PRIORITY_FIELD_ID);
    }

    public String getPhone() {
        return getTextFromLabel(PHONE_FIELD_ID);
    }

    public String getEmail() {
        return getTextFromLabel(EMAIL_FIELD_ID);
    }

    public boolean isSameTask(ReadOnlyTask task){
        return getFullDesc().equals(task.getDesc().getValue()) && getPhone().equals(task.getPhone().value)
                && getEmail().equals(task.getEmail().value) && getPriority().equals(task.getPriority().getValue());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof TaskCardHandle) {
            TaskCardHandle handle = (TaskCardHandle) obj;
            return getFullDesc().equals(handle.getFullDesc())
                    && getPriority().equals(handle.getPriority()); //TODO: compare the rest
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return getFullDesc() + " " + getPriority();
    }
}
