import javax.swing.SwingUtilities;

public class Monopoly {
    public static void main(String[] args) {
            System.out.println("tst");
        Board b = new Board();
        
        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());
    }
}
