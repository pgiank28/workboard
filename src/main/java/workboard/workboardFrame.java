package workboard;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class workboardFrame extends JFrame{
    private JFrame f;

    public workboardFrame(){
        JPanel p = new mainPanel();
        add(p);

        setSize(2300,1900);
        show();
    }
}