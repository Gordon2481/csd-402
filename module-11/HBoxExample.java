/* Mike Gordon
 * 8/8/25
 * M11 Programming Assignment
 * HBox Example
 */

// import all required for javafx
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class HBoxExample extends Application{

    @Override
    public void start(Stage stage) {

        // Set stage title
        stage.setTitle("HBox Example");

        // Create an HBox with spacing between children
        HBox hbox = new HBox(15);

        // Align children center 
        hbox.setAlignment(Pos.CENTER);

        // Create Label with question
        Label questionLabel = new Label("How do you like Java?");

        // Add the label to the HBox
        hbox.getChildren().add(questionLabel);

        // Create buttons
        Button btnLikeIt = new Button("Like it");
        Button btnLoveIt = new Button("Love it");
        Button btnCantCode = new Button("Can't code without it");

        // Set spacing
        HBox.setHgrow(btnLikeIt, Priority.ALWAYS);
        HBox.setHgrow(btnLoveIt, Priority.ALWAYS);
        HBox.setHgrow(btnCantCode, Priority.ALWAYS);

        // Add buttons to the Hbox
        hbox.getChildren().addAll(btnLikeIt, btnLoveIt, btnCantCode);

        // Create scene
        Scene scene = new Scene(hbox, 600, 120);

        // Set scene on stage
        stage.setScene(scene);
        // Show stage
        stage.show();

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
 * OpenJFX API: https://openjfx.io/javadoc/17/javafx.graphics/javafx/scene/layout/HBox.html
 */