package solutions.worthysoft.jinairis.attribute;

public enum Rel {

    PRELOAD("preload"), PREFETCH("prefetch"), NONE("");

    private String htmlName;
 
    private Rel(String htmlName) {
        this.htmlName = htmlName;
    }
 
    public String toString() {
        return htmlName;
    }
}
