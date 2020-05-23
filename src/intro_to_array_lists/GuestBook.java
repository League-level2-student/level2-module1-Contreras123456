package intro_to_array_lists;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	 ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		
	
	}
 void setup() {
	 button.addActionListener(this);
		button2.addActionListener(this);
		frame.add(panel);
		panel.add(label);
		panel.add(button);
		panel.add(button2);
		button.setText("Add Name"); 
		button2.setText("View Names");
		frame.pack();
		frame.setVisible(true);
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			names.add(JOptionPane.showInputDialog("Enter a name")); 
			
		}
		else if (e.getSource()==button2) {
			String hello = "";
 for (int i = 1; i < names.size()+1; i++) {
	hello += "Guest #"+i+" "+names.get(i-1)+"\n";
 }
 System.out.println(hello);
	JOptionPane.showMessageDialog(null, "Here are the names added to the list: " +hello);
 
	}
}
}
