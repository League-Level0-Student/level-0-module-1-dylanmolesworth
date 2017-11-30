import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class UnBirthday {
	
	public static void main(String[] args) {
		
		String birth = JOptionPane.showInputDialog(null, "When is your birthday?");
		
		if(birth.equals("11/29")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday! :)");			
			JOptionPane.showMessageDialog(null, "Here is your gift!");
			Robot mo = new Robot();
		}
		else{JOptionPane.showMessageDialog(null, "Happy Un-Birthday! :)"); 
		
		}
			
		
		
	}

}
