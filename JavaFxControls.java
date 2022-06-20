import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

class JavaFxControls extends Application {

	@Override
	public void start(Stage primarystage)12{
		Button bt1=new Button("OK");
		Scene sc=new Scene(bt1,200,200);
		primarystage.setScene(sc);
		primarystage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args);
		
	}
	

}
