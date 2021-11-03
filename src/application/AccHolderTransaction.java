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

public class AccHolderTransaction {
	
	@FXML
	TextField accNumtf;
	
	public void check(ActionEvent event) throws IOException {
		String accNum = accNumtf.getText();
		AccHoldTransactionDetails.setAccnum(accNum);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AccHoldTransactionDetails.fxml"));
		Parent root = loader.load();
		AccHoldTransactionDetails transactionsDetails = loader.getController();
		transactionsDetails.Display();
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
