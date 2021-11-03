package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AccountHolderAccDetails {
	
	@FXML
	TextField accNumtf;
	
	public void Check(ActionEvent event) throws IOException {
		String accNum=accNumtf.getText();
		AccHoldAccDetailsList.setAccNum(accNum);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AccHoldAccDetails.fxml"));
		Parent root = loader.load();
		AccHoldAccDetailsList All = loader.getController();
		All.Display(event);
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void Home(ActionEvent event) throws IOException {
		Home.main.changeScene("AccountHolder Menu.fxml");
	}
	
	public void Back(ActionEvent event) throws IOException {
		Home.main.changeScene("AccountHolder Menu.fxml");
	}
}
