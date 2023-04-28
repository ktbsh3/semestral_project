package cz.cvut.anokhver.level;

import cz.cvut.anokhver.enteties.Enemy;
import cz.cvut.anokhver.enteties.Star;

import java.util.List;

public class Level {
    private final Integer id;
    private List<Enemy> enemies;
    private List<Star> stars;
    private final MapParser map;
    public Level(Integer id, List<Enemy> enemies, List<Star> stars, MapParser map) {
        this.id = id;
        this.enemies = enemies;
        this.stars = stars;
        this.map = map;
    }

    private void startLevel(){

    }


    public Integer getId() {
        return id;
    }
}
