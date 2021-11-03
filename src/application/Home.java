package application;


import java.io.IOException;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;

public class Home {
	
	public static Main main= new Main();
	
	public void Employee(ActionEvent event) throws IOException {
		main.changeScene("Employee Menu.fxml");
		
	}
	
	public void AccountHolder(ActionEvent event) throws IOException {
		main.changeScene("Account holder nid.fxml");
	}
	
	public void Exit(ActionEvent event) {
		JOptionPane.showMessageDialog(null,"Thanks For Banking With Us.");
		System.exit(0);
	}
}
