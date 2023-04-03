package cz.cvut.anokhver;

import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        var p = new MapParser("C:\\Users\\Veronika\\cvut\\2.semestr\\myCoolRPGgame\\src\\main\\resources\\text.txt");
        p.showMap();
    }
}