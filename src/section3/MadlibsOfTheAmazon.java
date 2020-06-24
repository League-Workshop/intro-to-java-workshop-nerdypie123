package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		String ready = JOptionPane.showInputDialog("Are you ready? (Yes or No");
		if(ready.equals("No")) {
		JOptionPane.showMessageDialog(null, "too bad");
		} else {
		
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String input1 = JOptionPane.showInputDialog("Type an adgective");
		// Get the user to enter a type of liquid
		String input2 = JOptionPane.showInputDialog("Type of liquid");
		// Get the u3er to enter a body part
		String input3 = JOptionPane.showInputDialog("Type a body part");
		// Get the user to enter a verb
		String input4 = JOptionPane.showInputDialog("Type a verb");
		// Get the user to enter a place
		String input5 = JOptionPane.showInputDialog("Type a place");
		 
		JOptionPane.showMessageDialog(null, "		 Piranhas are more " + input1 + " during the day, so cross the river at\n" + 
				"		 night. Piranhas are attracted to fresh " + input2 + " and will most\n" + 
				"		 likely take a bite out of your " + input3 + " if you " + input4 + ". Whatever\n" + 
				"		 you do, if you have an open wound, try to find another way to get\n" + 
				"		 back to the " + input5 + ". Good luck!");
		// Make a pop-up for the final story. You can use \n to go to the next line
		

		}}}

