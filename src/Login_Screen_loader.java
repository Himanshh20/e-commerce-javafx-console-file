import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login_Screen_loader extends Application  { 
	 public  void main (String[] args ) {
		  launch(args) ;  
	 }	 
	 


	public void start(Stage StageByFx) throws Exception {  
		URL fxml = Paths.get("F:\\Log_In_Page\\src\\Log_In_Page\\LogInPage.fxml").toUri().toURL();
		   
		  Parent actorgroup = (Parent) FXMLLoader.load(fxml) ; 
		  StageByFx.setTitle("Student Login "); 
		   Scene scene = new Scene (actorgroup , 600 , 400) ; 
		   StageByFx.setScene(scene); 
		   StageByFx.show();
		
		
	}

}
