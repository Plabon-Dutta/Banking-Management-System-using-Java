package application;

import java.io.IOException;
import banking.BankAccount;
import banking.InvalidAccountException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class inaccDetails {
	
	@FXML
	ListView<String> mylist;
	static String AccNum;
	
	public static void setAccnum(String num) {
		AccNum = num;
	}
	
	public void Display() {
		//Main.bank = DataHandler.readData();
		try {
			ObservableList<BankAccount> list1 = FXCollections.observableArrayList(Main.bank.findAccount(AccNum));
			for(int i=0; i<list1.size(); i++) {
				mylist.getItems().addAll(list1.get(i).toString());
			}
		} catch(InvalidAccountException e) {
			mylist.getItems().add("Account not found!");
			e.printStackTrace();
		}
	}
	
	public void Home(ActionEvent event) throws IOException {
		Home.main.changeScene("Employee Menu.fxml");
	}
	
	public void Back(ActionEvent event) throws IOException {
		Home.main.changeScene("Account Details.fxml");
	}
}
