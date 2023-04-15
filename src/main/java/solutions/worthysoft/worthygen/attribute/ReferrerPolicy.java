package solutions.worthysoft.worthygen.attribute;

public enum ReferrerPolicy {

    NO_REFERRER("no-referrer"),
    NO_REFERRER_WHEN_DOWNGRADE("no-referrer-when-downgrade"),
    ORIGIN("origin"),
    ORIGIN_WHEN_CROSS_ORIGIN("origin-when-cross-origin"),
    SAME_ORIGIN("same-origin"),
    STRICT_ORIGIN("strict-origin"),
    STRICT_ORIGIN_WHEN_CROSS_ORIGIN("strict-origin-when-cross-origin"),
    UNSAFE_URL("unsafe-url"),
    NONE("");

    private String htmlName;
 
    private ReferrerPolicy(String htmlName) {
        this.htmlName = htmlName;
    }
 
    public String toString() {
        return htmlName;
    }
}
