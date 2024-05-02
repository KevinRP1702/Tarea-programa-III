package mvc;

public class AuthModel {
	
	public AuthModel() {
		
	}

	public boolean login(String nombre, String contra) {
		
		if(nombre.equals("admin") && contra.equals("123") ) {
			return true;
		}
		return false;
	}
}
