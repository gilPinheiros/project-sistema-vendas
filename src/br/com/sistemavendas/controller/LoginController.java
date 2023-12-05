package br.com.sistemavendas.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable{

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private Button btnEntrar;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
    @FXML
    public void logar() {
    	if(txtLogin.getText().equalsIgnoreCase("Admin") && txtSenha.getText().equals("Admin")) {
    		System.out.println("Usuario logado");
    	}else {
    		System.out.println("Erro ao logar no app");
    	}
    }

}
