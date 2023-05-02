package cz.cvut.anokhver.level;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.io.File;

public class SingleTile{
    private final Image image;
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public SingleTile(Image image, int x, int y, int width, int height) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void render(GraphicsContext gc) {
        int y_actuall = height*y;
        if(y_actuall != 0) y_actuall -= 20*y;
        gc.drawImage(image, width*x, y_actuall, width, height);
    }
    public static Image loadImageForTile(String tileChar) {
        String dir = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "tiles" + File.separator + tileChar + ".png";
        //System.out.println(dir);

        File file = new File(dir);
        return new Image(file.toURI().toString());
    }

}


