package workboard;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class centralPanel extends JPanel{
    public centralPanel(){
        setLayout(new BorderLayout());
        add(upPanel(),BorderLayout.NORTH);
        add(downPanel(),BorderLayout.CENTER);
    }

    public JPanel upPanel(){
        JPanel pn = new JPanel();
        pn.add(new JLabel("IN PROGRESS"));
        return(pn);
    }

    public JPanel downPanel(){
        JPanel down = new JPanel();
        return(down);
    }
}