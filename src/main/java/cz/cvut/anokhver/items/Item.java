package cz.cvut.anokhver.items;

import cz.cvut.anokhver.enteties.Enemy;
import cz.cvut.anokhver.enteties.Player;
import cz.cvut.anokhver.menu.Inventory;

public class Item {

    private final String name;
    private final Integer id;
    public boolean pickUp(Player player)
    {
        return player.getInventory().addItem(this);
    }

    public boolean drop(Enemy enemy)
    {
        return enemy.setDropChance(this);
    }

    public Item(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
}
