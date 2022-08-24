package Animation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class MyFrame extends JFrame{
    
    MyPanel panel;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("2D Animation");
        this.setResizable(false);

        panel = new MyPanel();

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

public class MyPanel extends JPanel implements ActionListener{

    final int PANEL_HEIGHT = 339;
    final int PANEL_WIDTH = 508;
    Image Alien;
    Image Space;
    Timer timer;
    int xVelocity = 3;
    int yVelocity = 1;
    int x, y = 0;

    MyPanel(){

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);

        Alien = new ImageIcon("C:\\Users\\Aditya\\OneDrive\\Desktop\\Files\\Emojis\\alien.png").getImage();
        Space = new ImageIcon("C:/Users/Aditya/OneDrive/Desktop/Files/Emojis/space.jpg").getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g){
        super.paint(g);
    
        Graphics2D g2D = (Graphics2D)g;
        g2D.drawImage(Space, 0, 0, null);
        g2D.drawImage(Alien, x, y, null);   
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(x>=PANEL_WIDTH - Alien.getWidth(null) || x<0){
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        
        if(y>=PANEL_HEIGHT - Alien.getHeight(null) || y<0){
            yVelocity = yVelocity * -1;

        }
        y = y + yVelocity;  
                
        repaint();
    }
}

public static void main(String[] args) {
    
        new MyFrame();

        }

}
