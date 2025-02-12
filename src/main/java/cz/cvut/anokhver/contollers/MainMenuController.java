package cz.cvut.anokhver.contollers;

import cz.cvut.anokhver.GameLogic;
import cz.cvut.anokhver.menu.MainMenu;
import cz.cvut.anokhver.menu.Menu;

import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;

public class MainMenuController extends Contoller{

    private final MainMenu view;

    public MainMenuController() {
        this.view = new MainMenu();

        view.getExitButton().setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                System.exit(0);
            }
        });

        view.getStartButton().setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                GameLogic.new_game();
            }
        });

        view.getLoadButton().setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                GameLogic.load_game();
            }
        });


    }

    @Override
    public VBox getView() {
        return view;
    }
}
