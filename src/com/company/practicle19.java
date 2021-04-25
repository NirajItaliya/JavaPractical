package sample;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class practicle19 extends Application {
    /*Write a program that displays the color of a circle as red when the mouse button is pressed and as blue when the mouse button is released.*/
    @Override
    public void start(Stage primaryStage) {
        double width = 450;
        double height = 450;
        Circle c = new Circle(width / 2, height / 2, Math.min(width, height) / 10, Color.BLUE);

        c.setStroke(Color.WHITE);

        StackPane pane = new StackPane(c);

        primaryStage.setScene(new Scene(pane, width, height));
        pane.setOnMouseReleased(e -> c.setFill(Color.YELLOWGREEN));
        pane.setOnMousePressed(e -> c.setFill(Color.BLUE));
        primaryStage.setTitle("190130107041 Niraj Italiya 4CEA2" +"\n" + "    Practical - 18;" + "Click circle..");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }
}
