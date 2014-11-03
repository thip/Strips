package strips;

import java.util.ArrayList;

/**
 * @author David Capper <dmc2@aber.ac.uk>
 */
public class Net {
    private ArrayList<Pad> pads;

    public Net() {
        pads = new ArrayList<Pad>();
    }

    public ArrayList<Pad> getPads() {
        return pads;
    }

    public void addPad(Pad pad) {
        pads.add(pad);
        pad.setNet(this);
    }
}
