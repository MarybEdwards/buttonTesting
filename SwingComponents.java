package buttonTesting;
import java.awt.*;
import javax.swing.*;


public class SwingComponents { 
 	
	
	public static void createScreen(){
		JFrame thisWindow = new JFrame("Trial");	
		thisWindow.setVisible(true);
		JButton newButtonCreation = new JButton ("Click This");
		thisWindow.add(newButtonCreation);
	}
	
}
