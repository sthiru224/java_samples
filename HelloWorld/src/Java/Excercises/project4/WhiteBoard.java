import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class WhiteBoard extends JComponent {
 
  private Image boardLayout;
  private Graphics2D myGraphics2D;
  private int currentX, currentY, oldX, oldY, paintStart=0;
 
  public WhiteBoard() {

    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent me) {
		// System.out.println("Mouse Pressed");
        oldX = me.getX();
        oldY = me.getY();
		if(paintStart==1) 
			paintStart=0;
		else 
			paintStart=1;
      }
    });
 

	addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseMoved(MouseEvent me) {
        currentX = me.getX();
        currentY = me.getY();
        if (myGraphics2D != null && paintStart == 1) {
		  myGraphics2D.setStroke(new BasicStroke(2));
          myGraphics2D.drawLine(oldX, oldY, currentX, currentY);
          repaint();
          oldX = currentX;
          oldY = currentY;
        }
      }
    });

  }
 
  public void paintComponent(Graphics g) {
    if (boardLayout == null) {
      boardLayout = createImage(getSize().width, getSize().height);
      myGraphics2D = (Graphics2D) boardLayout.getGraphics();
      clearWhiteBoard();
    }
    g.drawImage(boardLayout, 0, 0, null);
  }
 
  public void clearWhiteBoard() {
    myGraphics2D.setPaint(Color.white);
    myGraphics2D.fillRect(0, 0, getSize().width, getSize().height);
    myGraphics2D.setPaint(Color.black);
    repaint();
  }
 


 
  public void setColor(Color c) {
     myGraphics2D.setPaint(c);
  }
  
}