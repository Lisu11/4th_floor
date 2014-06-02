package plan;

import java.util.ArrayList;

import android.util.Pair;
import statics.Constants;

public class connections {
    private static ArrayList<Pair<String, String>> E = null;

    private static void initGraph() {
        E.add(new Pair<String, String>(Constants.room_4_01, Constants.room_4_02));
        E.add(new Pair<String, String>(Constants.room_4_14, Constants.room_4_15));
        E.add(new Pair<String, String>(Constants.room_4_15, Constants.room_4_22));
        E.add(new Pair<String, String>(Constants.room_4_22, Constants.room_4_20));
        E.add(new Pair<String, String>(Constants.room_4_15, Constants.room_4_19));
        E.add(new Pair<String, String>(Constants.room_4_02, Constants.room_4_03));
        E.add(new Pair<String, String>(Constants.room_4_37,
                Constants.room_kitchen));
        E.add(new Pair<String, String>(Constants.room_4_45, Constants.room_4_40));
        E.add(new Pair<String, String>(Constants.room_4_47, Constants.room_4_45));
        E.add(new Pair<String, String>(Constants.room_4_47, Constants.room_4_45));
        E.add(new Pair<String, String>(Constants.room_4_23, Constants.room_4_27));
        E.add(new Pair<String, String>(Constants.room_4_23, Constants.room_4_28));
        E.add(new Pair<String, String>(Constants.room_4_23, Constants.room_4_32));
        E.add(new Pair<String, String>(Constants.room_4_23, Constants.room_4_29));
    }

    public static boolean roomsAreConnected(room Room1, room Room2) {
        if (E == null) {
            initGraph();
        }
        Pair<String, String> p1 = new Pair<String, String>(Room1.getName(),
                Room2.getName());
        Pair<String, String> p2 = new Pair<String, String>(Room2.getName(),
                Room1.getName());

        if (E.contains(p1) || E.contains(p2)) {
            return true;
        }
        return false;
    }
}
