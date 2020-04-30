package controller;

import javafx.fxml.FXML;

public class MainController {
	
	@FXML
	private PartialController partialController;

	public MainController() {
		
		System.out.println("Main Controller constructed");
	}
	
	@FXML
	public void initialize() {
		assert partialController != null;
		System.out.println("MainController initialize() called");
	}
}
