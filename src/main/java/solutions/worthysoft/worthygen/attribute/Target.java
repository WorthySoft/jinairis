package solutions.worthysoft.worthygen.attribute;

public enum Target {

    SELF("_self"), 
    BLANK("_blank"), 
    PARENT("_parent"), 
    TOP("_top"), NONE;

    private String htmlName;
 
    private Target(String htmlName) {
        this.htmlName = htmlName;
    }
 
    public String toString() {
        return htmlName;
    }
}
