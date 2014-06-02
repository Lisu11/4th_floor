package plan;

import java.util.ArrayList;

import android.graphics.Point;

public class rectRoom extends room {
    private Point bottomRight;
    private Point topLeft;

    public rectRoom(ArrayList<Point> list, String name, roomType type) {
        super(list, name, type);
        topLeft = getTopLeft();
        bottomRight = getBottomRight();
    }

    private Point getBottomRight() {
        Point A = Perimeter.get(0);
        for (int i = 1; i < 4; i++) {
            if (Perimeter.get(i).y <= A.y && Perimeter.get(i).x >= A.x) {
                A = Perimeter.get(i);
            }
        }
        return A;
    }

    private Point getTopLeft() {
        Point A = Perimeter.get(0);
        for (int i = 1; i < 4; i++) {
            if (Perimeter.get(i).y >= A.y && Perimeter.get(i).x <= A.x) {
                A = Perimeter.get(i);
            }
        }
        return A;
    }

    @Override
    public boolean pointInTheRoom(Point p) {
        if (bottomRight.x >= p.x && bottomRight.y <= p.y && topLeft.x <= p.x
                && topLeft.y >= p.y) {
            return true;
        }
        return false;
    }

}
