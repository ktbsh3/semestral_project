package cz.cvut.anokhver;

import cz.cvut.anokhver.contollers.Contoller;
import cz.cvut.anokhver.contollers.GameMenuController;
import cz.cvut.anokhver.contollers.MainMenuController;
import cz.cvut.anokhver.menu.InGameMenu;
import cz.cvut.anokhver.menu.MainMenu;
import javafx.scene.Group;
import javafx.stage.Stage;

import java.util.Dictionary;
import java.util.Hashtable;

public class GameLogic {

    private static Stage stage;
    private static final Dictionary<String, Contoller> controllers = new Hashtable<String, Contoller>();
    private Contoller state;
    public GameLogic(Stage primaryStage){
        GameLogic.stage = primaryStage;

        controllers.put("MainMenu", new MainMenuController());
        //controllers.put("GameMenu", new GameMenuController());

        state = controllers.get("MainMenu");
        stage.setScene(state.getView().getScene());

        //setMainMenu();
        stage.show();
    }

    public void setMainMenu(){
        state = controllers.get("MainMenu");
        stage.setScene(state.getView().getScene());

    }

    public void new_game(){

    }
    public void waiting(){

    }
    public void createEnemy(){

    }
    public void createPlayer(){

    }

}
