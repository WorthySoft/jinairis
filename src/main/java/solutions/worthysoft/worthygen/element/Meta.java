package solutions.worthysoft.worthygen.element;

import solutions.worthysoft.worthygen.attribute.CharSet;
import solutions.worthysoft.worthygen.attribute.HttpEquiv;
import solutions.worthysoft.worthygen.attribute.ItemProp;
import solutions.worthysoft.worthygen.attribute.Name;

public class Meta extends Element {
    
    Name name = new Name();
    HttpEquiv httpEquiv = new HttpEquiv();
    CharSet charSet = new CharSet();
    ItemProp itemProp = new ItemProp();

}
