package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {

			System.out.println("Stage created");
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/fxml/Main.fxml"));
			
			System.out.println("Loading FXML");
			AnchorPane root = loader.load();
			System.out.println("Root: scene=" + root.getScene());
			
			Scene scene = new Scene(root,400,400);
			System.out.println("Scene created");
			System.out.println("Root: scene=" + root.getScene());
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			System.out.println("Stage shown");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
