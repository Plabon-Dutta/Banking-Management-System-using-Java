package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AccountHolderMenu {
	
	public void AccountDetails(ActionEvent event) throws IOException {
		Home.main.changeScene("AccountHolderAccount Deatils.fxml");
	}
	
	public void TransactionDetails(ActionEvent event) throws IOException {
		Home.main.changeScene("AccHold Transaction.fxml");
	}
	
	public void AllAccountDetails(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AccHold AllAccDetails.fxml"));
		Parent root = loader.load();
		AccHolderAllAccDetails All = loader.getController();
		All.Display();
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void Exit(ActionEvent event) throws IOException {
		Home.main.changeScene("Sample.fxml");
	}
	
	public void Home(ActionEvent event) throws IOException {
		Home.main.changeScene("Sample.fxml");
	}
	
	public void Back(ActionEvent event) throws IOException {
		Home.main.changeScene("Sample.fxml");
	}
}
