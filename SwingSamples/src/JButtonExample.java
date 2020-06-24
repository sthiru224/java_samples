import javax.swing.*;    
public class JButtonExample {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  
    JButton b=new JButton("Click Here");  
    b.setBounds(50,200,95,30);  
    f.add(b);  
    f.setSize(400,400);  
    
    JLabel l1,l2;  
    l1=new JLabel("First Label.");  
    l1.setBounds(50,50, 100,30);  
    l2=new JLabel("Second Label.");  
    l2.setBounds(50,100, 100,30);  
    f.add(l1); f.add(l2);  
    
    f.setLayout(null);  
    f.setVisible(true);  
  
}  
}  