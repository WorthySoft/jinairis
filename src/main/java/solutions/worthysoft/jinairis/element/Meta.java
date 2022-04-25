package solutions.worthysoft.jinairis.element;

import solutions.worthysoft.jinairis.attribute.CharSet;
import solutions.worthysoft.jinairis.attribute.HttpEquiv;
import solutions.worthysoft.jinairis.attribute.ItemProp;
import solutions.worthysoft.jinairis.attribute.Name;

public class Meta extends Element {
    
    Name name = new Name();
    HttpEquiv httpEquiv = new HttpEquiv();
    CharSet charSet = new CharSet();
    ItemProp itemProp = new ItemProp();

}
