package strips;

import junit.framework.TestCase;

public class NetTest extends TestCase {

    public void testAddPadtoNet() {
        Net net = new Net();
        net.addPad(new Pad());
        assertEquals(net.getPads().size(), 1);
    }
}