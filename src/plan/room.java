package plan;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Point;

public abstract class room {
    enum roomType {Toilet, Communication, Meeting_room, Kitchen, Work_space, Other};
    protected roomType Type;
    protected List<Point> Perimeter;
    protected String Name;

    public room(ArrayList<Point> list, String name, roomType type){
        Name = name;
        Perimeter = list;
        Type = type;
    }

    abstract public boolean pointInTheRoom(Point p);

    public String getName(){
        return Name;
    }
}
