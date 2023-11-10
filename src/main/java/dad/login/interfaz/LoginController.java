package dad.login.interfaz;

import dad.login.App;
import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

	private LoginModel model = new LoginModel();
	private LoginView view = new LoginView();
	
	public LoginController() {
		
		model.usuarioProperty().bind(view.getUsuarioText().textProperty());
		model.contraseñaProperty().bind(view.getContraseñaText().textProperty());
		model.LDAPProperty().bind(view.getLDAPCheck().selectedProperty());
		view.getAccederButton().setOnAction(this::OnAccederAction);
		view.getCancelarButton().setOnAction(this::OnCancelarAction);
		
	}
	
	private void OnCancelarAction(ActionEvent e) {
		
		App.getStage().close();
	}

	private void OnAccederAction(ActionEvent e) {
		
		boolean useLdap = model.isLDAP();
		
			AuthService auth = useLdap ? new LdapAuthService(): new FileAuthService();
			
			try {
				if(auth.login(model.getUsuario(), model.getContraseña())) {
					
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Iniciar sesion");
					alert.setHeaderText("Acceso permitido");
					alert.setContentText("Las credenciales de acceso son validas");
					alert.showAndWait();
					
					App.getStage().close();
				}else {
					
					Alert alertNo = new Alert(AlertType.ERROR);
					alertNo.setTitle("Iniciar sesion");
					alertNo.setHeaderText("Acceso Denegado");
					alertNo.setContentText("El usuario y/o la contraseña no son válidos");
					alertNo.showAndWait();
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
	}
	
	public LoginModel getModel() {
		return model;
	}

	public LoginView getView() {
		return view;
	}
	
}
