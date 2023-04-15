package solutions.worthysoft.worthygen;

import solutions.worthysoft.worthygen.attribute.Lang;
import solutions.worthysoft.worthygen.attribute.Title;
import solutions.worthysoft.worthygen.attribute.Version;
import solutions.worthysoft.worthygen.component.Page;
import solutions.worthysoft.worthygen.component.Site;
import solutions.worthysoft.worthygen.element.HTML;
import solutions.worthysoft.worthygen.element.Head;

public class WorthyGen {

    public static void main(String[] args) {
        Site site = new Site();
        Page homePage = new Page();
        site.addPage(homePage);
        HTML html = new HTML(Lang.ENGLISH, new Version("1.0"));
        Head head = new Head(html);
        Title title = new Title(head, "");
        
        homePage.addElement(html);
    }

}
