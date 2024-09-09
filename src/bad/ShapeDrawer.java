package bad;

import bad.shapes.*;

public class ShapeDrawer {
    public static void drawShape(Object shape) {
        if (shape instanceof Circle) {
            ((Circle) shape).draw();
        } else if (shape instanceof Square) {
            ((Square) shape).draw();
        } else if (shape instanceof Triangle) {
            ((Triangle) shape).draw();
        } else {
            throw new IllegalArgumentException("Hatalı şekil.");
        }
    }
}