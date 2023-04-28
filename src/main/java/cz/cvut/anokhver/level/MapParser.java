package cz.cvut.anokhver.level;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class MapParser {

    private final List<List<Integer>> map = new ArrayList<>();

    public MapParser(String path) {
        readMap(path);
    }

    private void readMap(String path) {
        try {
            File mapFile = new File(path);
            Scanner fileSc = new Scanner(mapFile);
            while (fileSc.hasNextLine()) {
                List<Integer> row = new ArrayList<>();
                for (String s : fileSc.nextLine().split("")) {
                    row.add(Integer.valueOf(s));
                }
                map.add(row);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showMap() {

    }


}
