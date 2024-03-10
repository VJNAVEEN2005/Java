import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Counter{

    TextField display;
    Counter(){
        Frame frame = new Frame("Counter");

        display = new TextField("        0");
        display.setBounds(150,100,70,30);

        Button btCount = new Button("Count");
        btCount.setBounds(100,150,70,30);

        Button btReset = new Button("Reset");
        btReset.setBounds(200,150,70,30);

        frame.add(btCount);
        frame.add(btReset);
        frame.add(display);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);

        btCount.addActionListener(inc);
        btReset.addActionListener(res);
    }
    int i=0;
    ActionListener inc = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            i++;
            display.setText("        "+String.valueOf(i));
            System.out.println("Counting: "+i);
        }
    };

    ActionListener res = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            i=0;
            display.setText("        "+String.valueOf(i));
            System.out.println("Reset: "+i);
        }
    };


    public static void main(String[] args) {
        Counter counter = new Counter();
    }
}
