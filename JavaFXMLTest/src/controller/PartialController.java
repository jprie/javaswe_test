package controller;

import javafx.fxml.FXML;

public class PartialController {

	public PartialController() {
		System.out.println("PartialController constructed");
	}
	
	@FXML
	private void initialize() {
		System.out.println("PartialController: initialize() called");
	}
}
