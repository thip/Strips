package strips;

/**
 * @author David Capper <dmc2@aber.ac.uk>
 */
public class Pad {
    private int y;
    private int x;
    private Net net;

    public Net getNet() {
        return net;
    }

    public void setNet(Net net) {
        this.net = net;
    }

    public void setPosition(int j, int i) {
        x = j;
        y = i;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
