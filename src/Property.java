
import java.awt.Color;

public class Property {
    // fill in props
    Color color;
    String name;
    int cost;
    int house;
    int parking;
    Player owner;
    int rent;
    Boolean jail;
    int mortgage; 
    
    //buying and stuff 
    
    public Player getOwner(){
        return owner;
    }
    public void setOwner(Player propowner){
        owner = propowner;
    }
    public boolean isOwned(){
        return owner != null;
    }




    ///. constructors 
    public Property(Color c, String n, int co, int h, int p, Boolean o, int r, Boolean j, int m){
        color = c;
        name = n;
        cost = co;
        house = h;
        parking = p;
        owner = null;
        rent = r;
        jail = j;
        mortgage = m;

    }
    
    //TODO fix
    public Color getColor(){
        return color;
    }

    //TODO fix
    public String getName(){
        return name;
    }
    
    public int getCost(){
        return cost;
    }

    //TODO fix
    public int getNumHouses(){
        return 0;
    }
    public int getParking(){
        return parking;
    }



    //TODO fix
    public int getRent(){
        return rent;
    }
    public final boolean getJail(){
        return jail;
    }
    public int getMon(){
        return mortgage;
    }
}