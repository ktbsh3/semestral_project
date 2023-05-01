package cz.cvut.anokhver.level;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

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
        gc.drawImage(image, x, y, width, height);
    }
    public static Image loadImageForTile(String tileChar) {
        String dir = System.getProperty("user.dir") + "\\src\\main\\resources\\tiles" + "\\" + tileChar + ".png";
        System.out.println(dir);
        return new Image(dir);
    }
    // other methods as needed
}


