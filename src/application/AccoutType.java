package application;

import java.io.IOException;

import javafx.event.ActionEvent;

public class AccoutType {
	
	public void Savings(ActionEvent event) throws IOException {
		Home.main.changeScene("Savings Account.fxml");
	}
	
	public void Current(ActionEvent event) throws IOException {
		Home.main.changeScene("Current Account.fxml");
	}
	
	public void Student(ActionEvent event) throws IOException {
		Home.main.changeScene("Student Account.fxml");
	}
	
	public void Home(ActionEvent event) throws IOException {
		Home.main.changeScene("Employee Menu.fxml");
	}
	
	public void Back(ActionEvent event) throws IOException {
		Home.main.changeScene("Employee Menu.fxml");
	}
}
