package solutions.worthysoft.worthygen.element;

import solutions.worthysoft.worthygen.attribute.Download;
import solutions.worthysoft.worthygen.attribute.HRef;
import solutions.worthysoft.worthygen.attribute.HRefLang;
import solutions.worthysoft.worthygen.attribute.Ping;
import solutions.worthysoft.worthygen.attribute.ReferrerPolicy;
import solutions.worthysoft.worthygen.attribute.Rel;
import solutions.worthysoft.worthygen.attribute.Target;
import solutions.worthysoft.worthygen.attribute.Type;

public class A extends Element {
    
    Download download = new Download();
    HRef hRef = new HRef();
    HRefLang hRefLang = new HRefLang();
    Ping ping = new Ping();
    ReferrerPolicy referrerPolicy = ReferrerPolicy.NONE;
    Rel rel = Rel.NONE;
    Target target = Target.NONE;
    Type type = new Type();

}
