package solutions.worthysoft.worthygen.attribute;

public enum FetchPriority {

    HIGH("high"), 
    LOW("low"), 
    AUTO("auto");

    private String htmlName;
 
    private FetchPriority(String htmlName) {
        this.htmlName = htmlName;
    }
 
    public String toString() {
        return htmlName;
    }

}
