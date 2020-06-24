package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String hmm = JOptionPane.showInputDialog("do you know how to code? (yes or no)");
		// 2. If they say "yes", tell them they will rule the world.
		if(hmm.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Together we shall use this power and RULE THE WORLD!\n SIDE BY SIDE PEOPLE WILL FALL TO THEIR KNEES IN OUR PRESANSE! \nAHAHAHAHAHAHAHAHAHAHAHAHA");	
		}else { 
			JOptionPane.showMessageDialog(null, "Ok old man");
		}	
		}

	}


