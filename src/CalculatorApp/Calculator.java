package CalculatorApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton; 
    JButton decButton, equButton, clrButton, delButton, negButton;
    JPanel panel;

    Font myFont = new Font("Old English Text MT", Font.PLAIN, 22);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Calculator(){

        frame = new JFrame("Calculator");
        frame.setSize(550,550);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        textField = new JTextField();
        textField.setBounds(50,25,430,60);
        textField.setEditable(false);
        textField.setFont(myFont);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        clrButton = new JButton("CLEAR");
        delButton = new JButton("DELETE");
        negButton = new JButton("(+/-)");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = clrButton;
        functionButtons[7] = delButton;
        functionButtons[8] = negButton;
        
        for(int i=0; i<9; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFocusable(false);
            functionButtons[i].setFont(myFont);
        }

        for(int i=0; i<10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setFont(myFont);
        }

        negButton.setBounds(205,430,120,50);
		delButton.setBounds(50,430,150,50);
		clrButton.setBounds(330,430,150,50);

        panel = new JPanel();
        panel.setBounds(50,100,430,300);
        panel.setLayout(new GridLayout(4,4));
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        
        new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i=0; i<10; i++){
            if(e.getSource() == numberButtons[i]){
               textField.setText(textField.getText().concat(String.valueOf(i)));
             
            }

        }
        if(e.getSource() == decButton){
            textField.setText(textField.getText().concat("."));
        }

        if(e.getSource() == addButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        
        if(e.getSource() == subButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        
        if(e.getSource() == mulButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        
        if(e.getSource() == divButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        if(e.getSource() == equButton){
            num2 = Double.parseDouble(textField.getText());

            switch(operator){
            case '+':
                result = num1+num2;
                break;

            case '-':
                result = num1-num2;
                break;

            case '*':
                result = num1*num2;
                break;

            case '/':
                result = num1/num2;
                break;
                
            }
            textField.setText(String.valueOf(operator));
            num1 = result;
        }

        if(e.getSource() == clrButton){
            textField.setText("");
        }

        if(e.getSource() == delButton){
            String string = textField.getText();
            textField.setText("");
            for(int i=0; i<string.length()-1; i++) {
				textField.setText(textField.getText()+string.charAt(i));
			}
		}
		if(e.getSource() == negButton) {
			double temp = Double.parseDouble(textField.getText());
			temp*=-1;
			textField.setText(String.valueOf(temp));
		    }
        }

    }
    

