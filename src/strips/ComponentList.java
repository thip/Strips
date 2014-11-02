package strips;

import java.util.ArrayList;

/**
 * @author David Capper <dmc2@aber.ac.uk>
 */
public class ComponentList {
    private ArrayList<Component> components;

    public ComponentList() {
        this.components = new ArrayList<Component>();
    }

    public void add(Component component) {
        components.add(component);
    }

    public int size() {
        return components.size();
    }
}
