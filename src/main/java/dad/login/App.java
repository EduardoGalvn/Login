package dad.login;

import dad.login.interfaz.LoginController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private static Stage stage;
	private LoginController loginController = new LoginController();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		stage = primaryStage;
		
		Scene modificarScene = new Scene(loginController.getView(), 320, 200);
		
		primaryStage.setScene(modificarScene);
		primaryStage.setTitle("Login");
		primaryStage.show();
		
	}

	public static Stage getStage() {
		return stage;
	}

}
