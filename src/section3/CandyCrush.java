package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String crush = JOptionPane.showInputDialog("Who is your greatest rival in life \nand will always challenge you \n to the max of your abillities.");
		String friend = JOptionPane.showInputDialog("Who is your best friend who will pull through thick and thin,\n a person who you feel connected to because they always have your back,\n a person you can trust with your life.");
				// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		// 3. Ask the user for the name of their best friend
JOptionPane.showMessageDialog(null, "Too bad " + crush + " and " + friend + " chose me to be their rival and friend\n because I am as sweet as candy. get crushed");
		// 4. Tell them their best friend is as sweet as candy

	} 
}



