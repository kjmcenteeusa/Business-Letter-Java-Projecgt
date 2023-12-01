// Ch 7 Example (page 345)

import javax.swing.*;


public class BusinessLetter
{

public static void main(String[] args)
{
	// Variables and constants
	String fullName;
	String firstName = "";
	String familyName = "";

	// Input phase
	fullName = JOptionPane.showInputDialog(null, "Please enter the customer's full name: ");

	// Processing phase
	int x = 0;

	while(x < fullName.length())
	{
		if(fullName.charAt(x) == ' ')
		{
			firstName = fullName.substring(0, x);
			familyName = fullName.substring(x + 1, fullName.length());
			x = fullName.length();


		} // End of IF statement.

		++x; // Adjust loop variable
	
	} // End of WHILE loop.

	// Output phase
	JOptionPane.showMessageDialog(null, 
		"Dear " + firstName + ", \nI am so glad we are on a first name basis" +
		"\nbecause I would like the opportunity to" +
		"\ntalk to you about an affordable insurance" +
		"\nprotection plan for the entire " + familyName +
		"\nfamily. Call a One Family Insurance today");



	
   }	

}