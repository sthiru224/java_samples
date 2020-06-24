import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class GUIPanel {
 

  WhiteBoard whiteBoard;
  JButton clearBtn, colorBtn;
  Color c = new Color(0,0,0);
  
  ActionListener actionListener = new ActionListener() {
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == clearBtn) {
        whiteBoard.clearWhiteBoard();
      } else if (e.getSource() == colorBtn) {
	   c = JColorChooser.showDialog(whiteBoard, "Pick a Color", Color.blue);
       whiteBoard.setColor(c);
      } 
   }
  };
 
  public void show(){
	  displayWhiteBoard();
  }

  public void displayWhiteBoard() {
    JFrame frame = new JFrame("Abitha's Drawing Board");

    Container content = frame.getContentPane();
    content.setLayout(new BorderLayout());

    whiteBoard = new WhiteBoard();
    content.add(whiteBoard, BorderLayout.CENTER);
    
	JPanel controls = new JPanel();

    frame.setLocation(800, 400);
	frame.setSize(600, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

	colorBtn = new JButton("Change Color");
    colorBtn.addActionListener(actionListener);
    controls.add(colorBtn);

	clearBtn = new JButton("Clear Board");
    clearBtn.addActionListener(actionListener);
	controls.add(clearBtn);

    content.add(controls, BorderLayout.NORTH);

  }

  public static void main(String[] args) {
		new GUIPanel().displayWhiteBoard();
  }
 

}