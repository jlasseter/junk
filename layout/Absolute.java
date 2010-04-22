import javax.swing.JButton;
import javax.swing.JFrame;


public class Absolute extends JFrame {


    public Absolute() {

        setTitle("Absolute positioning");

        setLayout(null);

        JButton ok = new JButton("OK");
        ok.setBounds(50, 150, 80, 25);

        JButton close = new JButton("Close");
        close.setBounds(150, 150, 80, 25);

        add(ok);
        add(close);

        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Absolute();
    }
}
