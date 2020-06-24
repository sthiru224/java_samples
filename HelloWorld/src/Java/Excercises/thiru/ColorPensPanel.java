import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Path2D;

public class ColorPensPanel extends JPanel {
	private ArrayList<Color> colors = new ArrayList<>();
	private JButton red, green, blue;
	private JButton erase, clear, size;
	private Shape shape, lineShape1,lineShape2,lineShape3;
	private Point first, last;
	private Color color0, color1,color2,color3,color4;
	private int mouseClicks;
	private int buttonClicked=0;

	private Path2D path = new Path2D.Double();;

	public ColorPensPanel() {
		colors.add(Color.BLACK);
		colors.add(Color.RED);
		colors.add(Color.GREEN);
		colors.add(Color.BLUE);
		colors.add(Color.WHITE);

		red = new JButton("RED");
		green = new JButton("GREEN");
		blue = new JButton("BLUE");
		
		clear = new JButton("CLEAR");
		erase = new JButton("ERASE");
		size = new JButton("SIZE");

		mouseClicks = 0;

		setBackground(Color.white);
		setPreferredSize(new Dimension(500, 500));
		addMouseListener(new LineListener());
		addMouseMotionListener(new LineListener());

		add(red);
		add(green);
		add(blue);
		add(erase);
		add(clear);
		add(size);

		red.addActionListener(new ButtonListener());
		green.addActionListener(new ButtonListener());
		blue.addActionListener(new ButtonListener());
		erase.addActionListener(new ButtonListener());
		clear.addActionListener(new ButtonListener());

	}


	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			Object source = ae.getSource();

			if (source == red){
				buttonClicked = 1;
				System.out.println("Red button Clicked");
				color1 = (Color) colors.get(1);
			}
			else if (source == green){
				buttonClicked = 2;
				System.out.println("Green button Clicked");
				color2 = (Color) colors.get(2);
			}
			else if (source == blue){
				buttonClicked = 3;
				System.out.println("Blue button Clicked");
				color3 = (Color) colors.get(3);
			}
			else if (source == erase){
				System.out.println("Erase button Clicked");
				//color4 = (Color) colors.get(4);
			}
			else if (source == clear){
				// ColorPensPanel.removeAll();
				System.out.println("Clear button Clicked");
				//color0 = (Color) colors.get(0);
			}
		}
	}




	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		if (first != null && last != null&& buttonClicked ==1) {
			System.out.println("I am inside paintComponent g2");
			BasicStroke bs = new BasicStroke(1);
			lineShape1 = bs.createStrokedShape(shape);
			g2.setColor(color1);
			g2.draw(lineShape1);
			g2.fill(lineShape1);
		}



	}

	private class LineListener extends MouseAdapter {

		public void mousePressed(MouseEvent me) {
			mouseClicks++;
			if (mouseClicks % 2 == 1) {
				first = me.getPoint();
				shape = path;
			} else {
				first = last;
			}
		}

		public void mouseMoved(MouseEvent me) {
			if (mouseClicks % 2 == 1) {
				last = me.getPoint();
				path = (Path2D) shape;
				path.moveTo(first.x, first.y);
				path.lineTo(last.x, last.y);
				shape = path;
				first = last;
				repaint();
			}
		}

		public void mouseReleased(MouseEvent me) {
			path = (Path2D) shape;
			try {
				path.closePath();
			} catch (Exception e) {
			}

			shape = path;
			repaint();
		}
	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
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