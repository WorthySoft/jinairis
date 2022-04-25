package solutions.worthysoft.jinairis.element;

import solutions.worthysoft.jinairis.attribute.As;
import solutions.worthysoft.jinairis.attribute.CrossOrigin;
import solutions.worthysoft.jinairis.attribute.FetchPriority;
import solutions.worthysoft.jinairis.attribute.HRef;
import solutions.worthysoft.jinairis.attribute.HRefLang;
import solutions.worthysoft.jinairis.attribute.ImageSizes;
import solutions.worthysoft.jinairis.attribute.ImageSrcSet;
import solutions.worthysoft.jinairis.attribute.Integrity;
import solutions.worthysoft.jinairis.attribute.Media;
import solutions.worthysoft.jinairis.attribute.PreFetch;
import solutions.worthysoft.jinairis.attribute.ReferrerPolicy;
import solutions.worthysoft.jinairis.attribute.Rel;
import solutions.worthysoft.jinairis.attribute.Sizes;
import solutions.worthysoft.jinairis.attribute.Title;
import solutions.worthysoft.jinairis.attribute.Type;

public class Link extends Element {

    As as = As.NONE;
    CrossOrigin crossOrigin = CrossOrigin.NONE;
    FetchPriority fetchPriority = FetchPriority.AUTO;
    HRef href = new HRef();
    HRefLang hRefLang = new HRefLang();
    Media media = new Media();
    Rel rel = Rel.NONE;
    Sizes sizes = new Sizes();
    Type type = new Type();

    ImageSizes imageSizes = new ImageSizes();
    ImageSrcSet imageSrcSet = new ImageSrcSet();
    Integrity integrity = new Integrity();
    PreFetch preFetch = new PreFetch();
    ReferrerPolicy referrerPolicy = ReferrerPolicy.NONE;
    Title title = new Title();

}
