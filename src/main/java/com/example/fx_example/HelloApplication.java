package com.example.fx_example;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Creating a Grid Pane
        GridPane gridPane = new GridPane();

        gridPane.setMinSize(400, 400);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        Button button1 = new Button("X");
        button1.setPrefSize(100, 100);
        Button button2 = new Button("O");
        button2.setPrefSize(100, 100);

        for(int col = 0; col < 3; col++){
            for(int row = 0; row < 3; row++) {
                MyField field = new MyField("X", col, row);
                field.setPrefSize(100 , 100);
                gridPane.add(field, col, row);

                HelloController.INSTANCE.addField(field);
            }
        }

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        //Displaying the contents of the stage
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}