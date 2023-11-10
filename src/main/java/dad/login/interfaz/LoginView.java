package dad.login.interfaz;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginView extends VBox {

	private TextField usuarioText;
	private PasswordField contraseñaText;
	private CheckBox LDAPCheck;
	private Button accederButton;
	private Button cancelarButton;
	
	public LoginView() {
		super();
		
		usuarioText = new TextField();
		usuarioText.setPromptText("Nombre de usuario");
		contraseñaText = new PasswordField();
		contraseñaText.setPromptText("Contraseña del usuario");
		
		GridPane pane = new GridPane();
		pane.setVgap(5);
		pane.setHgap(5);
		pane.setPadding(new Insets(5));
		pane.addRow(0, new Label("Usuario:"), usuarioText);
		pane.addRow(1, new Label("Contraseña:"), contraseñaText);
		
		
		LDAPCheck = new CheckBox("Usar LDAP");
		
		accederButton = new Button("Acceder");
		accederButton.setDefaultButton(true);
		cancelarButton = new Button("Cancelar");
		
		HBox botonesBox = new HBox(5, accederButton, cancelarButton);
		
		setSpacing(5);
		setFillWidth(false);
		setAlignment(Pos.CENTER);
		getChildren().addAll(pane, LDAPCheck, botonesBox);
		
	}

	public TextField getUsuarioText() {
		return usuarioText;
	}

	public PasswordField getContraseñaText() {
		return contraseñaText;
	}

	public CheckBox getLDAPCheck() {
		return LDAPCheck;
	}

	public Button getAccederButton() {
		return accederButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}
	
}
