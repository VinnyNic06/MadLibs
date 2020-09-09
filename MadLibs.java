// Page 88

import javax.swing.JOptionPane;

public class MadLibs
{
	public static void main(String[] args)
	{
		//Variables and constants
		//Input phase
		String noun1 = JOptionPane.showInputDialog(null, "Please enter a noun:");
		String noun2 = JOptionPane.showInputDialog(null, "Please enter another noun:");
		String adj = JOptionPane.showInputDialog(null, "Please enter a adjective:");
		String verb = JOptionPane.showInputDialog(null, "Please enter a verb in the past tense:");

		// Output phase
		JOptionPane.showMessageDialog(null, "Marry had a little" + noun1 + "\nIts's " + noun2 + " was " + adj + " as snow" + "\nAnd everywhere that Mary " + verb + "\nThe " + noun1 + " was sure to go.");
	}
}