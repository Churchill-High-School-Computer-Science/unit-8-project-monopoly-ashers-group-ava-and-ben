import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Display extends JFrame {

    static Property[][] properties = new Property[11][11];
    static ArrayList<Player> players = new ArrayList<>(1);
    static JButton communityChest = new JButton("Community Chest");
    static JButton chance = new JButton("Chance");
    static JLabel diceDisplay = new JLabel();
    static JFrame frame = new JFrame("Monopoly Game");
    static int currentPlayerIndex = 0;
    public static void addPlayer(Player player){
        players.add(player);
    }

    

    static JPanel boardPanel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g.setColor(Color.BLACK);
            g.drawRect(50,50,500,500);

            // Draw the board background
            g2d.setColor(new Color(240, 230, 200));
            g2d.fillRect(0, 0, 75 * 11, 75 * 11);

            // Draw grid and properties
            g2d.setColor(Color.BLACK);
            for (int i = 0; i < properties.length; i++) {
                for (int j = 0; j < properties[i].length; j++) {
                    if (i == 0 || i == 10 || j == 0 || j == 10) {
                        g2d.setColor(Color.BLACK);
                        g2d.drawRect(i * 75, j * 75, 75, 75);
                       /*  if (properties[i][j] == null) {
                            properties[i][j] = new Property();
                            
                        }
                        drawProperty(properties[i][j], g2d, i, j);
                        for testing*/
                         if (properties[i][j] != null) {
                            drawProperty(properties[i][j], g2d, i, j);
                        }
                         
                    }
                }
            }

            //Draw player assets
            drawPlayerAssets(g2d);
            drawPlayers(g2d);
        }
    
        public void drawPlayers(Graphics g2d){
            
            if(players != null && !players.isEmpty()){
                int playerOffset = 1;
                for(Player p:players){
                    int xoffset = 0;
                    int yoffset = 0;

                    //top row
                    if(p.getLocation() < 11){
                        xoffset = p.getLocation() * 75;
                    }

                    //bottom row
                    else if(p.getLocation() > 19 && p.getLocation() < 31){
                        xoffset = (30 - p.getLocation()) * 75;
                        yoffset = 750;
                    }

                    //right side
                    else if(p.getLocation() > 10 && p.getLocation() < 20){
                        yoffset = (p.getLocation()-10) * 75;
                        xoffset = 750;
                    }

                    else if(p.getLocation() > 30 && p.getLocation() < 40){

                        yoffset = (40 - p.getLocation()) * 75;
                        xoffset = 0;
                    }

                    else{
                        System.out.println("Invalid player location.");
                    }

                    g2d.setColor(new Color(255, 0, 255));
                    g2d.fillOval(xoffset + playerOffset * 18 - 15, yoffset + 30, 15, 15);
                    g2d.setColor(new Color(255, 255, 255));
                    g2d.drawString(Integer.toString(playerOffset), xoffset + playerOffset * 18 - 10, yoffset + 43);

                    playerOffset += 1;
                }
            }
        }
        

        private void drawProperty(Property p, Graphics2D g2d, int x, int y) {

            // Draw color bar
            g2d.setColor(p.getColor());
            g2d.fillRect(x * 75, y * 75, 75, 75 / 4);

            // Draw property name
            g2d.setColor(Color.BLACK);
            g2d.setFont(new Font("SansSerif", Font.PLAIN, 10));
            g2d.drawString(p.getName(), x * 75 + 5, y * 75 + 65);

            //Draw houses
            g2d.setColor(new Color(50, 168, 82));
            int offset = 0;
            for(int i = 0; i < p.getNumHouses(); i++){
                g2d.fillOval(x * 75 + offset, y*75, 10, 10);
                offset += 10;
            }
        }

        private void drawPlayerAssets(Graphics2D g2d) {

           // System.out.println(players.size());
            
            int playerOffset = 0;
            int propertyOffset = 25;

            if(players != null && !players.isEmpty()){
                for(Player player: players){
                    propertyOffset = 25;
                    g2d.setColor(Color.BLACK);
                    g2d.drawString(player.getName(), 150 + playerOffset, 300);
                    g2d.drawString("$" + player.getMoney(), 150 + playerOffset, 300 + 18);


                    if(player.getProperties() != null && !player.getProperties().isEmpty()){
                        for(Property property : player.getProperties()){
                            g2d.setColor(property.getColor());
                            g2d.fillRect(150 + playerOffset, 300 + propertyOffset, 75, 75 / 4);

                            // Draw property name
                            g2d.setColor(Color.BLACK);
                            g2d.drawString(property.getName(), 150 + playerOffset, 300 + propertyOffset + 15);

                            propertyOffset += 20;
                        }

                       
                    }

                    playerOffset += 150;
                }
            }
        }
    };

    public static void setupFrame() {
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null); 
        
        // Configure buttons
        communityChest.setBackground(new Color(0, 100, 200));
        communityChest.setBounds(200, 200, 150, 50);
        frame.add(communityChest);

        chance.setBackground(new Color(0, 100, 200));
        chance.setBounds(400, 200, 150, 50);
        frame.add(chance);

        //Config dice display
        diceDisplay.setBounds(600, 160, 100, 100);
        diceDisplay.setBackground(new Color(255, 255, 255));
        diceDisplay.setText("No rolls yet!");
        frame.add(diceDisplay);

        
        JButton rollDiceButton = new JButton("Roll Dice");
        rollDiceButton.setBounds(550, 300, 150, 50); // change ?
        rollDiceButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!players.isEmpty()){
                    Player currentPlayer = players.get(currentPlayerIndex);
       

                    if (currentPlayer.Jail){
                        currentPlayer.addtothemturns();
                        int choice = JOptionPane.showConfirmDialog(frame,
                        currentPlayer.getName() + " do you want to pay 50 dabloons to get out ??",
                        "----------------",
                        JOptionPane.YES_NO_OPTION);

                        if (choice == JOptionPane.YES_NO_OPTION && currentPlayer.getMoney() >= 50){
                            currentPlayer.money -= 50;
                            Display.inform(currentPlayer.getName()+ " is out on bond :( )");
                            currentPlayer.released();
                        }
                            else if (currentPlayer.timeinjailyk() == 3 ) {
                                Display.inform(currentPlayer.getName()+ " is out of jail finally took ya long enough");
                                currentPlayer.released();
                        }
                            else {
                                Display.inform(currentPlayer.getName()+ "Free my boy fr");
                                currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
                                return;
                            }
                    }






                    int roll = currentPlayer.roll_dice();
                    int check = currentPlayer.location;
                    currentPlayer.roll_dice();
                    currentPlayer.location = (currentPlayer.location + roll) % 40;

                    if (check + roll >= 40) {
                        currentPlayer.money += 200;
                    }
                    if (currentPlayer.location == 10 && !currentPlayer.Jail){
                        Display.inform(" Visit jail fr");
                    }

                    if (currentPlayer.location == 30){
                        Display.inform(currentPlayer.getName() + " is getting arrested ");
                        currentPlayer.arrested();
                        Display.boardPanel.repaint();
                        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
                        return;
                    }

                    Property isProperty = Board.propertiesMap.get(currentPlayer.location);
                    
                    if (isProperty != null && !isProperty.isOwned() && isProperty.getCost() > 0){
                        int choice = JOptionPane.showConfirmDialog(frame, currentPlayer.getName()+ " Do you want to buy" +isProperty.getName() + " for " + "Cost: " + isProperty.getCost(),
                        "Buy ???",
                        JOptionPane.YES_NO_OPTION);
                        
                        if (choice == JOptionPane.YES_OPTION && currentPlayer.getMoney() >= isProperty.getCost()) {
                            currentPlayer.money -= isProperty.getCost();
                            isProperty.setOwner(currentPlayer);
                            currentPlayer.getProperties().add(isProperty);
                        }
                        else if (choice == JOptionPane.YES_OPTION){
                            Display.inform("NARRRR");
                        }
                    }
                    Display.boardPanel.repaint();
                    currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
                }
            }
        });
        frame.add(rollDiceButton);


    


        communityChest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Community Chest Button Clicked!");
            }
        });

        chance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Chance Button Clicked!");
            }
        });

        // Add the custom board
        boardPanel.setBounds(50, 50, 900, 900);
        frame.add(boardPanel);
        frame.setVisible(true);
    
}

    public static void inform(String text){
        JOptionPane.showMessageDialog(frame, text);
    }

    //Display.choice(put the title text and options array)
    public static int choice(String title, String text, String[] options){
        return JOptionPane.showOptionDialog(frame,
                                            text,
                                            title,
                                            JOptionPane.YES_NO_OPTION,
                                            JOptionPane.QUESTION_MESSAGE,
                                            null,
                                            options,
                                            options[0]);
    }

// use this for dice ???
    public static void setDiceDisplay(String text){
        diceDisplay.setText(text);
        boardPanel.repaint();
    }
    
}
