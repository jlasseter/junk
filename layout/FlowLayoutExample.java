import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTree;


public class FlowLayoutExample extends JFrame {


    public FlowLayoutExample() {

        setTitle("FlowLayout Example");

        JPanel panel = new JPanel();
        // The implicit layout manager of the JPanel component is a FlowLayout manager. 

        JTextArea area = new JTextArea("text area");
        area.setPreferredSize(new Dimension(100, 100));
        // If we didn't set the preferred size, the component size would be that of its text. 

        JButton button = new JButton("button");
        panel.add(button);

        JTree tree = new JTree();
        panel.add(tree);

        panel.add(area);

        add(panel);

        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
