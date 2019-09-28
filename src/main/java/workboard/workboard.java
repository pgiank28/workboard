package workboard;

import javax.swing.JFrame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class workboard 
{
    public static void main( String[] args )
    {
        workboardFrame basicFrame = new workboardFrame();
        basicFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	SpringApplication.run(workboard.class, args);
    }
}
