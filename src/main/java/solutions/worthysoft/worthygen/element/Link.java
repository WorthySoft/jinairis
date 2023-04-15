package solutions.worthysoft.worthygen.element;

import solutions.worthysoft.worthygen.attribute.As;
import solutions.worthysoft.worthygen.attribute.CrossOrigin;
import solutions.worthysoft.worthygen.attribute.FetchPriority;
import solutions.worthysoft.worthygen.attribute.HRef;
import solutions.worthysoft.worthygen.attribute.HRefLang;
import solutions.worthysoft.worthygen.attribute.ImageSizes;
import solutions.worthysoft.worthygen.attribute.ImageSrcSet;
import solutions.worthysoft.worthygen.attribute.Integrity;
import solutions.worthysoft.worthygen.attribute.Media;
import solutions.worthysoft.worthygen.attribute.PreFetch;
import solutions.worthysoft.worthygen.attribute.ReferrerPolicy;
import solutions.worthysoft.worthygen.attribute.Rel;
import solutions.worthysoft.worthygen.attribute.Sizes;
import solutions.worthysoft.worthygen.attribute.Title;
import solutions.worthysoft.worthygen.attribute.Type;

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
