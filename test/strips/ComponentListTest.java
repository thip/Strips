package strips;


import junit.framework.TestCase;


public class ComponentListTest extends TestCase {


    public void testEmptyComponentList() {
        ComponentList components = new ComponentList();
        int count = components.size();
        assertEquals("New component list should be empty", 0, count);
    }

    public void testAddComponentToList() {
        ComponentList components = new ComponentList();
        components.add(new Component());
        int count = components.size();
        assertEquals("Component list with one member should have length 1", 1, count);
    }

    public void testAddTwoComponentsToList() {
        ComponentList components = new ComponentList();
        components.add(new Component());
        components.add(new Component());
        int count = components.size();
        assertEquals("Component list with two members should have length 2", 2, count);
    }
}