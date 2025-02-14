import java.util.ArrayList;
import javax.swing.JOptionPane;




public class Player {

    public Player(String playerName) {
        name = playerName;
        location = 0;
        money = 1500;
    }

    String name;
    int location;
    int money;
    public boolean Jail = false;
    private int turnsinjail = 0;
    
    public void arrested(){
        Jail = true;
        turnsinjail = 0;
        location = 10;
    }
    public void released(){
        Jail = false;
        turnsinjail = 0;
    }
    public int timeinjailyk(){
        return turnsinjail;
    }

    public void addtothemturns(){
        turnsinjail++;
    }


    public String getName(){
        return name;
    }


    public int getMoney(){
        return money;
    }



    //TODO FIX
    private ArrayList<Property> properties = new ArrayList<>();
    public ArrayList<Property> getProperties(){
        return properties;
    }

    //TODO FIX
    //Go is the top left corner, location 0. Locations increase by 1 for each property that the player passes clockwise.
    public int getLocation(){
        return location;
    }

    public int roll_dice(){
        JOptionPane.showMessageDialog(null,"PRess to Roll");
        int dice1=(int)(Math.random()*6+1);
        int dice2=(int)(Math.random()*6+1);
        int dicesum = dice1 + dice2;
        Display.setDiceDisplay("You rolled " + dice1 + " & " + dice2);

        if(Jail){
            if (dice1 == dice2){
                Display.setDiceDisplay("Snmake eyes");
                location = (10 + dicesum) % 40;
                released();
            }
                else {
                    addtothemturns();
                    if(timeinjailyk() == 3){
                        if(money >= 50)
                        money -= 50;
                        location = (10 + dicesum) % 40;
                        released();
                    }
                    else {
                        Display.inform(getName() + " Your out of the game");
                        for (int i = 0; i < Display.players.size(); i ++){
                            if (Display.players.get(i).getName().equals(name)){
                                Display.players.remove(i);
                                break;
                            }
                        }
                    }
                }
        }



        return dicesum;
    }

    public void playerMove(int moves){
        location = (roll_dice() + moves) % 4;
        Display.boardPanel.repaint();
    }
}
