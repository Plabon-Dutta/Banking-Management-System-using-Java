package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AccHolderNid {
	AccountHolderMenu menu = new AccountHolderMenu();
	
	@FXML
	TextField nidtf;
	@FXML
	Label mylabel;
	
	public void Submit(ActionEvent event) throws IOException {
		String Nid=nidtf.getText();
		AccHolderAllAccDetails.SetNid(Nid);
		AccHoldAccDetailsList.setnid(Nid);
		boolean ch= Main.bank.isValidAccountHolder(Nid);
		if(ch==true) {
			
			Home.main.changeScene("AccountHolder Menu.fxml");
		}
		else {
			mylabel.setText("Invaild Nid Number!");
		}
	}
	
	public void Home(ActionEvent event) throws IOException {
		Home.main.changeScene("Sample.fxml");
	}
	
	public void Back(ActionEvent event) throws IOException {
		Home.main.changeScene("Sample.fxml");
	}
}
