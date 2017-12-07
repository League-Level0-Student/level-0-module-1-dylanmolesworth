import javax.swing.JOptionPane;

public class Remarkable {
	
	public static void main(String[] args) {
	
		
		String name = JOptionPane.showInputDialog(null, "Please enter the name of one of our peers.");
		
		if(name.equals("Brandon")) {
			
			JOptionPane.showMessageDialog(null, "Something remarkable about Brandon is that he can play tennis!");
			
			
		}
		
	
		if(name.equals("Jeremy")) {
			
			JOptionPane.showMessageDialog(null, "Something remarkable about Jeremy is that he can play basketball");
			
			
		}
		
		
		if(name.equals("Victoria")) {
			
			JOptionPane.showMessageDialog(null, "Something remarkable about Victoria is that she breathes");
			
		}
		
		
		if(name.equals("Lily")) {
	
			JOptionPane.showMessageDialog(null, "Something remarkable about Lily is she is the mother of Ralph");
	
		}

		
		if(name.equals("Caitlyn")) {
	
			JOptionPane.showMessageDialog(null, "Something remarkable about Caitlyn is that she's a cat... sometimes");
	
		}

		
	}

}
