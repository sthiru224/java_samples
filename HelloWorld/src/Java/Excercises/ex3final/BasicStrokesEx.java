import java.awt.BasicStroke;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class BasicStrokesEx extends JFrame {

    public BasicStrokesEx() {

        initUI();
    }
    
    private void initUI() {

        add(new Surface());

        setTitle("Basic strokes");
        setSize(280, 270);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                BasicStrokesEx ex = new BasicStrokesEx();
                ex.setVisible(true);
            }
        });
    }
}