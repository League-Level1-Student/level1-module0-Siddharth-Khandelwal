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
		nugget.setPenColor(Color.green);
		nugget.setSpeed(10);
		nugget.moveTo(0, 500);
		nugget.turn(90);
		nugget.move(75);
		nugget.turn(-90);
		drawHouse();
		for (int j = 0; j < 9; j++) {
			drawHouse();
		
		}
		
		
		nugget.setPenColor(Color.green);
		nugget.turn(90);
		nugget.move(100);
		int j = 600;
		nugget.setPenWidth(5);
		nugget.setPenColor(Color.blue);
		for (int i = 0; i < 5; i++) {
			j-=5;
			nugget.moveTo(0, j);
			nugget.move(1000);
		}
		
		for (int i = 0; i < 15; i++) {
			j-=5;
			nugget.moveTo(0, j);
			nugget.setPenColor(Color.green);
			nugget.move(100);
			nugget.setPenColor(Color.blue);
			nugget.move(600);
			nugget.setPenColor(Color.green);
			nugget.move(200);
		}
	}
	void drawPointyRoof() {
		nugget.turn(45);
		nugget.move(40);
		nugget.turn(90);
		nugget.move(40);
		nugget.turn(45);
	}
	void drawFlatRoof() {
	nugget.turn(90);
		nugget.move(50);
		nugget.turn(90);
	}
	void drawHouse() {
		Random ran = new Random();
		int i = ran.nextInt(126);
		nugget.penDown();
		nugget.setRandomPenColor();
		nugget.setSpeed(10);
		nugget.hide();
		nugget.move(i+75);
		if(i+75>130) {
			drawFlatRoof();
		}
		else {
		drawPointyRoof();	
		}
		nugget.move(i+75);
		nugget.turn(-90);
		nugget.setPenColor(Color.green);
		nugget.move(25);
		nugget.turn(-90);
	}
}
