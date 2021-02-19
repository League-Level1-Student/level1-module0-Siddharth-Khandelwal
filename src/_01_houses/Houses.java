package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot nugget = new Robot();
	
	public void run() {
		nugget.moveTo(75, 500);
		drawHouse();
		for (int j = 0; j < 9; j++) {
			drawHouse();
			
		}
		}
	
	
	void drawHouse() {
		
		Random ran = new Random();
		int i = ran.nextInt(126);
		nugget.penDown();
		nugget.setRandomPenColor();
		nugget.setSpeed(10);
		nugget.hide();
		nugget.move(i+75);
		nugget.turn(90);
		nugget.move(50);
		nugget.turn(90);
		nugget.move(i+75);
		nugget.turn(-90);
		nugget.setPenColor(Color.GREEN);
		nugget.move(25);
		nugget.turn(-90);
	}
}
