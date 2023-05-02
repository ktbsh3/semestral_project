package cz.cvut.anokhver;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.io.File;
import java.util.Objects;

public class GameLauncher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        String dir = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "additional" + File.separator + "AppIconNightWalk.png";
        //System.out.println(dir);

        //setting the stage and scene
        primaryStage.setTitle("Night " +
                "Walk");
        primaryStage.setResizable(false);
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/additional/AppIconNightWalk.png")));
        primaryStage.getIcons().add(icon);

        GameLogic game = new GameLogic(primaryStage);

    }
}