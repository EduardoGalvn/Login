package dad.login.interfaz;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginModel {

	private StringProperty usuario = new SimpleStringProperty();
	private StringProperty contraseña = new SimpleStringProperty();
	private BooleanProperty LDAP = new SimpleBooleanProperty();
	
	
	public final StringProperty usuarioProperty() {
		return this.usuario;
	}
	
	public final String getUsuario() {
		return this.usuarioProperty().get();
	}
	
	public final void setUsuario(final String usuario) {
		this.usuarioProperty().set(usuario);
	}
	
	public final StringProperty contraseñaProperty() {
		return this.contraseña;
	}
	
	public final String getContraseña() {
		return this.contraseñaProperty().get();
	}
	
	public final void setContraseña(final String contraseña) {
		this.contraseñaProperty().set(contraseña);
	}
	
	public final BooleanProperty LDAPProperty() {
		return this.LDAP;
	}
	
	public final boolean isLDAP() {
		return this.LDAPProperty().get();
	}
	
	public final void setLDAP(final boolean LDAP) {
		this.LDAPProperty().set(LDAP);
	}
	
	
	
	
}
