package ubiquigame.games.desktop;

import com.badlogic.gdx.scenes.scene2d.ui.Image;
import ubiquigame.common.Controller;
import ubiquigame.common.Player;

public class TestPlayer2 implements Player {

    private Controller testController;

    public TestPlayer2() {
        testController = new KeyboardController2();
    }

    @Override
    public String getName() {
        return "2468";
    }

    @Override
    public Controller getController() {
        return testController;
    }

    @Override
    public Image getAvatar() {
        return null;
    }
}