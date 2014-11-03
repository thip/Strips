package strips;

import java.util.ArrayList;

/**
 * @author David Capper <dmc2@aber.ac.uk>
 */
public class Board {

    private ArrayList<Pad> padList;

    public Board(int width, int height) {
        padList = new ArrayList<Pad>();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Pad pad = new Pad();
                pad.setPosition(j, i);
                padList.add(pad);
            }
        }
    }


    public ArrayList<Pad> getPadList() {
        return padList;
    }
}
