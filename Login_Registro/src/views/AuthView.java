package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import controlers.Auth;
import models.AuthModel;

public class AuthView {

	private JFrame frame;
	private Auth controller;
	private AuthModel auth;
	
	public AuthView() {
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(0, 0, 504, 768);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		auth = new AuthModel();
	}
	
	public void login() {
		//Diseño del login
		JPanel panel = new JPanel();
		
	    panel.setBackground(new Color(105, 105, 105));
	    panel.setBounds(0, 29, 488, 700);
	    panel.setLayout(null);

	    JLabel lblTitulo = new JLabel("Iniciar sesión");
	    lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 25));
	    lblTitulo.setForeground(new Color(255, 255, 255));
	    lblTitulo.setBounds(163, 120, 180, 38);
	    panel.add(lblTitulo);

	    JLabel lblNombreUsu = new JLabel("Ingrese el nombre de usuario");
	    lblNombreUsu.setFont(new Font("Tahoma", Font.BOLD, 13));
	    lblNombreUsu.setOpaque(true);
	    lblNombreUsu.setBackground(new Color(0, 0, 0));
	    lblNombreUsu.setForeground(new Color(255, 255, 255));
	    lblNombreUsu.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNombreUsu.setBounds(104, 192, 282, 28);
	    panel.add(lblNombreUsu);

	    JTextField txtNombreUsu = new JTextField();
	    txtNombreUsu.setBounds(104, 218, 282, 46);
	    panel.add(txtNombreUsu);
	    txtNombreUsu.setColumns(10);

	    JLabel lblContra2 = new JLabel("Ingrese su contraseña");
	    lblContra2.setOpaque(true);
	    lblContra2.setHorizontalAlignment(SwingConstants.CENTER);
	    lblContra2.setForeground(Color.WHITE);
	    lblContra2.setFont(new Font("Tahoma", Font.BOLD, 13));
	    lblContra2.setBackground(Color.BLACK);
	    lblContra2.setBounds(104, 291, 282, 28);
	    panel.add(lblContra2);

	    JTextField txtContra2 = new JTextField();
	    txtContra2.setColumns(10);
	    txtContra2.setBounds(104, 317, 282, 46);
	    panel.add(txtContra2);

	    JButton btnLogin = new JButton("Login");
	    btnLogin.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	if(txtNombreUsu.getText().isEmpty() || txtContra2.getText().isEmpty()) {
	        		JOptionPane.showMessageDialog(null, "Hace falta llenar algún campo", "Error",JOptionPane.ERROR_MESSAGE);
	        	}else {
	        		auth.login(txtNombreUsu.getText(), txtContra2.getText());
	        	}
	        }
	    });
	    btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
	    btnLogin.setBounds(139, 408, 191, 38);
	    panel.add(btnLogin);

	    JButton bntSinCuenta = new JButton("¿No tiene cuenta?");
	    bntSinCuenta.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	controller = new Auth();
	        	frame.removeAll();
	        	frame.setVisible(false);
	        	controller.registro();
	        }
	    });
	    bntSinCuenta.setFont(new Font("Tahoma", Font.BOLD, 13));
	    bntSinCuenta.setBounds(139, 457, 192, 23);
	    panel.add(bntSinCuenta);

	    JButton btnNewButton = new JButton("¿Olvidó su contraseña?");
	    btnNewButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {

	        }
	    });
	    btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
	    btnNewButton.setBounds(139, 491, 193, 23);
	    panel.add(btnNewButton);

	    JButton btnMostrar = new JButton("Mostrar info JSON");
	    btnMostrar.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnMostrar.setBounds(139, 542, 191, 23);
	    panel.add(btnMostrar);
	    
	    frame.add(panel);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
	
	public void registro() {
		JPanel panel = new JPanel();
		
		    
		 panel.setBackground(new Color(75, 0, 130));
		 panel.setBounds(0, 29, 488, 700);
		 frame.getContentPane().add(panel);
		 panel.setLayout(null);
		    
		JLabel lblTitulo = new JLabel("Registrarse");
		lblTitulo.setForeground(new Color(222, 184, 135));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(153, 79, 183, 43);
		panel.add(lblTitulo);
		
		JTextField txtNombre = new JTextField();
		txtNombre.setBounds(58, 185, 157, 43);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Ingresa tu nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setForeground(new Color(240, 248, 255));
		lblNombre.setBounds(58, 162, 138, 22);
		panel.add(lblNombre);
		
		JTextField txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(257, 185, 157, 43);
		panel.add(txtApellido);
		
		JLabel lblApellido = new JLabel("Ingresa tu apellido");
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setForeground(new Color(240, 248, 255));
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellido.setBounds(276, 162, 138, 22);
		panel.add(lblApellido);
		
		JLabel lblCorreo = new JLabel("Correo electrónico");
		lblCorreo.setForeground(new Color(240, 248, 255));
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCorreo.setBounds(104, 257, 132, 14);
		panel.add(lblCorreo);
		
		JTextField txtCorreo = new JTextField();
		txtCorreo.setBounds(104, 281, 267, 43);
		panel.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblContra = new JLabel("Contraseña");
		lblContra.setForeground(new Color(240, 248, 255));
		lblContra.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContra.setBounds(104, 340, 132, 14);
		panel.add(lblContra);
		
		JTextField txtContra = new JTextField();
		txtContra.setColumns(10);
		txtContra.setBounds(104, 361, 267, 43);
		panel.add(txtContra);
		
		JLabel lblConfirmarContra = new JLabel("Confirmas contraseña");
		lblConfirmarContra.setForeground(new Color(240, 248, 255));
		lblConfirmarContra.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblConfirmarContra.setBounds(104, 414, 148, 14);
		panel.add(lblConfirmarContra);
		
		JTextField txtConfimarContra = new JTextField();
		txtConfimarContra.setColumns(10);
		txtConfimarContra.setBounds(104, 439, 267, 43);
		panel.add(txtConfimarContra);
		
		JCheckBox checkTerminos = new JCheckBox("Acepto los términos y condiciones vendo mi alma al diablo");
		checkTerminos.setFont(new Font("Tahoma", Font.BOLD, 13));
		checkTerminos.setForeground(new Color(240, 248, 255));
		checkTerminos.setContentAreaFilled(false);
		checkTerminos.setBounds(51, 537, 406, 23);
		panel.add(checkTerminos);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtCorreo.getText().isEmpty() || txtCorreo.getText().isEmpty() || txtApellido.getText().isEmpty() || txtContra.getText().isEmpty() || txtConfimarContra.getText().isEmpty() || checkTerminos.isSelected() == false) {
					JOptionPane.showMessageDialog(null, "Hace falta llenar algún campo", "Error",JOptionPane.ERROR_MESSAGE);
				} if(txtCorreo.getText().isEmpty() == false && txtCorreo.getText().isEmpty() == false && txtApellido.getText().isEmpty() == false && txtContra.getText().isEmpty() == false && (txtContra.getText().equals(txtConfimarContra.getText()) ) && txtConfimarContra.getText().isEmpty()== false && checkTerminos.isSelected()) {
					JOptionPane.showMessageDialog(null, "Se ha registrado con éxito", "Bien",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnRegistrarse.setBackground(new Color(218, 165, 32));
		btnRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegistrarse.setBounds(185, 604, 133, 38);
		panel.add(btnRegistrarse);
		
		JButton btnYaCuenta = new JButton("¿Ya tiene cuenta?");
		btnYaCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller = new Auth();
	        	frame.removeAll();
	        	frame.setVisible(false);
	        	controller.login();
			}
		});
		
		btnYaCuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnYaCuenta.setBounds(171, 653, 157, 23);
		panel.add(btnYaCuenta);
		
		frame.add(panel);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
}
