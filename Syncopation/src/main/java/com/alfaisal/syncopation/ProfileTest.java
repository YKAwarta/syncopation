package com.alfaisal.syncopation;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ProfileTest extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Player Profile Setup");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label usernameLabel = new Label("Username:");
        GridPane.setConstraints(usernameLabel, 0, 0);
        TextField usernameInput = new TextField();
        GridPane.setConstraints(usernameInput, 1, 0);

        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 1);
        PasswordField passwordInput = new PasswordField();
        GridPane.setConstraints(passwordInput, 1, 1);

        Label phoneNumberLabel = new Label("Phone Number:");
        GridPane.setConstraints(phoneNumberLabel, 0, 2);
        TextField phoneNumberInput = new TextField();
        GridPane.setConstraints(phoneNumberInput, 1, 2);

        Button submitButton = new Button("Create Profile");
        GridPane.setConstraints(submitButton, 1, 4);

        grid.getChildren().addAll(usernameLabel, usernameInput, passwordLabel, passwordInput,
                phoneNumberLabel, phoneNumberInput, submitButton);

        submitButton.setOnAction(e -> {
            String username = usernameInput.getText();
            String password = passwordInput.getText();
            String phoneNumber = phoneNumberInput.getText();

            PlayerProfile playerProfile = new PlayerProfile(username, password, phoneNumber);
            System.out.println("Profile created for user: " + playerProfile.getUsername());
        });

        Scene scene = new Scene(grid, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
