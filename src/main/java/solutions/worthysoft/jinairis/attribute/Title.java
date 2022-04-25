package solutions.worthysoft.jinairis.attribute;

import solutions.worthysoft.jinairis.element.Element;

public class Title extends Element {

    public Title(String title) {
        super.setText(title);
    }

    public Title(Element parent, String title) {
        super(parent);
        super.setText(title);
    }
    
}
