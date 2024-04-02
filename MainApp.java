package asuHelloWorldJavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MainApp extends Application {

    private Stage mainStage;

    @Override
    public void start(Stage primaryStage) {
        mainStage = primaryStage;

        Button btnPatientIntake = new Button("Patient Intake");
        Button btnCTScanTechView = new Button("CT Scan Tech View");
        Button btnPatientView = new Button("Patient View");

        btnPatientIntake.setOnAction(e -> showPatientIntake());
        btnCTScanTechView.setOnAction(e -> showCTScanTechView());
        btnPatientView.setOnAction(e -> showPatientView());

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(btnPatientIntake, btnCTScanTechView, btnPatientView);
        vBox.setAlignment(Pos.CENTER);

        primaryStage.setTitle("Welcome to Heart Health Imaging and Recording System");
        Scene scene = new Scene(vBox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}