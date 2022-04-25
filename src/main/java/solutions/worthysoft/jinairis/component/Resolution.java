package solutions.worthysoft.jinairis.component;

public class Resolution {

    int id;
    String name = null;
    int minWidth;
    int maxWidth;

    @Override
    public String toString() {
        return "Resolution [id=" + id + ", maxWidth=" + maxWidth + ", minWidth=" + minWidth + ", name=" + name + "]";
    }

}
