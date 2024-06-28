package Home_Screen;

import java.net.URL;
import java.nio.file.Paths;

import common.StageHolder;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Home_Screen { 

		public static void show() throws Exception {
			URL fxmlurl = Paths
					.get("F:\\Log_In_Page\\src\\Home_Screen\\HomeScreen.fxml")
					.toUri().toURL();

			Parent actorGroup = FXMLLoader.load(fxmlurl);

			StageHolder.stage.setTitle("Home Screen");

			Scene scene = new Scene(actorGroup, 600, 400);

			StageHolder.stage.setScene(scene);
			StageHolder.stage.show();

		}

	}

}
