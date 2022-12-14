import javax.swing.*;
import java.awt.*;

public class Run {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){

        }
        ImageIcon imageIcon = new ImageIcon("res/kisspng-spbu-pertamina-pasti-pas-spbu-64-781-14-logo-vec-5b75436e1d0438.2590058615344116301189.png");
        JFrame frame = new JFrame("Penggunanaan BBM");
        frame.setIconImage(imageIcon.getImage());
        frame.setContentPane(new giji().getrPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(1000,500);
        frame.setVisible(true);
    }
}
