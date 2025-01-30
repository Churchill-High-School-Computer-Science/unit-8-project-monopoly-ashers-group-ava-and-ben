
import java.awt.Color;

public class Property {
    // fill in props
    Color color;
    String name;
    int cost;
    int house;
    int parking;
    Boolean owner;
    int rent;
    Boolean jail;
    int mortgage;
    
    ///. constructors 
    public Property(Color c, String n, int co, int h, int p, Boolean o, int r, Boolean j, int m){
        color = c;
        name = n;
        cost = co;
        house = h;
        parking = p;
        owner = o;
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
        return house;
    }
    public int getParking(){
        return parking;
    }

    //TODO fix
    public boolean getOwner(){
        return owner;
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
