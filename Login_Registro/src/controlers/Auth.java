package controlers;

import views.AuthView;

public class Auth {

	public AuthView vista;
	
	public Auth() {
		
		vista = new AuthView();
		
	}
	
	public void login() {
		
		vista.login();
		
	}
	
	public void registro() {
		
		vista.registro();
		
	}
}
