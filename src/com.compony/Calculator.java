package com.compony;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

public class Calculator implements ActionListener {
    JFrame frame;
    JPanel panel;

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
    JButton logButton;
    JButton radicalButton;
    JButton factoryelButton;
    JButton DecimalButton;
    JButton DeleteButton;
    JButton ClearButton;
    JButton powButton;
    JButton manfibutton;

    JTextField text;

    String operation = "";

    double firstInput = 0.0;
    double secondInput = 0.0;

    Color myBlue = new Color(86, 113, 137);
    Color beige = new Color(250, 214, 165);

    public Calculator(){
        setupFrame();
        setupPanel();
        setupButton();
        setupFiled();
    }

    public void setupFrame() {
        frame = new JFrame("Calculator");
        frame.setSize(420, 450);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void setupPanel() {
        panel = new JPanel();
        panel.setSize(420, 450);
        panel.setVisible(true);
        panel.setBackground(myBlue);
    }

    public void setupButton(){
        createButtons();
        addButtonsActionListener();
        setButtonBounds();
        setButtonsColor();
        addButtonsToPanel();
        frame.add(panel);
    }

    public void createButtons(){
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

        logButton = new JButton("log");
        factoryelButton = new JButton("fac");
        radicalButton = new JButton("rad");
        powButton = new JButton("^");

        DeleteButton = new JButton("Del");
        ClearButton = new JButton("CLR");
        manfibutton = new JButton("-");
    }
    public void addButtonsActionListener(){
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

        logButton.addActionListener(this);
        radicalButton.addActionListener(this);
        factoryelButton.addActionListener(this);
        powButton.addActionListener(this);

        ClearButton.addActionListener(this);
        DeleteButton.addActionListener(this);
        manfibutton.addActionListener(this);
    }

    public void setButtonBounds(){
        button1.setBounds(50,100,70,30);
        button2.setBounds(130,100,70,30);
        button3.setBounds(210,100,70,30);
        AddButton.setBounds(290,100,70,30);

        button4.setBounds(50,150,70,30);
        button5.setBounds(130,150,70,30);
        button6.setBounds(210,150,70,30);
        MultiButton.setBounds(290,150,70,30);

        button7.setBounds(50,200,70,30);
        button8.setBounds(130,200,70,30);
        button9.setBounds(210,200,70,30);
        MinusButton.setBounds(290,200,70,30);

        DecimalButton.setBounds(50,250,70,30);
        button0.setBounds(130,250,70,30);
        EqualButton.setBounds(210,250,70,30);
        DivideButton.setBounds(290,250,70,30);


        logButton.setBounds(50,300,70,30);
        powButton.setBounds(130,300,70,30);
        radicalButton.setBounds(210,300,70,30);
        factoryelButton.setBounds(290,300,70,30);

        DeleteButton.setBounds(70,350,70,30);
        ClearButton.setBounds(160,350,70,30);
        manfibutton.setBounds(250,350,70,30);
    }
    public void setButtonsColor(){
        AddButton.setBackground(beige);
        MinusButton.setBackground(beige);
        MultiButton.setBackground(beige);
        EqualButton.setBackground(beige);
        DivideButton.setBackground(beige);
        logButton.setBackground(beige);
        powButton.setBackground(beige);
        radicalButton.setBackground(beige);
        factoryelButton.setBackground(beige);

        manfibutton.setBackground(beige);
        ClearButton.setBackground(beige);
        DeleteButton.setBackground(beige);
    }

    public void addButtonsToPanel(){
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(AddButton);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(MinusButton);
        panel.add(DivideButton);
        panel.add(MultiButton);
        panel.add(DecimalButton);
        panel.add(EqualButton);
        panel.add(powButton);
        panel.add(logButton);
        panel.add(factoryelButton);
        panel.add(radicalButton);
        panel.add(DeleteButton);
        panel.add(ClearButton);
        panel.add(manfibutton);
    }
    public void setupFiled(){
        text = new JTextField();
        text.setBounds(60,50,290,30);
        panel.add(text);
    }

    public int calculateFactorial(double firstInput){
        int resalut =1;

        for (int i = 1; i <= firstInput; i++) {
            resalut = resalut*i;
        }
        return resalut;
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
            if(operation == "^"){
                double resalut =  Math.pow(firstInput,secondInput);
                text.setText(resalut+"");
            }
        }
        if( e.getSource() == logButton ){
            firstInput = Double.parseDouble(text.getText());
            Double resalut = Math.log10(firstInput);
            text.setText("");
            text.setText(resalut + "");
        }
        if( e.getSource() == factoryelButton ){
            firstInput = Double.parseDouble(text.getText());
            int resalut = calculateFactorial(firstInput);
            text.setText("");
            text.setText(resalut+"");
        }
        if( e.getSource() == radicalButton ){
            firstInput = Double.parseDouble(text.getText());
            double resalut = Math.sqrt(firstInput);
            text.setText("");
            text.setText(resalut + "");
        }
        if( e.getSource() == powButton ){
            firstInput = Double.parseDouble(text.getText());
            text.setText("");
            operation = "^";
        }
        if( e.getSource() == radicalButton ){
            firstInput = Double.parseDouble(text.getText());
            double x = Math.sqrt(firstInput);
            text.setText(x + "");
        }
        if( e.getSource() == manfibutton ){
            String input_value = text.getText();
            if (input_value.charAt(0) != '-') {
                text.setText("");
                text.setText("-" + input_value);
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
