/* Mike Gordon
 * 8/8/25
 * M11 Programming Assignment
 * VBox Example
 */


// Import all required for javafx
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application{

    @Override
    public void start(Stage primarStage) {

        // Create label
        Label question = new Label("How do you like Java?");

        // Create buttons
        Button likeItButton = new Button("Like it");
        Button loveItButton = new Button("Love it");
        Button cantCodeButton = new Button("Can't code without it");

        // Event handlers
        likeItButton.setOnAction(e -> showResponse("Glad you like it!"));
        loveItButton.setOnAction(e -> showResponse("Glad you love it!"));
        cantCodeButton.setOnAction(e -> showResponse("Me Too!!!"));

        // Create layout
        VBox vbox = new VBox(15);
        vbox.getChildren().addAll(question, likeItButton, loveItButton, cantCodeButton);

        // Set scene
        Scene scene = new Scene(vbox, 300, 200);
        primarStage.setTitle("VBox Example");
        primarStage.setScene(scene);
        // Show stage
        primarStage.show();
    }

    // Show response 
    private void showResponse(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Response");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
 * Code developed based on concepts from
 * Introduction to Java Programming and Data Structures by Y. Daniel Liang,
 * instructional videos by Darrell Payne, as well as documentation and examples from
 * GeeksforGeeks: https://www.geeksforgeeks.org/java/javafx-hbox-class/
 * Oracle JavaFX API: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/VBox.html
*/