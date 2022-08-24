package MouseListener;

import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;

public class MyFrame extends JFrame{

    ImageIcon image;
    JLabel label;
    boolean move = true;

    MyFrame(){
        this.setTitle("Mouse Magic");
        this.setSize(900,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        image = new ImageIcon("C://Users//Aditya//OneDrive//Desktop//Files//Emojis//alien.png");

        label = new JLabel();
        label.setIcon(image);
        label.setBounds(0,0,100,100);
        label.addMouseListener(new MouseMagic());

        this.add(label);
        this.getContentPane().setBackground(Color.BLACK);
        this.addKeyListener(new StopKey());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    public class MouseMagic implements MouseInputListener{

        Random random = new Random();

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {

            if(move){
                int x = random.nextInt(800);
                int y = random.nextInt(600);

                label.setLocation(x,y);
            }
            move = true;
        }

        @Override
        public void mouseExited(MouseEvent e) {}

        @Override
        public void mouseDragged(MouseEvent e) {}

        @Override
        public void mouseMoved(MouseEvent e) {}

    }

    public class StopKey implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            char ch = 'a';
            if(ch == 'a'){
                move = false;
            }

        }

        @Override
        public void keyPressed(KeyEvent e) {}

        @Override
        public void keyReleased(KeyEvent e) {}

    }

    public static void main(String[] args) {
        new MyFrame();    
    }
    
}
