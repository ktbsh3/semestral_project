package cz.cvut.anokhver.menu;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MainMenu extends Menu {

    protected Button startButton;
    protected Button loadButton;
    protected Button exitButton;


    public MainMenu(){

        this.setSpacing(10);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20, 20, 20, 20));

        Label titleLabel = new Label("Night Walk");
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        this.getChildren().add(titleLabel);

        startButton = new Button("New Game");
        this.getChildren().add(startButton);

        loadButton = new Button("Load Game");
        this.getChildren().add(loadButton);

        exitButton = new Button("Exit");

        this.getChildren().add(exitButton);

        scene = new Scene(this, 800, 600);

    }

    @Override
    public void init() {
        new MainMenu();
    }
}
