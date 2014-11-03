package strips;

import junit.framework.TestCase;


public class PadTest extends TestCase {


    public void testPadPosition() {
        Pad pad = new Pad();
        pad.setPosition(3, 4);
        assertEquals(pad.getX(), 3);
        assertEquals(pad.getY(), 4);
    }
}