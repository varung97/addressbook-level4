package seedu.manager.testutil;

import seedu.manager.commons.exceptions.IllegalValueException;
import seedu.manager.model.TaskManager;
import seedu.manager.model.task.*;

/**
 *
 */
public class TypicalTestTasks {

    public static TestTask alice, benson, carl, daniel, elle, fiona, george, hoon, ida;

    public TypicalTestTasks() {
        try {
            alice =  new TaskBuilder().withDesc("Alice Pauline").withPriority("med")
                    .withTime("alice@gmail.com").withPhone("85355255")
                    .withTags("friends").build();
            benson = new TaskBuilder().withDesc("Benson Meier").withPriority("low")
                    .withTime("johnd@gmail.com").withPhone("98765432")
                    .withTags("owesMoney", "friends").build();
            carl = new TaskBuilder().withDesc("Carl Kurz").withPhone("95352563").withTime("heinz@yahoo.com").withPriority("high").build();
            daniel = new TaskBuilder().withDesc("Daniel Meier").withPhone("87652533").withTime("cornelia@google.com").withPriority("med").build();
            elle = new TaskBuilder().withDesc("Elle Meyer").withPhone("9482224").withTime("werner@gmail.com").withPriority("low").build();
            fiona = new TaskBuilder().withDesc("Fiona Kunz").withPhone("9482427").withTime("lydia@gmail.com").withPriority("high").build();
            george = new TaskBuilder().withDesc("George Best").withPhone("9482442").withTime("anna@google.com").withPriority("med").build();

            //Manually added
            hoon = new TaskBuilder().withDesc("Hoon Meier").withPhone("8482424").withTime("stefan@mail.com").withPriority("high").build();
            ida = new TaskBuilder().withDesc("Ida Mueller").withPhone("8482131").withTime("hans@google.com").withPriority("med").build();
        } catch (IllegalValueException e) {
            e.printStackTrace();
            assert false : "not possible";
        }
    }

    public static void loadTaskManagerWithSampleData(TaskManager ab) {

        try {
            ab.addTask(new Task(alice));
            ab.addTask(new Task(benson));
            ab.addTask(new Task(carl));
            ab.addTask(new Task(daniel));
            ab.addTask(new Task(elle));
            ab.addTask(new Task(fiona));
            ab.addTask(new Task(george));
        } catch (UniqueTaskList.DuplicateTaskException e) {
            assert false : "not possible";
        }
    }

    public TestTask[] getTypicalTasks() {
        return new TestTask[]{alice, benson, carl, daniel, elle, fiona, george};
    }

    public TaskManager getTypicalTaskManager(){
        TaskManager ab = new TaskManager();
        loadTaskManagerWithSampleData(ab);
        return ab;
    }
}
