package seedu.manager.model;


import java.util.List;

import seedu.manager.model.tag.Tag;
import seedu.manager.model.tag.UniqueTagList;
import seedu.manager.model.task.ReadOnlyTask;
import seedu.manager.model.task.UniqueTaskList;

/**
 * Unmodifiable view of an task manager
 */
public interface ReadOnlyTaskManager {

    UniqueTagList getUniqueTagList();

    UniqueTaskList getUniqueTaskList();

    /**
     * Returns an unmodifiable view of tasks list
     */
    List<ReadOnlyTask> getTaskList();

    /**
     * Returns an unmodifiable view of tags list
     */
    List<Tag> getTagList();

}
