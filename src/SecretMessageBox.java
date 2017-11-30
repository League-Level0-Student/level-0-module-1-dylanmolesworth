//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.KeyboardAdapter;
import org.jointheleague.graphical.robot.Robot;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {
	
	public static void main(String[] args) {
		
		String pass = "1234";
		
		String awnswer = JOptionPane.showInputDialog("What is the password?");
		
		JOptionPane.showMessageDialog(null, "you can only see the secret message if you can guess the passcode.");
		
		if(awnswer.equals("1234")) {
			
			JOptionPane.showMessageDialog(null, "You cracked the code!"); 
			JOptionPane.showMessageDialog(null, "Here is your secret massage: Good Job!"); 
			JOptionPane.showMessageDialog(null, "Im also giving you a gift!"); 
			Robot gift = new Robot();
			gift.addKeyboardAdapter(new KeyboardAdapter());
			gift.setSpeed(25);
			gift.penDown();
			gift.setPenWidth(20);
			gift.setPenColor(90, 40, 70);
			
		}
		
		else{JOptionPane.showMessageDialog(null, "INTRUDER"); 
		
		}
		
	}

	// 0. Make a main method and put steps 1-5 inside it
	
	// 1. Set a password in a String variable
	
	// 2. Using a pop-up, ask the first person for a secret message and store it in a variable

	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
	//    if they can guess the passcode

	// 4. If their guess matches the password, show them the secret message

	// 5. If the password does not match, pop-up "INTRUDER!!"

}
