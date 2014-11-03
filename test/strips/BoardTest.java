package strips;

import junit.framework.TestCase;

public class BoardTest extends TestCase {


    public void testBoardCreate() {
        Board board = new Board(5, 5);
        assertEquals(board.getPadList().size(), 25);
    }


}