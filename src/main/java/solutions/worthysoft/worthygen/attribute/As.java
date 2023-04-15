package solutions.worthysoft.worthygen.attribute;

public enum As {

    AUDIO("audio"),
    DOCUMENT("document"),
    EMBED("embed"),
    FETCH("fetch"),
    FONT("font"),
    IMAGE("image"),
    OBJECT("object"),
    SCRIPT("script"),
    STYLE("style"),
    TRACK("track"),
    VIDEO("video"),
    WORKER("worker"), 
    NONE("");

    private String htmlName;

    private As(String htmlName) {
        this.htmlName = htmlName;
    }

    public String toString() {
        return htmlName;
    }

}
