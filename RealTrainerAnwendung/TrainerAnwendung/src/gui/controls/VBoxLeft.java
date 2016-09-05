package gui.controls;

import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import static util.ScreenSize.APPLICATION_WIDTH;

public class VBoxLeft extends ScrollPane {

	public VBoxLeft() {

		setBoundaries();
		initializeComponents();
	}

	private void setBoundaries() {
		setStyle("-fx-background-color: transparent; -fx-border-style: solid; -fx-border-width: 2px; -fx-border-color: gray;");
		setPadding(new Insets(50, 0, 20, 20));
	}
	private void initializeComponents() {
		setContent(cachedVBox());

	}

	private VBox cachedVBox() {
		VBox vbox = new VBox();
		vbox.setPrefWidth(1200 * 0.34);
		
		for (int i=0; i<88; i++) {
			
			vbox.getChildren().add(new Text("test"));
			
		}
		
		
		return vbox;
	}
}
