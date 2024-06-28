package Log_In_Page;

import java.net.URL;
import java.nio.file.Paths;

import common.StageHolder;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Log_in_Screen extends Application  { 
	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage stageCreatedByJavafx) throws Exception {
		
		StageHolder.stage=stageCreatedByJavafx;
		
		URL fxmlurl = Paths
				.get("F:\\Log_In_Page\\src\\Log_In_Page\\LogInPage.fxml") 
				.toUri().toURL();

		Parent actorGroup = FXMLLoader.load(fxmlurl);

		((Stage) StageHolder.stage).setTitle("E-Commerce Login");

		Scene scene = new Scene(actorGroup, 600, 400);

		((Stage) StageHolder.stage).setScene(scene);
		((Stage) StageHolder.stage).show();

	}

}


