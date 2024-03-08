import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator{

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btadd,btsub,btdiv,btmul,btequ,btdot,btac,btremove;
    TextField display;

    Calculator(){
        Frame frame =  new Frame("Calculator");

        display = new TextField("");
        display.setBounds(50,50,190,30);

        bt0 = new Button("0");
        bt0.setBounds(50,250,40,40);
        bt1 = new Button("1");
        bt1.setBounds(50,200,40,40);
        bt2 = new Button("2");
        bt2.setBounds(100,200,40,40);
        bt3 = new Button("3");
        bt3.setBounds(150,200,40,40);
        bt4 = new Button("4");
        bt4.setBounds(50,150,40,40);
        bt5 = new Button("5");
        bt5.setBounds(100,150,40,40);
        bt6 = new Button("6");
        bt6.setBounds(150,150,40,40);
        bt7 = new Button("7");
        bt7.setBounds(50,100,40,40);
        bt8 = new Button("8");
        bt8.setBounds(100,100,40,40);
        bt9 = new Button("9");
        bt9.setBounds(150,100,40,40);
        btadd = new Button("+");
        btadd.setBounds(200,200,40,40);
        btsub = new Button("-");
        btsub.setBounds(200,150,40,40);
        btmul = new Button("*");
        btmul.setBounds(200,100,40,40);
        btdiv = new Button("/");
        btdiv.setBounds(150,250,40,40);
        btequ = new Button("=");
        btequ.setBounds(200,250,40,40);
        btdot =  new Button(".");
        btdot.setBounds(100,250,40,40);
        btac = new Button("C");
        btac.setBounds(250,200,40,90);
        btremove = new Button("<");
        btremove.setBounds(250, 100, 40, 40);

        frame.add(display);
        frame.add(bt7);
        frame.add(bt8);
        frame.add(bt9);
        frame.add(btmul);
        frame.add(bt4);
        frame.add(bt5);
        frame.add(bt6);
        frame.add(btsub);
        frame.add(bt1);
        frame.add(bt2);
        frame.add(bt3);
        frame.add(btadd);
        frame.add(bt0);
        frame.add(btdot);
        frame.add(btdiv);
        frame.add(btequ);
        frame.add(btac);
        frame.add(btremove);

        bt1.addActionListener(_bt1);
        bt2.addActionListener(_bt2);
        bt3.addActionListener(_bt3);
        bt4.addActionListener(_bt4);
        bt5.addActionListener(_bt5);
        bt6.addActionListener(_bt6);
        bt7.addActionListener(_bt7);
        bt8.addActionListener(_bt8);
        bt9.addActionListener(_bt9);
        bt0.addActionListener(_bt0);
        btdot.addActionListener(_btdot);
        btadd.addActionListener(_btadd);
        btequ.addActionListener(_btequ);
        btsub.addActionListener(_btsub);
        btmul.addActionListener(_btmul);
        btdiv.addActionListener(_btdiv);
        btac.addActionListener(_btac);
        btremove.addActionListener(_btremove);

        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    ActionListener _bt1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(display.getText()+"1");
        }
    };

    ActionListener _bt2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(display.getText()+"2");
        }
    };

    ActionListener _bt3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(display.getText()+"3");
        }
    };

    ActionListener _bt4 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(display.getText()+"4");
        }
    };

    ActionListener _bt5 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(display.getText()+"5");
        }
    };

    ActionListener _bt6 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(display.getText()+"6");
        }
    };

    ActionListener _bt7 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(display.getText()+"7");
        }
    };

    ActionListener _bt8 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(display.getText()+"8");
        }
    };

    ActionListener _bt9 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(display.getText()+"9");
        }
    };

    ActionListener _bt0 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(display.getText()+"0");
        }
    };

    ActionListener _btdot = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(display.getText()+".");
        }
    };

    //the operation start from here
    float num1,num2;
    String a = "";
    ActionListener _btadd = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            num1 = Float.parseFloat(display.getText());
            a="+";
            display.setText("");
        }
    };

    ActionListener _btsub = new ActionListener() {                  
        @Override
        public void actionPerformed(ActionEvent e) {
            num1 = Float.parseFloat(display.getText());
            a="-";
            display.setText("");
        }
    };

    ActionListener _btmul = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            num1 = Float.parseFloat(display.getText());
            a="*";
            display.setText("");
        }
    };

    ActionListener _btdiv = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            num1 = Float.parseFloat(display.getText());
            a="/";
            display.setText("");
        }
    };

    ActionListener _btac =  new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            num1 = 0;
            num2 = 0;
            a="";
            display.setText("");

        }
    };

    ActionListener _btremove = new ActionListener() {               //not finished
        public void actionPerformed(ActionEvent e){

            display.setText(display.getText()+"\b\b");
        }
    };

    ActionListener _btequ = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (a == "+"){
                num2 = Float.parseFloat(display.getText());
                display.setText(String.valueOf(num1+num2));
            } else if (a =="-") {
                num2 = Float.parseFloat(display.getText());
                display.setText(String.valueOf(num1-num2));
            } else if (a == "*") {
                num2 = Float.parseFloat(display.getText());
                display.setText(String.valueOf(num1*num2));
            } else if (a == "/") {
                num2 = Float.parseFloat(display.getText());
                display.setText(String.valueOf(num1/num2));
            }
        }
    };

    public static void main(String[] args) {
        new Calculator();
    }
}