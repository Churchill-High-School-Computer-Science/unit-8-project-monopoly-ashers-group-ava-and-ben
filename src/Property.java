
import java.awt.Color;

public class Property {
    // fill in props
    Color color;
    String name;
    int cost;
    String house;
    int parking;
    String owner;
    int rent;
    Boolean jail;
    int mortgage;
    
    ///. constructors 
    public Property(Color c, String n, int cost, String h, int p, String o, int r, Boolean j, int m){
        color = c;
        name = n;
        cost = cost;
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

    //TODO fix
    public int getNumHouses(){
        return 0;
    }
    public int getParking(){
        return parking;
    }

    //TODO fix
    public String getOwner(){
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
