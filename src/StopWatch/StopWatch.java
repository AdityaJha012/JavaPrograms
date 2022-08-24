package StopWatch;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StopWatch implements ActionListener{

    JFrame frame = new JFrame("StopWatch");
    JLabel timeLabel = new JLabel();
    JButton startButton = new JButton("START");
    JButton resetButton = new JButton("RESET");
    int elaspedTime = 0;
    int Seconds = 0;
    int Minutes = 0;
    int Hours = 0;
    boolean started = false;
    String Seconds_String = String.format("%02d", Seconds);
	String Minutes_String = String.format("%02d", Minutes);
	String Hours_String = String.format("%02d", Hours);

    Timer timer = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e){

            elaspedTime = elaspedTime+1000;
            Hours = (elaspedTime/3600000);
            Minutes = (elaspedTime/60000)%60;
            Seconds = (elaspedTime/1000)%60;
            Seconds_String = String.format("%02d", Seconds);
            Minutes_String = String.format("%02d", Minutes);
            Hours_String = String.format("%02d", Hours);
            timeLabel.setText(Hours_String+":"+Minutes_String+":"+Seconds_String);

        }

    });

    StopWatch(){

        timeLabel.setText(Hours_String+":"+Minutes_String+":"+Seconds_String);
        timeLabel.setBounds(50,100,285,100);
        timeLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
        timeLabel.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        timeLabel.setBackground(Color.gray);
        timeLabel.setForeground(Color.blue);
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        startButton.setBounds(50,200,140,50);
        startButton.setBackground(Color.gray);
        startButton.setForeground(Color.green);
        startButton.setFont(new Font("Algerian",Font.PLAIN,25));
        startButton.setBorder(BorderFactory.createLineBorder(Color.red, 3));;
        startButton.setFocusable(false);
        startButton.addActionListener(this);

        resetButton.setBounds(195,200,140,50);
        resetButton.setBackground(Color.gray);
        resetButton.setForeground(Color.magenta);
        resetButton.setFont(new Font("Algerian",Font.PLAIN,25));
        resetButton.setBorder(BorderFactory.createLineBorder(Color.red, 3));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.setTitle("StopWatch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);
        frame.add(startButton);
        frame.add(resetButton);
        frame.add(timeLabel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startButton){
            if(started == false){
                started = true;
                startButton.setText("STOP");
                startButton.setBackground(Color.gray);
                startButton.setForeground(Color.red);
                start();
            }
            else{
                started = false;
                startButton.setText("START");
                startButton.setBackground(Color.gray);
                startButton.setForeground(Color.green);
                stop();
            }
        }
        if(e.getSource() == resetButton){
            started = false;
            startButton.setText("START");
            startButton.setBackground(Color.gray);
            startButton.setForeground(Color.green);
            reset();
        }
        
    }

    void start(){

        timer.start();

    }
    
    void stop(){

        timer.stop();

    }

    void reset(){

        timer.stop();
        elaspedTime = 0;
        Seconds = 0;
        Minutes = 0;
        Hours = 0;
        Seconds_String = String.format("%02d", Seconds);
		Minutes_String = String.format("%02d", Minutes);
		Hours_String = String.format("%02d", Hours);
		timeLabel.setText(Hours_String+":"+Minutes_String+":"+Seconds_String);

    }

    public static void main(String[] args) {
        
        new StopWatch();

    }

}
