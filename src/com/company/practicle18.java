package sample;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class practicle18 extends Application
{
    /*Write a program that moves a circle up, down, left or right using arrow keys.*/
    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        pane.setPadding(new Insets(30, 30, 30, 30));
        Circle circle = new Circle(30, 30, 30);
        pane.getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);

        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP : circle.setCenterY(circle.getCenterY() >
                        circle.getRadius() ? circle.getCenterY() - 15 :
                        circle.getCenterY()); break;
                case DOWN : circle.setCenterY(circle.getCenterY() <
                        pane.getHeight() - circle.getRadius() ?
                        circle.getCenterY() + 15 : circle.getCenterY());
                    break;
                case LEFT : circle.setCenterX(circle.getCenterX() >
                        circle.getRadius() ? circle.getCenterX() - 15 :
                        circle.getCenterX()); break;
                case RIGHT : circle.setCenterX(circle.getCenterX() <
                        pane.getWidth() - circle.getRadius() ?
                        circle.getCenterX() + 15: circle.getCenterX());
            }
        });

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("190130107041 Niraj Italiya 4CEA2" +"\n" + "    Practical - 18;");
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.requestFocus();
    }
}