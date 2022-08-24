package DragAndDrop;

import javax.swing.ImageIcon;
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;
import java.awt.Graphics;

public class MyFrame extends JFrame{

    DragPanel panel;

    MyFrame(){
        this.setTitle("Drag And Drop Panel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new DragPanel();
        
        this.add(panel);
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public class DragPanel extends JPanel{

        ImageIcon image = new ImageIcon("C:\\Users\\Aditya\\OneDrive\\Desktop\\Files\\Emojis\\alien.png");
        Point imageCorner;
        Point prevPt;

        DragPanel(){
            
            imageCorner = new Point(0,0);

            ClickListener clickListener = new ClickListener();
            DragListener dragListener = new DragListener();

            this.addMouseListener(clickListener);
            this.addMouseMotionListener(dragListener);

        }

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
        }

        private class ClickListener extends MouseInputAdapter{

            @Override
            public void mousePressed(MouseEvent e) {
               prevPt = e.getPoint();
            }

        }

        private class DragListener extends MouseInputAdapter{

            @Override
            public void mouseDragged(MouseEvent e) {
                
                Point currentPt = e.getPoint();

                imageCorner.translate(
                    (int)(currentPt.getX() - prevPt.getX()),
                    (int)(currentPt.getY() - prevPt.getY())
                );
                prevPt = currentPt;
                repaint();
            }

        }

    }

    public static void main(String[] args){
            new MyFrame();
    }
    
}
