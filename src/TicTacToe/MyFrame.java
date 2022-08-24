package TicTacToe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame{

    JPanel[] panels;
    JLabel image;
    JButton[] buttons = new JButton[9];
    JButton reset = new JButton("Reset");
    JLabel label = new JLabel("Start Game");
    ImageIcon image1 = new ImageIcon("C:/Users/Aditya/OneDrive/Desktop/Files/user1.png");
    ImageIcon image2 = new ImageIcon("C:/Users/Aditya/OneDrive/Desktop/Files/user2.png");
    int user = 1;
    int count = 0;  
    boolean WinnerFound = false;
    MyFrame(){

        this.setTitle("Tic Tac Toe");
        this.setSize(500,640);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        image = new JLabel(new ImageIcon("C:/Users/Aditya/OneDrive/Desktop/Files/t2.jpg"));
        panels = new JPanel[3];

        this.add(image);
        addpanels();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void addpanels(){
        image.setLayout(null);

        for(int i=0; i<3; i++){
            panels[i] = new JPanel();
            image.add(panels[i]);
        }
        panels[0].setBounds(50,20,400,40);
        panels[1].setBounds(50,90,400,380);
        panels[2].setBounds(50,500,400,40);
        addInfo();
    }

    public void addInfo(){

        panels[0].add(label);
        panels[0].setBackground(Color.BLACK);
        label.setFont(new Font("Times New Roman", Font.BOLD, 30));
        label.setForeground(new Color(125,50,250));
        panels[2].add(reset);
        panels[2].setOpaque(false);
        reset.setBackground(Color.black);
        reset.setForeground(Color.red);
        reset.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
        reset.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        addbuttons();
        reset.addActionListener(new ResetListener());
        reset.setEnabled(true);
    }

    public void addbuttons(){
        SignListener listener = new SignListener();
        panels[1].setLayout(new GridLayout(3,3));
        for(int i=0; i<9; i++){
            buttons[i] = new JButton();
            buttons[i].addActionListener(listener);
            buttons[i].setBackground(Color.black);
            panels[1].add(buttons[i]);
        }
    }

    public class SignListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          JButton bb = (JButton)e.getSource();
          if(user == 1){
            bb.setIcon(image1);
            label.setText("Second Player Turn");
            panels[0].setBackground(Color.black);
            label.setForeground(Color.blue);
            user = 2;
          }
          else if(user == 2){
            bb.setIcon(image2);
            label.setText("First Player Turn");
            panels[0].setBackground(Color.black);
            label.setForeground(new Color(125,50,250));
            user = 1;
          }
        bb.setEnabled(false);
        FindWinner();
        count++;
        if(count==9 && !WinnerFound){
            reset.setEnabled(true);
            label.setText("Match Draw");
            label.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "No One is the Winner!!");
        }
        }
        
        private void FindWinner()
		{
			//For first player
			if(buttons[0].getIcon()==image1 && buttons[1].getIcon()==image1 && buttons[2].getIcon()==image1)
				AnnounceWinner(0,1,2);
                if(buttons[3].getIcon()==image1 && buttons[4].getIcon()==image1 && buttons[5].getIcon()==image1)
				AnnounceWinner(3,4,5);
                if(buttons[6].getIcon()==image1 && buttons[7].getIcon()==image1 && buttons[8].getIcon()==image1)
				AnnounceWinner(6,7,8);
                if(buttons[0].getIcon()==image1 && buttons[3].getIcon()==image1 && buttons[6].getIcon()==image1)
				AnnounceWinner(0,3,6);
                if(buttons[1].getIcon()==image1 && buttons[4].getIcon()==image1 && buttons[7].getIcon()==image1)
				AnnounceWinner(1,4,7);
                if(buttons[2].getIcon()==image1 && buttons[5].getIcon()==image1 && buttons[8].getIcon()==image1)
				AnnounceWinner(2,5,8);
                if(buttons[0].getIcon()==image1 && buttons[4].getIcon()==image1 && buttons[8].getIcon()==image1)
				AnnounceWinner(0,4,8);
                if(buttons[2].getIcon()==image1 && buttons[4].getIcon()==image1 && buttons[6].getIcon()==image1)
				AnnounceWinner(2,4,6);
			
                //For second player
                if(buttons[0].getIcon()==image2 && buttons[1].getIcon()==image2 && buttons[2].getIcon()==image2)
				AnnounceWinner(0,1,2);
                if(buttons[3].getIcon()==image2 && buttons[4].getIcon()==image2 && buttons[5].getIcon()==image2)
				AnnounceWinner(3,4,5);
                if(buttons[6].getIcon()==image2 && buttons[7].getIcon()==image2 && buttons[8].getIcon()==image2)
				AnnounceWinner(6,7,8);
                if(buttons[0].getIcon()==image2 && buttons[3].getIcon()==image2 && buttons[6].getIcon()==image2)
				AnnounceWinner(0,3,6);
                if(buttons[1].getIcon()==image2 && buttons[4].getIcon()==image2 && buttons[7].getIcon()==image2)
				AnnounceWinner(1,4,7);
                if(buttons[2].getIcon()==image2 && buttons[5].getIcon()==image2 && buttons[8].getIcon()==image2)
				AnnounceWinner(2,5,8);
                if(buttons[0].getIcon()==image2 && buttons[4].getIcon()==image2 && buttons[8].getIcon()==image2)
				AnnounceWinner(0,4,8);
                if(buttons[2].getIcon()==image2 && buttons[4].getIcon()==image2 && buttons[6].getIcon()==image2)
				AnnounceWinner(2,4,6);
		}
		private void AnnounceWinner(int x,int y,int z)
		{
			buttons[x].setBackground(Color.green);
			buttons[y].setBackground(Color.green);
			buttons[z].setBackground(Color.green);
			label.setText("Game Over");
			label.setForeground(Color.magenta);
			for(int c=0;c<9;c++)
				buttons[c].setEnabled(false);
			if(user==2)
				JOptionPane.showMessageDialog(null,"The Winner is First Player");
			else
				JOptionPane.showMessageDialog(null,"The Winner is Second Player");
		}
	}
    class ResetListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt) 
		{
			reset.setEnabled(true);
			label.setText("First Player Turn");
			label.setForeground(new Color(125,50,250));
			panels[0].setBackground(Color.black);
			for(int c=0;c<9;c++)
			{
				buttons[c].setBackground(Color.black);
				buttons[c].setIcon(null);
				buttons[c].setEnabled(true);
			}
			user=1;
			WinnerFound=false;
			count=0;
		}
	}
    public static void main(String[] args) {
        
        new MyFrame();

    }
    
}
