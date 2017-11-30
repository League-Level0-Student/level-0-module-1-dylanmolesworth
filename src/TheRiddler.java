import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		
		int score = 0;
		
		String riddle = JOptionPane.showInputDialog(null, "Who makes it, has no need of it. " + 
				"Who buys it, has no use for it. " + 
				"Who uses it can neither see nor feel it. " + 
				"What is it?");
	
		if(riddle.equals("a coffin")) {
			
			JOptionPane.showMessageDialog(null, "Correct!");
			
			score = score + 5;
			
		}
		
		else{JOptionPane.showMessageDialog(null, "wrong the awnswer is a coffin");
		
		score = score - 1;
		
		}

		
		
		JOptionPane.showMessageDialog(null, "You have "+ score + " points");
		
		
		
		String riddle2 = JOptionPane.showInputDialog(null, "What can travel around the world while staying in a corner?");

		if(riddle2.equals("a stamp")) {
			
			JOptionPane.showMessageDialog(null, "Correct!");
			
			score = score + 5;
			
		}
		
		else{JOptionPane.showMessageDialog(null, "wrong the awnswer is a stamp");
		
		score = score - 1;
		
		}
		
		JOptionPane.showMessageDialog(null, "You have "+ score + " points");
		
	}
}

