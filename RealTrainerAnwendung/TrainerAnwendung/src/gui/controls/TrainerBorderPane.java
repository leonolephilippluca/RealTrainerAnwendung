package gui.controls;

import com.sun.prism.paint.Color;

import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;

public class TrainerBorderPane extends BorderPane {

	public TrainerBorderPane() {
		setBoundaries();
		initializeComponents();
	}
	
	private void setBoundaries() {

		setStyle("-fx-background-color: white;");
	
	}
	
	private void initializeComponents() {
//			
			setLeft(new VBoxLeft());
//			setCenter(new NewTrainerGrid());
						
		
	}
}
