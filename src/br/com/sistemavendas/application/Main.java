package br.com.sistemavendas.application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Stage stage2;
	
	
	public static Stage getStage2() {
		return stage2;
	}

	public static void setStage2(Stage stage2) {
		Main.stage2 = stage2;
	}

	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/br/com/sistemavendas/views/Login.fxml"));
			Scene scene = new Scene(root);
			stage.setTitle("LOGIN-VENDAS");
			stage.setScene(scene);
			setStage2(stage);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
