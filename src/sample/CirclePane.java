package sample;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class CirclePane extends Pane {
    Circle circle = new Circle(100,  100, 20);

    CirclePane() {
        getChildren().add(circle);
    }

    public void move(int x, int y)
    {
        if ((circle.getCenterX() + x) <= 180 && (circle.getCenterX() + x) >= 20)
            circle.setCenterX(circle.getCenterX() + x);
        if ((circle.getCenterY() + y) <= 180 && (circle.getCenterY() + y) >= 20)
            circle.setCenterY(circle.getCenterY() + y);
    }

}
