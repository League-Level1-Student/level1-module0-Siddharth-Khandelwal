package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot nugget = new Robot();
	
		
	
	public void run() {
		nugget.setWindowColor(Color.black);
		nugget.hide();
		nugget.setSpeed(100000000);
		nugget.penDown();
		nugget.setPenColor(Color.GREEN);
		nugget.setSpeed(10);
		nugget.moveTo(0, 500);
		nugget.turn(90);
		nugget.move(75);
		nugget.turn(-90);
		drawHouse();
		for (int j = 0; j < 9; j++) {
			drawHouse();
			
		}
		nugget.setPenColor(Color.GREEN);
		nugget.turn(90);
		nugget.move(100);
		int j = 600;
		nugget.setPenWidth(5);
		for (int i = 0; i < 20; i++) {
			j-=5;
			nugget.setPenColor(Color.GREEN);
			nugget.moveTo(0, j);
			nugget.move(1000);
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
