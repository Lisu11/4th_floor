package plan;

import java.util.ArrayList;

import android.graphics.Point;

public class irregularRoom extends room {

    public irregularRoom(ArrayList<Point> list, String name, roomType type) {
        super(list, name, type);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean pointInTheRoom(Point p) {
        // TODO Auto-generated method stub
        return false;
    }

}
