import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeController {

    @FXML
    Label homeLabel;

    public void displayName(String username) {
        homeLabel.setText("Welcome, " + username + "!");
    }
}