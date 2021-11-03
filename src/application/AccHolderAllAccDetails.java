package application;

import java.io.IOException;

import banking.BankAccount;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class AccHolderAllAccDetails {
	@FXML
	ListView<String> mylist;
	
	static String Nid;
	
	public static void SetNid(String nid) {
		Nid=nid;
	}

	public void Display() throws IOException {
		ObservableList<BankAccount> list = FXCollections.observableArrayList(Main.bank.findAccounts(Nid));
		for(int i=0; i<list.size(); i++) {
			mylist.getItems().addAll(list.get(i).toString());
		}
		
	}
	
	public void Home(ActionEvent event) throws IOException {
		Home.main.changeScene("AccountHolder Menu.fxml");
	}
	
	public void Back(ActionEvent event) throws IOException {
		Home.main.changeScene("AccountHolder Menu.fxml");
	}
}
