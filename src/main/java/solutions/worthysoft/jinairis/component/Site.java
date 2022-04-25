package solutions.worthysoft.jinairis.component;

import java.util.ArrayList;
import java.util.List;

public class Site {

    private Integer id = null;
    private String name = null;
    private List<Folder> folders = new ArrayList<Folder>();
    private List<Page> pages = new ArrayList<Page>();
    
    public Site() {
    }

    public Site(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Site(Integer id, String name, List<Folder> folders, List<Page> pages) {
        this.id = id;
        this.name = name;
        this.folders = folders;
        this.pages = pages;
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

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public void addFolder(Folder folder) {
        this.folders.add(folder);
    }

    public void addPage(Page page) {
        this.pages.add(page);
    }

    public void removeFolder(Folder folder) {
        this.folders.remove(folder);
    }

    public void removePage(Page page) {
        this.pages.remove(page);
    }
    
}
