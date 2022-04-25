package solutions.worthysoft.jinairis.attribute;

public enum CrossOrigin {

    ANONYMOUS("anonymous"), 
    USE_CREDENTIALS("use-credentials"), 
    NONE("");

    private String htmlName;
 
    private CrossOrigin(String htmlName) {
        this.htmlName = htmlName;
    }
 
    public String toString() {
        return htmlName;
    }

}
