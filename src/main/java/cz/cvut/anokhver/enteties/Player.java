package cz.cvut.anokhver.enteties;
import cz.cvut.anokhver.menu.Inventory;

public class Player{
    private float damage;
    private float walk_speed;
    private float health;
    private float speed_damage;
    private Integer coins = 0;
    private boolean live = true;
    private final Inventory inventory;

    public Player(float damage, float walkSpeed, float health, float speedDamage, Inventory inventory) {
        this.damage = damage;
        walk_speed = walkSpeed;
        this.health = health;
        speed_damage = speedDamage;
        this.inventory = inventory;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public float getWalk_speed() {
        return walk_speed;
    }

    public void setWalk_speed(float walk_speed) {
        this.walk_speed = walk_speed;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getSpeed_damage() {
        return speed_damage;
    }

    public void setSpeed_damage(float speed_damage) {
        this.speed_damage = speed_damage;
    }

    public Integer getCoins() {
        return coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}
