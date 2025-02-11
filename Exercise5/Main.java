import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Make this my main page
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

        // Set the title of the window
        primaryStage.setTitle("LionBites");

        // Set the window size
        primaryStage.setScene(new Scene(root, 800, 500));

        // Display the main page
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}