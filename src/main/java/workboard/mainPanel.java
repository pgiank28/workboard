package workboard;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class mainPanel extends JPanel{
    private leftPanel lpanel;
    private centralPanel cpanel;
    private rightPanel rpanel; 

    public mainPanel(){
        lpanel = new leftPanel();
        cpanel = new centralPanel();
        rpanel = new rightPanel();

        add(lpanel);
        add(cpanel);
        add(rpanel);
        setLayout(new GridLayout(1,3));
    }
}