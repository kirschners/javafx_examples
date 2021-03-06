package example.javafx.basics;

import javafx.event.ActionEvent;

import javafx.application.*;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

	Button btn_demoButton;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("My Dashboard");
		
		btn_demoButton = new Button();
		btn_demoButton.setText("Click this demo Button");
		
		//Anonymous inner function
		/*btn_demoButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent pEvent){
				System.out.println("I'm an anonymous inner class");
			}
		});*/
		
		//Alternative Lambda call (since Java 8)
		btn_demoButton.setOnAction(e -> System.out.println("This is a lambda method"));
		
		//Multi-line lambda:
		btn_demoButton.setOnAction(e -> {
			System.out.println("This is a lambda method");
			System.out.println("I like grapes :)");
		});
		
		
		
		// Required
		StackPane layout = new StackPane();				//Creates new layout
		layout.getChildren().add(btn_demoButton);		//Adds Button to layout
		Scene mainScene = new Scene(layout, 900, 500);	//Creates Scene with layout and size
		primaryStage.setScene(mainScene);				//Adds Scene to Stage
		primaryStage.show();							//Shows everything
	}

}
