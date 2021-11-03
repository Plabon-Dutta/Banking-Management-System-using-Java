package application;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Menu {
	
	public void AddAccount(ActionEvent event) throws IOException {
		Home.main.changeScene("Account type set.fxml");
	}
		
	public void Deposit(ActionEvent event) throws IOException {
		Home.main.changeScene("Deposit.fxml");
	}
		
	public void Withdraw(ActionEvent event) throws IOException {
		Home.main.changeScene("Withdraw.fxml");
	}
		
	public void Transfer(ActionEvent event) throws IOException {
		Home.main.changeScene("Transfer.fxml");
	}
		
	public void AccountDetails(ActionEvent event) throws IOException {
		Home.main.changeScene("Account Details.fxml");
	}
		
	public void TransactionDetails(ActionEvent event) throws IOException {
		Home.main.changeScene("Transaction.fxml");
	}
		
	public void AllAccountDetails(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("AllAccDetails.fxml"));
		Parent root = loader.load();
		AllAccDetails All = loader.getController();
		All.Display();
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
		
	public void TypeAccounts(ActionEvent event) throws IOException {
		Home.main.changeScene("SelectType.fxml");
	}
		
	public void Home(ActionEvent event) throws IOException {
		Home.main.changeScene("Sample.fxml");
	}
		
	public void Back(ActionEvent event) throws IOException {
		Home.main.changeScene("Sample.fxml");
	}
}
