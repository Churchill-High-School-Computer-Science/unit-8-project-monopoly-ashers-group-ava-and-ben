import java.awt.Color;


public class Board {
    
    Property[][] properties = new Property[10][10];
    

    public Board(){
        Display.properties = properties;
        properties[0][0] = new Property(new Color(0,225,0), "Go", 0,0,0,false,0,false, 0);
        properties[0][1] = new Property(new Color(102,51,0), "Mediterranean Avenue", 60, 50, 0, false, 2, false, 0);
        properties[0][3] = new Property(new Color(0,0,0), "Community Chest", 0, 0, 0, false, 0, false, 0);
        properties[0][2] = new Property(new Color(102,51,0), "Baltic", 60, 50, 0, false, 4, false, 0);
        properties[0][3] = new Property(new Color (0,0,0),"Income tax",0,0,0,false,0,false,0);
        properties[0][4] = new Property(new Color(0, 0, 0),"Reading Railroad", 200, 0, 0, false, 25, false, 0);
        properties[0][5] = new Property(new Color(0,153,204), "Oriental Avenue", 100, 50, 0, false, 6, false, 0);
        properties[0][3] = new Property(new Color(0,0,0), "Chance", 0, 0, 0, false, 0, false, 0);
        properties[0][6] = new Property(new Color(0,153,204), "Vermont Avenut", 100,0,0,false,6,false, 0);
        properties[0][7] = new Property(new Color(0,153,204), "Connecticut Avenue", 120, 50, 0, false, 8, false, 0);
        properties[0][4] = new Property(new Color(0,0,0),"Jail", 0, 0, 0, false, 0, false, 0);
        properties[0][8] = new Property(new Color(204,68,204), "St. Charles Place",  140,100, 0, false, 10, false, 0);
        properties[0][3] = new Property(new Color(0,0,0), "Electric Company",  150, 2, 0, false, 0, false, 0);
        properties[0][9] = new Property(new Color(204,68,204), "States Avenue",  140,100,0,false,100,false,0);
        properties[0][10] = new Property(new Color(204,68,204), "Virginia Avenue",  160,100,0,false,12,false,0);
        properties[0][3] = new Property(new Color(0,0,0),"Pennsylvania Railroad",200,0,0,false,25,false,0);
        properties[0][11] = new Property(new Color(204,68,204), "St. James Place", 180,100,0,false,14,false,0);
        properties[0][3] = new Property(new Color(0,0,0), "Community Chest", 0, 0, 0, false, 0, false, 0);
        properties[0][12] = new Property(new Color(204,68,204), "Tennessee Avenue", 180,100,0,false,14,false,0);
        properties[0][13] = new Property(new Color(204,68,204), "New York Avenue", 200,100,0,false,16,false,0);
        


        // add properties 
    }

}