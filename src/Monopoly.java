import javax.swing.SwingUtilities;

public class Monopoly {
    public static void main(String[] args) {
        System.out.println("tst");
        Board b = new Board();
        
        Player player1 = new Player ("Ben");
        Player player2 = new Player ("Asher");
        Player player3 = new Player ("AVA");
        Display.addPlayer(player1);
        Display.addPlayer(player2);
        Display.addPlayer(player3);

        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());
    }
}
