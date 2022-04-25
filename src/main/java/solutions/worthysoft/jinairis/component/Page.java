package solutions.worthysoft.jinairis.component;

import java.util.ArrayList;
import java.util.List;

import solutions.worthysoft.jinairis.element.Element;

public class Page {

    private Integer id = null;
    private String name = null;
    private Folder parent = null;
    private List<Element> elements = new ArrayList<Element>();
    
    public Page() {
    }

    public Page(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Page(Integer id, String name, Folder parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
    }

    public Page(Integer id, String name, Folder parent, List<Element> elements) {
        this.id = id;
        this.name = name;
        this.parent = parent;
        this.elements = elements;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Folder getParent() {
        return parent;
    }

    public void setParent(Folder parent) {
        this.parent = parent;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }
 
    public void addElement(Element e) {
        this.elements.add(e);
    }
    
    public void removeElement(Element e) {
        this.elements.remove(e);
    } 
}
