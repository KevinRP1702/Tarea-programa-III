package models;
import java.sql.*;  

public class AuthModel {

	public void login(String usuario, String contra) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_dt_base24","freedb_kevin17r","hZ$Jd#KMTY5Kr@b");
				
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from Usuarios");  
				while(rs.next())
					
					if(usuario.equals(rs.getString(2)) && contra.equals(rs.getString(4))) {
						System.out.println("Bienvenido");
						break;
					}else {
						System.out.println("Verifique sus datos");
					}
 
				con.close();  
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
}
