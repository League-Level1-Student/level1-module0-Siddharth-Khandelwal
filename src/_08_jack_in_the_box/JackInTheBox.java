package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JackInTheBox(){
System.out.println("Button clicked");
frame.setVisible(true);
frame.add(button);
frame.pack();
button.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub

}

}