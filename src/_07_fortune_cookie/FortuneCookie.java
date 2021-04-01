package _07_fortune_cookie;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	
        public void showButton() {
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JButton button = new JButton();
        	System.out.println("Button clicked");
       frame.setVisible(true);
       frame.add(button);
       frame.pack();
       button.addActionListener(this);
       Random rand = new Random();
    		   rand.nextInt(5);
        }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "WooHoo");
		}
    }
      
   

