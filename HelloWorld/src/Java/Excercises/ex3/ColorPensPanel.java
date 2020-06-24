import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Path2D;
public class ColorPensPanel extends JPanel
{
private ArrayList colors;
private JButton red, green, blue;
private Point first, last;
private Shape shape, lineShape;
private Color color;
private int mouseClicks;
private Path2D path;

public ColorPensPanel()
{
colors = new ArrayList();
colors.add(Color.BLACK);
colors.add(Color.RED);
colors.add(Color.GREEN);
colors.add(Color.BLUE);
  
red = new JButton("RED");
green = new JButton("GREEN");
blue = new JButton("BLUE");
  
mouseClicks = 0;
  
setBackground(Color.white);
setPreferredSize(new Dimension(500, 500));
addMouseListener(new LineListener());
addMouseMotionListener(new LineListener());
  
add(red);
add(green);
add(blue);
  
red.addActionListener(new ButtonListener());
green.addActionListener(new ButtonListener());
blue.addActionListener(new ButtonListener());
}

public void paintComponent(Graphics g)
{
super.paintComponent(g);
Graphics2D g2 = (Graphics2D) g;
  
if(first != null && last != null)
{
BasicStroke bs = new BasicStroke(1);
lineShape = bs.createStrokedShape(shape);
g2.setColor(color);
g2.draw(lineShape);
g2.fill(lineShape);
}
}

private class LineListener extends MouseAdapter
{
public void mousePressed(MouseEvent me)
{
mouseClicks++;
if(mouseClicks % 2 == 1)
{
first = me.getPoint();
path = new Path2D.Double();
shape = path;
}
else
{
first = last;
}
}

public void mouseMoved(MouseEvent me)
{
if(mouseClicks % 2 == 1)
{
last = me.getPoint();
path = (Path2D) shape;
path.moveTo(first.x, first.y);
path.lineTo(last.x, last.y);
shape = path;
first = last;
repaint();
}
}

public void mouseReleased(MouseEvent me)
{
path = (Path2D) shape;
try
{
path.closePath();
}
catch(Exception e)
{}

shape = path;
repaint();
}
}

private class ButtonListener implements ActionListener
{
public void actionPerformed(ActionEvent ae)
{
Object source = ae.getSource();

if(source == red)
color = colors.get(1);
else if(source == green)
   color = colors.get(2);
else if(source == blue)
color = colors.get(3);

else
color = colors.get(0);
}
}

public static void main(String[] args)
{
SwingUtilities.invokeLater(new Runnable()
{
public void run()
{
ColorPensPanel shapes = new ColorPensPanel();
JFrame frame = new JFrame("Pen Demo");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(shapes);
frame.pack();
frame.setVisible(true);
}
});
}
}