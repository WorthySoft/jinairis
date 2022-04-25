package solutions.worthysoft.jinairis;

import solutions.worthysoft.jinairis.attribute.Lang;
import solutions.worthysoft.jinairis.attribute.Title;
import solutions.worthysoft.jinairis.attribute.Version;
import solutions.worthysoft.jinairis.component.Page;
import solutions.worthysoft.jinairis.component.Site;
import solutions.worthysoft.jinairis.element.HTML;
import solutions.worthysoft.jinairis.element.Head;

public class Jinairis {

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
