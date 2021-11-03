package application;
	
import java.io.IOException;

import javax.swing.JOptionPane;

import banking.Bank;
import banking.DataHandler;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	public static Bank bank = new Bank("UAP STUDENT BANK");
	
	public static Stage stg;
	@Override
	public void start(Stage primaryStage) {
		stg = primaryStage;
		primaryStage.setResizable(false);
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("UAP STUDENT BANK");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }
	
	public static void main(String[] args) throws IOException {
		try {
			bank = DataHandler.readData();
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null,"Data Read Failed!");
			e.printStackTrace();
		}
		launch(args);
	}
}
