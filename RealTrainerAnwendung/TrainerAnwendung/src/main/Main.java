package main;

import gui.controls.TrainerBorderPane;
import insidefx.undecorator.Undecorator;
import insidefx.undecorator.UndecoratorScene;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

	Stage primaryStage;

	public static void main(String... args) {

		launch(args);
	}

	@Override
	public void start(final Stage stage) throws Exception {

		TrainerBorderPane root = new TrainerBorderPane();
		root.setStyle("fx-background-color: white;");
		root.setMinWidth(1200);
		root.setMinHeight(800);

		Undecorator undecorator = new Undecorator(stage, root);
		Scene scene = new Scene(undecorator);
		scene.setFill(Color.TRANSPARENT);
		scene.getStylesheets().add("skin/undecorator.css");
		scene.getStylesheets().add("resources/css/style.css");
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.setMinWidth(800);
		stage.setMinHeight(600);

		stage.setTitle("Trainer Anwendung");
		try {
			stage.getIcons().add(new Image("resources/Images/icon.png"));
		} catch (Exception e) {

			Alert alert = new Alert(AlertType.WARNING);
			alert.setContentText("Could not find 'icon.png'. Make sure it is included into Images foulder!");

		}

		stage.setScene(scene);
		stage.show();

	}
}