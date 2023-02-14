import javax.swing.*;

import org.w3c.dom.Text;

import java.awt.*;
public class Simple {  

Simple(){
    
    JFrame f = new JFrame("Intro");
  JLabel label = new JLabel();
  label.setText("Hello, world!");
  
  label.setHorizontalTextPosition(JLabel.CENTER);
  label.setVerticalTextPosition(JLabel.TOP);
  label.setForeground(new Color(255, 255, 255));
    f.setVisible(true);
    f.setSize(400,400);
   f.add(label);
    ImageIcon img = new ImageIcon("Screenshot_76.png");
    f.setIconImage(img.getImage());
    f.getContentPane().setBackground(new Color(24,154,211));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 
            
        }
    
     
    }
    

    
// f=new JFrame();//creating instance of JFrame  
          
// JButton b=new JButton("click");//creating instance of JButton  
// b.setBounds(130,100,100, 40);  
          
// f.add(b);//adding button in JFrame  
          
// f.setSize(400,500);//400 width and 500 height  
// f.setLayout(null);//using no layout managers  
// f.setVisible(true);//making the frame visible  
// }  
  
// public static void main(String[] args) {  
// new Simple();  
// }  
