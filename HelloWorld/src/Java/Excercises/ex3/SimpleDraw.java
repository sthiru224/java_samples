import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SimpleDraw extends JFrame
        implements ActionListener, MouseListener {
    // (x1,y1) = coordinate of mouse pressed
    // (x2,y2) = coordinate of mouse released
    int x1;
    int y1;
    int x2;

    int y2;

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    String shapeType = "Rectangle";

    public SimpleDraw() {
        this.setTitle("Simple DRAW");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // add check box group
        ButtonGroup cbg = new ButtonGroup();
        JRadioButton lineButton = new JRadioButton("Line");
        JRadioButton ovalButton = new JRadioButton("Oval");
        JRadioButton rectangleButton =
                new JRadioButton("Rectangle");
        cbg.add(lineButton);
        cbg.add(ovalButton);
        cbg.add(rectangleButton);
        lineButton.addActionListener(this);
        ovalButton.addActionListener(this);
        rectangleButton.addActionListener(this);
        rectangleButton.setSelected(true);
        JPanel radioPanel = new JPanel(new FlowLayout());
        radioPanel.add(lineButton);
        radioPanel.add(ovalButton);
        radioPanel.add(rectangleButton);
        this.addMouseListener(this);
        this.setLayout(new BorderLayout());
        this.add(radioPanel, BorderLayout.NORTH);
    }

    public void paint(Graphics g) {
        paintComponents(g);
        for (Shape shape : shapes) {
          Graphics2D g2 = (Graphics2D)g;  
          g2.draw(shape);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        shapeType = ae.getActionCommand().toString();
    }

    public void mouseClicked(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {

    }

    public void mouseExited(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
        x1 = me.getX();
        y1 = me.getY();
    }

    public void mouseReleased(MouseEvent me) {
        x2 = me.getX();
        y2 = me.getY();
        Shape shape = null;
        if (shapeType.equals("Rectangle")) {
            // a Rectangle cannot have a zero width or height
            if (x1 != x2 || y1 != y2) {
                shape = new Rectangle(x1, y1, x2, y2);
            }
        } 
        if (shape != null) {
            this.shapes.add(shape);
            this.repaint();
        }
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SimpleDraw frame = new SimpleDraw();
        frame.pack();
        frame.setVisible(true);
    }
}