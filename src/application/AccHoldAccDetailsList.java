package application;

import java.io.IOException;

import banking.BankAccount;
import banking.InvalidAccountException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.ListView;


public class AccHoldAccDetailsList {
	
	static String AccNum, Nid;
	@FXML
	ListView<String> mylist;
	
	public static void setAccNum(String accnum) {
		AccNum = accnum;
	}
	
	public static void setnid(String nid) {
		Nid = nid;
	}

	public void Display(ActionEvent event) {
		try {
			ObservableList<BankAccount> list = FXCollections.observableArrayList(Main.bank.findAccount(Nid, AccNum));
			for(int i=0; i<list.size(); i++) {
				mylist.getItems().addAll(list.get(i).toString());
			}
		} catch (InvalidAccountException e) {
			mylist.getItems().add("Invaild Account Number or Nid and Account No details not matched!");
			e.printStackTrace();
		}
	}

	public void Home(ActionEvent event) throws IOException {
		Home.main.changeScene("AccountHolderMenu.fxml");
	}
	
	public void Back(ActionEvent event) throws IOException {
		Home.main.changeScene("AccountHolderAccount Deatils.fxml");
	}

}
