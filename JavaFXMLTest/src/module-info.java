module fxmltest {
	exports application;

	opens controller to javafx.fxml;
	
	requires javafx.base;
	requires transitive javafx.fxml;
	requires javafx.graphics;
	requires javafx.controls;
}