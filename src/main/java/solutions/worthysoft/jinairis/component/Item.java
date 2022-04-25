package solutions.worthysoft.jinairis.component;

import java.util.Arrays;

public class Item {

    int id;
    String name = null;
    String source = null;
    int[] children;

    @Override
    public String toString() {
        return "Item [children=" + Arrays.toString(children) + ", id=" + id + ", name=" + name + ", source=" + source
                + "]";
    }

}
