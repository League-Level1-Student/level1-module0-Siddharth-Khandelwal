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

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int randomnumber = rand.nextInt(5);
		if (randomnumber == 0) {
			JOptionPane.showMessageDialog(null, "You will eat an apple!");
		} else if (randomnumber == 1) {
			JOptionPane.showMessageDialog(null, "You will eat a cake!");
		} else if (randomnumber == 2) {
			JOptionPane.showMessageDialog(null, "You will eat an orange!");
		} else if (randomnumber == 3) {
			JOptionPane.showMessageDialog(null, "You will eat a bowl of ice cream!");
		}
		else if (randomnumber == 4) {
			JOptionPane.showMessageDialog(null, "You will eat a bowl of grapes!");
		}
	}
}
