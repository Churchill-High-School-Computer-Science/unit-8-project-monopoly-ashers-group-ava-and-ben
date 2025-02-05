
import java.util.ArrayList;

public class Player {

    //TODO FIX
    public String getName(){
        return "no one";
    }

    ///TODO FIX
    public int getMoney(){
        return 1000;
    }

    //TODO FIX
    public ArrayList<Property> getProperties(){
        return null;
    }

    //TODO FIX
    //Go is the top left corner, location 0. Locations increase by 1 for each property that the player passes clockwise.
    public int getLocation(){
        return location;
    }
    /// idk how do this maybe
    int location;
    public int roll_dice(){
        int dice1=(int)(Math.random()*6+1);
        int dice2=(int)(Math.random()*6+1);
        int dicesum = dice1 + dice2;
        return dicesum;
    }

    public void playerMove(){
        location = roll_dice() + location;
        location = location % 40;
        Display.boardPanel.repaint();
    }


}
