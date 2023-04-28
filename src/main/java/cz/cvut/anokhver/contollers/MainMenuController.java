package cz.cvut.anokhver.contollers;

import cz.cvut.anokhver.GameLogic;
import cz.cvut.anokhver.menu.MainMenu;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class MainMenuController extends Contoller{

    private final VBox view;

    public MainMenuController(){
        this.view = new MainMenu();
    }


    @Override
    public VBox getView() {
        return view;
    }
}
