import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CenterOnScreen extends JFrame {
    
    public CenterOnScreen() {
        
        setSize(300, 200);
        setTitle("CenterOnScreen");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
                    size.height/2 - getHeight()/2);
    }
    
    public static void main(String[] args) {        
        CenterOnScreen cos = new CenterOnScreen();
        cos.setVisible(true);
        
    }
}
