package guitests.guihandles;

import guitests.GuiRobot;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import seedu.manager.TestApp;

/**
 * A handler for the ResultDisplay of the UI
 */
public class ResultDisplayHandle extends GuiHandle {

    public static final String RESULT_DISPLAY_ID = "#resultDisplay";

    public ResultDisplayHandle(GuiRobot guiRobot, Stage primaryStage) {
        super(guiRobot, primaryStage, TestApp.APP_TITLE);
    }

    public String getText() {
        return getResultDisplay().getText();
    }

    private TextArea getResultDisplay() {
        return (TextArea) getNode(RESULT_DISPLAY_ID);
    }
}
