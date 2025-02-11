import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    Label usernameLabel;

    @FXML
    Label passwordLabel;

    @FXML
    TextField usernameTextField;

    @FXML
    TextField passwordTextField;

    @FXML
    Button loginButton;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void loginButtonHandler(ActionEvent event) throws IOException {

        // System.out.println("Welcom to my app!");

        String uname = usernameTextField.getText();
        String pword = passwordTextField.getText();

        // System.out.println("Username: " + uname);
        // System.out.println("Password: " + pword);

        if (DatabaseHandler.validateLogin(uname, pword)) {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));

            // System.out.println("Login successful!");

            root = loader.load();

            HomeController homeController = loader.getController();
            // Pass username from textfield to displayName() method

            homeController.displayName(uname);

            // Load stage and scene
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            System.out.println("Login failed!");
        }
    }
}