package logingsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton restButton = new JButton("Rest");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("User ID");
	JLabel userPasswordLabel = new JLabel("Password");
	JLabel messageLabel = new JLabel("this is a test");
	
	
	HashMap<String,String> logininfo = new HashMap<String, String>();
	
	loginPage(HashMap<String,String> loginInfoOriginal) {
		logininfo = loginInfoOriginal;
		
		userIDLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50,150,75,25);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null, Font.ITALIC, 25));
		
		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);
		
		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		restButton.setBounds(225,200,100,25);
		restButton.setFocusable(false);
		restButton.addActionListener(this);
		
		
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(restButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == restButton) {
			userIDField.setText("");
			userPasswordField.setText("");
			
		}
		
		if(e.getSource() == loginButton) {
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login successful");
					frame.dispose();
					welcomePage WelcomePage = new welcomePage(userID);
				}
			} else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("wrong password");
			}
		} else {
			messageLabel.setForeground(Color.red);
			messageLabel.setText("username not found");
		}
	}
}
