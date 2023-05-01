package cz.cvut.anokhver;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.util.Objects;

public class GameLauncher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        String dir = System.getProperty("user.dir") + "\\src\\main\\resources\\additional\\AppIconNightWalk.png";
        //System.out.println(dir);

        //setting the stage and scene
        primaryStage.setTitle("Night Walk");
        primaryStage.setResizable(false);
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/additional/AppIconNightWalk.png")));
        primaryStage.getIcons().add(icon);

        GameLogic game = new GameLogic(primaryStage);

    }
}