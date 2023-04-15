package solutions.worthysoft.worthygen.attribute;

import solutions.worthysoft.worthygen.element.Element;

public class Title extends Element {

    public Title(String title) {
        super.setText(title);
    }

    public Title(Element parent, String title) {
        super(parent);
        super.setText(title);
    }
    
}
