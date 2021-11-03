package application;

import java.io.IOException;
import banking.DataHandler;
import banking.InvalidAccountException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Deposit {
	
	@FXML
	TextField accNumtf;
	@FXML
	TextField amounttf;
	@FXML
	Label mylabel;
	
	public void deposit(ActionEvent event) throws IOException {
		String accNum = accNumtf.getText();
		double amount = Double.parseDouble(amounttf.getText());
		try {
			Main.bank.deposit(accNum, amount);
			DataHandler.saveData(Main.bank);
			mylabel.setText("Amount: "+amount+" to Account No: "+accNum+"\n\tDeposited Successfully!");
		} catch (InvalidAccountException e) {
			mylabel.setText("Invaild Account Number.!");
			e.printStackTrace();
		}
		
		//Home.main.changeScene("Employee Menu.fxml");
	}
	
	public void Home(ActionEvent event) throws IOException {
		Home.main.changeScene("Employee Menu.fxml");
	}
	
	public void Back(ActionEvent event) throws IOException {
		Home.main.changeScene("Employee Menu.fxml");
	}
}
