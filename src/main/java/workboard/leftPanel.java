package workboard;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.GridLayout;

public class leftPanel extends JPanel{
    public leftPanel(){
        setLayout(new BorderLayout());
        add(upPanel(),BorderLayout.NORTH);
        add(downPanel(),BorderLayout.CENTER);
    }

    public JPanel upPanel(){
        JPanel u = new JPanel();
        JLabel cl = new JLabel("PENDING");
        cl.setFont(new Font("Serif",Font.BOLD,18));
        cl.setForeground(Color.RED);
        u.add(cl);
        return(u);
    }

    public JPanel downPanel(){
        JPanel d = new JPanel();
        for(int i=0;i<8;i++){
            d.add(fundPanel());
        }

        //Formating the layout
        GridLayout lay = new GridLayout(4,2);
        lay.setHgap(25);
        lay.setVgap(15);
        d.setLayout(lay);
       
        return(d);
    }

    public JPanel fundPanel(){
        JPanel f = new JPanel();
        f.setBackground(new Color(250,250,8));
        f.setLayout(new BoxLayout(f,BoxLayout.Y_AXIS));

        JTextArea t = new JTextArea("");
        t.setBackground(new Color(250,250,8));
        t.setFont(new Font("TimesRoman",Font.ITALIC,20));
        t.setText("lol\n\nlol");
        
        
        JButton b = new JButton("+");
        Border emptyBorder = BorderFactory.createEmptyBorder();
        b.setBorder(emptyBorder);
        b.setFont(new Font("Helvetica",Font.BOLD,15));
        b.setBackground(Color.YELLOW);
        b.setHorizontalAlignment(JButton.RIGHT);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                savedPanel(f,t);
                b.setBackground(new Color(200,8,255));
            }
        });

        f.add(t);
        f.add(b);

        return(f);
    }

    public void savedPanel(JPanel s,JTextArea t){
        s.setBackground(new Color(200,8,255));
        t.setBackground(new Color(200,8,255));
    }
}
