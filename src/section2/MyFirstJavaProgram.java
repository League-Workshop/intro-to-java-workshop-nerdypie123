package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot bot = new Robot();
		
		bot.penDown();
		bot.setSpeed(99);
		
		for (int i = 0; i < 4; i++) {
		bot.move(200);
		bot.turn(90);
		}
		for (int i = 0; i < 4; i++) {
			bot.move(200);
			bot.turn(-90);
			}
	}
}
