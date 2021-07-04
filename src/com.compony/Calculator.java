package com.compony;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    //GLOBAL declaration frame - button - text filed

    JFrame frame;

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button0;
    JButton AddButton;
    JButton MinusButton;
    JButton MultiButton;
    JButton DivideButton;
    JButton EqualButton;
    JButton DecimalButton;
    JButton DeleteButton;
    JButton ClearButton;

    JTextField text;

    String operation = "";

    double firstInput = 0.0;
    double secondInput = 0.0;

    public Calculator() {

    }

    public void setupFrame() {

        frame = new JFrame("Calculator");

        frame.setSize(310, 400);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.darkGray);

    }
    public void setupButton(){

    //Add buttons ~ 0-9 / +-×÷ / del - clear

        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");

        AddButton = new JButton("+");
        MinusButton = new JButton("-");
        MultiButton = new JButton("*");
        DivideButton = new JButton("÷");
        EqualButton = new JButton("=");
        DecimalButton = new JButton(".");

        DeleteButton = new JButton("Del");
        ClearButton = new JButton("Clear");

        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

        AddButton.addActionListener(this);
        MinusButton.addActionListener(this);
        DivideButton.addActionListener(this);
        MultiButton.addActionListener(this);
        EqualButton.addActionListener(this);
        DecimalButton.addActionListener(this);
        ClearButton.addActionListener(this);
        DeleteButton.addActionListener(this);

    //size button

        button1.setBounds(50,100,40,30);
        button2.setBounds(100,100,40,30);
        button3.setBounds(150,100,40,30);
        AddButton.setBounds(200,100,50,30);

        button4.setBounds(50,150,40,30);
        button5.setBounds(100,150,40,30);
        button6.setBounds(150,150,40,30);
        MultiButton.setBounds(200,150,50,30);

        button7.setBounds(50,200,40,30);
        button8.setBounds(100,200,40,30);
        button9.setBounds(150,200,40,30);
        MinusButton.setBounds(200,200,50,30);

        DecimalButton.setBounds(50,250,40,30);
        button0.setBounds(100,250,40,30);
        EqualButton.setBounds(150,250,42,30);
        DivideButton.setBounds(200,250,50,30);
        DeleteButton.setBounds(60,300,80,30);
        ClearButton.setBounds(160,300,80,30);

        ClearButton.setBackground(Color.pink);
        DeleteButton.setBackground(Color.pink);

        //visible
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(AddButton);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button0);
        frame.add(MinusButton);
        frame.add(DivideButton);
        frame.add(MultiButton);
        frame.add(DecimalButton);
        frame.add(EqualButton);
        frame.add(DeleteButton);
        frame.add(ClearButton);


    }

    public void setFiled(){

        text = new JTextField();
        text.setBounds(60,50,180,30);
        frame.add(text);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if( e.getSource() == button0 ){

            text.setText(text.getText().concat("0"));
        }
        if( e.getSource() == button1 ){

            text.setText(text.getText().concat("1"));
        }
        if( e.getSource() == button2 ){

            text.setText(text.getText().concat("2"));
        }
        if( e.getSource() == button3 ){

            text.setText(text.getText().concat("3"));
        }
        if( e.getSource() == button4 ){

            text.setText(text.getText().concat("4"));
        }
        if( e.getSource() == button5 ){

            text.setText(text.getText().concat("5"));
        }
        if( e.getSource() == button6 ){

            text.setText(text.getText().concat("6"));
        }
        if( e.getSource() == button7 ){

            text.setText(text.getText().concat("7"));
        }
        if( e.getSource() == button8 ){

            text.setText(text.getText().concat("8"));
        }
        if( e.getSource() == button9 ){

            text.setText(text.getText().concat("9"));
        }
        if( e.getSource() == DecimalButton ){

            text.setText(text.getText().concat("."));
        }
        if( e.getSource() == AddButton ){
            firstInput = Double.parseDouble(text.getText());
            operation = "+";
            text.setText("");
        }
        if( e.getSource() == MinusButton ){
            firstInput = Double.parseDouble(text.getText());
            text.setText("");
            operation = "-";

        }
        if( e.getSource() == MultiButton ){
            firstInput = Double.parseDouble(text.getText());
            text.setText("");
            operation = "*";
        }
        if( e.getSource() == DivideButton ){
            firstInput = Double.parseDouble(text.getText());
            text.setText("");
            operation = "/";
        }
        if( e.getSource() == EqualButton){

            secondInput = Double.parseDouble(text.getText());

            if(operation == "+"){
                Double resalut = firstInput + secondInput;
                text.setText(resalut + "");
            }
            if(operation == "-"){
                Double resalut = firstInput - secondInput;
                text.setText(resalut + "");
            }
            if(operation == "/"){
                Double resalut = firstInput / secondInput;
                text.setText(resalut + "");
            }
            if(operation == "*"){
                Double resalut = firstInput * secondInput;
                text.setText(resalut + "");
            }
        }
        if( e.getSource() == DeleteButton ){
            String del = text.getText();
            text.setText("");
            for (int i = 0; i < del.length()-1 ; i++){
                text.setText(text.getText() + del.charAt(i));
            }
        }
        if( e.getSource() == ClearButton ){
            text.setText("");
        }
    }
}
