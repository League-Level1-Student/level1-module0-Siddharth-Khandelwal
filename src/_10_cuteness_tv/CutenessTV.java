package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton button = new JButton("Panda Video");
		JButton button1 = new JButton("Tiny Animals");
		public void showButton() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		System.out.println("Button clicked");
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		frame.pack();
		button.addActionListener(this);
button1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource()==button) {
			
		JOptionPane.showMessageDialog(null, "PANDA, Panda Panda Panda Panda");
		}
		else if{
			JOptionPane.showMessageDialog(null, "Baby Animals");
		}
		else {
			JOptionPane.showMessageDialog(null, "");
		}
}
}