import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Board {
   
    Property[][] properties = new Property[11][11];
    static Map<Integer, Property> propertiesMap = new HashMap<>();

    public Board(){
        Display.properties = properties;

        // Adding all properties in order
        properties[0][0] = new Property(new Color(0, 225, 0), "Go", 0, 0, 0, false, 0, false, 0);
        propertiesMap.put(0, properties[0][0]);

        properties[0][1] = new Property(new Color(102, 51, 0), "Mediterranean Avenue", 60, 50, 2, false, 2, false, 0);
        propertiesMap.put(1, properties[0][1]);

        properties[0][2] = new Property(new Color(0, 0, 0), "Community Chest", 0, 0, 0, false, 0, false, 0);
        propertiesMap.put(2, properties[0][2]);

        properties[0][3] = new Property(new Color(102, 51, 0), "Baltic Avenue", 60, 50, 4, false, 4, false, 0);
        propertiesMap.put(3, properties[0][3]);

        properties[0][4] = new Property(new Color(0, 0, 0), "Income Tax", 0, 0, 0, false, 0, false, 0);
        propertiesMap.put(4, properties[0][4]);

        properties[0][5] = new Property(new Color(0, 0, 0), "Reading Railroad", 200, 0, 25, false, 25, false, 0);
        propertiesMap.put(5, properties[0][5]);

        properties[0][6] = new Property(new Color(0, 153, 204), "Oriental Avenue", 100, 50, 6, false, 6, false, 0);
        propertiesMap.put(6, properties[0][6]);

        properties[0][7] = new Property(new Color(0, 0, 0), "Chance", 0, 0, 0, false, 0, false, 0);
        propertiesMap.put(7, properties[0][7]);

        properties[0][8] = new Property(new Color(0, 153, 204), "Vermont Avenue", 100, 50, 6, false, 6, false, 0);
        propertiesMap.put(8, properties[0][8]);

        properties[0][9] = new Property(new Color(0, 153, 204), "Connecticut Avenue", 120, 50, 8, false, 8, false, 0);
        propertiesMap.put(9, properties[0][9]);

        properties[0][10] = new Property(new Color(0, 0, 0), "Go To Jail", 0, 0, 0, false, 0, false, 0);
        propertiesMap.put(10, properties[0][10]);

        properties[1][10] = new Property(new Color(204, 68, 204), "St. Charles Place", 140, 100, 10, false, 10, false, 0);
        propertiesMap.put(11, properties[1][10]);

        properties[2][10] = new Property(new Color(0, 0, 0), "Electric Company", 150, 0, 0, false, 0, false, 0);
        propertiesMap.put(12, properties[2][10]);

        properties[3][10] = new Property(new Color(204, 68, 204), "States Avenue", 140, 100, 10, false, 10, false, 0);
        propertiesMap.put(13, properties[3][10]);

        properties[4][10] = new Property(new Color(204, 68, 204), "Virginia Avenue", 160, 100, 12, false, 12, false, 0);
        propertiesMap.put(14, properties[4][10]);

        properties[5][10] = new Property(new Color(0, 0, 0), "Pennsylvania Railroad", 200, 0, 25, false, 25, false, 0);
        propertiesMap.put(15, properties[5][10]);

        properties[6][10] = new Property(new Color(204, 68, 204), "St. James Place", 180, 100, 14, false, 14, false, 0);
        propertiesMap.put(16, properties[6][10]);

        properties[7][10] = new Property(new Color(0, 0, 0), "Community Chest", 0, 0, 0, false, 0, false, 0);
        propertiesMap.put(17, properties[7][10]);

        properties[8][10] = new Property(new Color(204, 68, 204), "Tennessee Avenue", 180, 100, 14, false, 14, false, 0);
        propertiesMap.put(18, properties[8][10]);

        properties[9][10] = new Property(new Color(204, 68, 204), "New York Avenue", 200, 100, 16, false, 16, false, 0);
        propertiesMap.put(19, properties[9][10]);

        properties[10][10] = new Property(new Color(0, 0, 0), "Free Parking", 0, 0, 0, false, 0, false, 0);
        propertiesMap.put(20, properties[10][10]);

        properties[10][9] = new Property(new Color(255, 0, 0), "Kentucky Avenue", 220, 150, 18, false, 18, false, 0);
        propertiesMap.put(21, properties[10][9]);

        properties[10][8] = new Property(new Color(0, 0, 0), "Chance", 0, 0, 0, false, 0, false, 0);
        propertiesMap.put(22, properties[10][8]);

        properties[10][7] = new Property(new Color(255, 0, 0), "Indiana Avenue", 220, 150, 18, false, 18, false, 0);
        propertiesMap.put(23, properties[10][7]);

        properties[10][6] = new Property(new Color(255, 0, 0), "Illinois Avenue", 240, 150, 20, false, 20, false, 0);
        propertiesMap.put(24, properties[10][6]);

        properties[10][5] = new Property(new Color(0, 0, 0), "B&O Railroad", 200, 0, 25, false, 25, false, 0);
        propertiesMap.put(25, properties[10][5]);

        properties[10][4] = new Property(new Color(255, 255, 51), "Atlantic Avenue", 260, 150, 22, false, 22, false, 0);
        propertiesMap.put(26, properties[10][4]);

        properties[10][3] = new Property(new Color(255, 255, 51), "Ventnor Avenue", 260, 150, 22, false, 22, false, 0);
        propertiesMap.put(27, properties[10][3]);

        properties[10][2] = new Property(new Color(0, 0, 0), "Water Works", 150, 0, 0, false, 0, false, 0);
        propertiesMap.put(28, properties[10][2]);

        properties[10][1] = new Property(new Color(255, 255, 51), "Marvin Gardens", 280, 150, 24, false, 24, false, 0);
        propertiesMap.put(29, properties[10][1]);

        properties[10][0] = new Property(new Color(0, 0, 0), "Visit Jail", 0, 0, 0, false, 0, false, 0);
        propertiesMap.put(30, properties[10][0]);

        properties[9][0] = new Property(new Color(51, 153, 51), "Pacific Avenue", 300, 200, 26, false, 26, false, 0);
        propertiesMap.put(31, properties[9][0]);

        properties[8][0] = new Property(new Color(51, 153, 51), "North Carolina Avenue", 300, 200, 26, false, 26, false, 0);
        propertiesMap.put(32, properties[8][0]);

        properties[7][0] = new Property(new Color(0, 0, 0), "Community Chest", 0, 0, 0, false, 0, false, 0);
        propertiesMap.put(33, properties[7][0]);

        properties[6][0] = new Property(new Color(51, 153, 51), "Pennsylvania Avenue", 320, 200, 28, false, 28, false, 0);
        propertiesMap.put(34, properties[6][0]);

        properties[5][0] = new Property(new Color(0, 0, 0), "Short Line Railroad", 200, 0, 25, false, 25, false, 0);
        propertiesMap.put(35, properties[5][0]);

        properties[4][0] = new Property(new Color(0, 0, 0), "Chance", 0, 0, 0, false, 0, false, 0);
        propertiesMap.put(36, properties[4][0]);

        properties[3][0] = new Property(new Color(51, 153, 51), "Park Place", 350, 200, 35, false, 35, false, 0);
        propertiesMap.put(37, properties[3][0]);

        properties[2][0] = new Property(new Color(0, 0, 0), "Luxury Tax", 0, 0, 0, false, 0, false, 0);
        propertiesMap.put(38, properties[2][0]);

        properties[1][0] = new Property(new Color(51, 153, 51), "Boardwalk", 400, 200, 50, false, 50, false, 0);
        propertiesMap.put(39, properties[1][0]);

           }
}
