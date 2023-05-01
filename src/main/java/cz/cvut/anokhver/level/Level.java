package cz.cvut.anokhver.level;

import cz.cvut.anokhver.enteties.Enemy;
import cz.cvut.anokhver.enteties.Star;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import java.util.List;

public class Level {
    private final Integer id;
    private List<Enemy> enemies;
    private List<Star> stars;

    private Tilemap map;

    public Level(Integer id) {
        this.id = id;
        this.map = new Tilemap(43,18, id);
        String dir = System.getProperty("user.dir") + "\\src\\main\\resources\\level" + id.toString();
        //map.readMap(dir);

    }

    private void startLevel(){

    }

    public void drawTileMap(Canvas canvas) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        for (int i = 0; i < map.getWidth(); i++) {
            for (int j = 0; j < map.getHeight(); j++) {
                SingleTile tile = map.getTile(i, j);
                tile.render(gc);
            }
        }
    }
    public Integer getId() {
        return id;
    }

    public Tilemap getMap() {
        return map;
    }

    public void setMap(Tilemap map) {
        this.map = map;
    }
}
