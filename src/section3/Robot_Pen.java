package section3;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Robot_Pen {
	public static void main(String[] args) {
		
		Robot bob = new Robot();
		String draw = JOptionPane.showInputDialog("What should the robot draw? The choices are a \ntriangle, square, and pentagon.");
		bob.setRandomPenColor();
		bob.penDown();
		bob.setPenWidth(5);
		bob.setSpeed(100);
		if(draw.equalsIgnoreCase("triangle")) {
			bob.move(200);
			bob.turn(120);
			bob.move(200);
			bob.turn(120);
			bob.move(200);
			bob.turn(120);
		}
		if(draw.equalsIgnoreCase("square")) {
			bob.move(200);
			bob.turn(90);
			bob.move(200);
			bob.turn(90);
			bob.move(200);
			bob.turn(90);
			bob.move(200);
			bob.turn(90);
		}
		if(draw.equalsIgnoreCase("pentagon")) {
			bob.move(200);
			bob.turn(72);
			bob.move(200);
			bob.turn(72);
			bob.move(200);
			bob.turn(72);
			bob.move(200);
			bob.turn(72);
			bob.move(200);
			bob.turn(72);
			
		}
		}
	}

