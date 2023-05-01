package cz.cvut.anokhver.menu;

import cz.cvut.anokhver.contollers.Contoller;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public abstract class Menu extends VBox {
    protected Scene scene;
    protected Contoller controller;
    public abstract void init();
}
