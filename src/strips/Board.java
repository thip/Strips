package strips;

import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;

/**
 * @author David Capper <dmc2@aber.ac.uk>
 */
public class Board {

    int pitch;
    private ArrayList<Pad> padList;

    public Board(int width, int height) {
        padList = new ArrayList<Pad>();

        pitch = 10;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Pad pad = new Pad();
                pad.setPosition(j * pitch, i * pitch);
                padList.add(pad);
            }
        }
    }


    public ArrayList<Pad> getPadList() {
        return padList;
    }

    public void draw(GraphicsContext gc) {

    }
}
