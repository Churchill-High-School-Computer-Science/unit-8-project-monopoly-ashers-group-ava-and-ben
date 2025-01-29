import java.awt.Color;


public class Board {
    
    Property[][] properties = new Property[10][10];
    

    public Board(){
        Display.properties = properties;
        properties[0][0] = new Property(new Color(0,225,0), "Go",  0);
        properties[0][1] = new Property(new Color(102,51,0), "Mediterranean Avenue", checking 60);
        properties[0][3] = new Property("Community Chest", checking 0);
        properties[0][2] = new Property(new Color(102,51,0), "Baltic", checking 60);
        properties[0][3] = new Property("Income tax", checking 0);
        properties[0][4] = new Property("Reading Railroad", checking 200);
        properties[0][5] = new Property(new Color(0,153,204), "Oriental Avenue", checking 100);
        properties[0][3] = new Property("Chance", checking 0);
        properties[0][6] = new Property(new Color(0,153,204), "Vermont Avenut", checking 100);
        properties[0][7] = new Property(new Color(0,153,204), "Connecticut Avenue", checking 120);
        properties[0][4] = new Property("Jail", checking 0);
        properties[0][8] = new Property(new Color(204,68,204), "St. Charles Place", checking 140);
        properties[0][3] = new Property("Electric Company", checking 150);
        properties[0][9] = new Property(new Color(204,68,204), "States Avenue", checking 140);
        properties[0][10] = new Property(new Color(204,68,204), "Virginia Avenue", checking 160);
        properties[0][3] = new Property("Pennsylvania Railroad", checking 200);
        properties[0][11] = new Property(new Color(204,68,204), "St. James Place", checking 180);


        // add properties 
    }

}