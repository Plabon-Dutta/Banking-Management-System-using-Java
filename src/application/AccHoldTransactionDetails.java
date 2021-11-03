package application;

import java.io.IOException;

import banking.InvalidAccountException;
import banking.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class AccHoldTransactionDetails {
	
	static String AccNum;
	@FXML
	ListView<String> mylist;
	
	public static void setAccnum(String Accnum) {
		AccNum= Accnum;
	}
	
	public void Display() throws IOException {
//		Main.bank = DataHandler.readData();
//		ObservableList<Transaction> list;
		try {
			ObservableList<Transaction> list = FXCollections.observableArrayList(Main.bank.getAccTransactions(AccNum));
			for(int i=0; i<list.size(); i++) {
				mylist.getItems().addAll(list.get(i).toString());
			}
		} catch (InvalidAccountException e) {
			mylist.getItems().add("Transaction Details Not Found!");
			e.printStackTrace();
		}
		
	}
	
	public void Home(ActionEvent event) throws IOException {
		Home.main.changeScene("AccountHolder Menu.fxml");
	}
	
	public void Back(ActionEvent event) throws IOException {
		Home.main.changeScene("AccHold Transaction.fxml");
	}
	
}
