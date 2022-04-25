package solutions.worthysoft.jinairis.element;

import solutions.worthysoft.jinairis.attribute.Download;
import solutions.worthysoft.jinairis.attribute.HRef;
import solutions.worthysoft.jinairis.attribute.HRefLang;
import solutions.worthysoft.jinairis.attribute.Ping;
import solutions.worthysoft.jinairis.attribute.ReferrerPolicy;
import solutions.worthysoft.jinairis.attribute.Rel;
import solutions.worthysoft.jinairis.attribute.Target;
import solutions.worthysoft.jinairis.attribute.Type;

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
