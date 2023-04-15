package solutions.worthysoft.worthygen.element;

import java.util.ArrayList;
import java.util.List;

import solutions.worthysoft.worthygen.attribute.*;
import solutions.worthysoft.worthygen.attribute.event.*;
import solutions.worthysoft.worthygen.component.Design;
import solutions.worthysoft.worthygen.component.Placement;

public abstract class Element {
    
    private List<Placement> placements = new ArrayList<Placement>();
    private List<Design> designs = new ArrayList<Design>();
    private String text = null;
    private Element parent = null;

    //Attributes
    private AccessKey accessKey = null;
    private AutoCapitalize autoCapitalize = null;
    private AutoFocus autoFocus = null;
    private Cls cls = null; //"class"
    private ContentEditable contentEditable = null;
    private ContextMenu contextMenu = null;
    private Dir dir = null;
    private Draggable draggable = null;
    private EnterKeyHint enterKeyHint = null;
    private ExportParts exportParts = null;
    private Hidden hidden = null;
    private Id id = null;
    private InputMode inputMode = null;
    private Is is = null;
    private ItemId itemId = null;
    private ItemProp itemProp = null;
    private ItemRef itemRef = null;
    private ItemScope ItemScope = null;
    private ItemType itemType = null;
    private Lang lang = null;
    private Nonce nonce = null;
    private Part part = null;
    private SpellCheck spellCheck = null;
    private TabIndex tabIndex = null;
    private Translate translate = null;
    private XMLBase xmlBase = null;
    private XMLLang xmlLand = null;

    //Events
    private Onabort a = null;
    private Onautocomplete au = null;
    private Onautocompleteerror ace = null;
    private Onblur b = null;
    private Oncancel oc = null;
    private Oncanplay ocp = null;
    private Oncanplaythrough ocpt = null;
    private Onchange och = null;
    private Onclick ocl = null;
    private Onclose ocls = null;
    private Oncontextmenu ocm = null;
    private Oncuechange occ = null;
    private Ondblclick odbc = null;
    private Ondrag od = null;
    private Ondragend ode = null;
    private Ondragenter odntr = null;
    private Ondragleave odl = null;
    private Ondragover odo = null;
    private Ondragstart ods = null;
    private Ondrop odr = null;
    private Ondurationchange odc = null;
    private Onemptied oe = null;
    private Onended onn = null;
    private Onerror oer = null;
    private Onfocus of = null;
    private Oninput onin = null;
    private Oninvalid onv = null;
    private Onkeydown okd = null;
    private Onkeyup oku = null;
    private Onload ol = null;
    private Onloadeddata old = null;
    private Onloadedmetadata olm = null;
    private Onloadstart ols = null;
    private Onmousedown omd = null;
    private Onmouseenter ome = null;
    private Onmouseleave oml = null;
    private Onmousemove omm = null;
    private Onmouseout omo = null;
    private Onmouseover omov = null;
    private Onmouseup omu = null;
    private Onmousewheel omw = null;
    private Onpause op = null;
    private Onplay opl = null;
    private Onplaying oply = null;
    private Onprogress opgr = null;
    private Onratechange orc = null;
    private Onreset ors = null;
    private Onresize orz = null;
    private Onscroll onscr = null;
    private Onseeked osk = null;
    private Onseeking oskng = null;
    private Onselect onsel = null;
    private Onshow onsh = null;
    private Onsort onsrt = null;
    private Onstalled onst = null;
    private Onsubmit onsub = null;
    private Onsuspend onsp = null;
    private Ontimeupdate ont = null;
    private Ontoggle otg = null;
    private Onvolumechange ovc = null;
    private Onwaiting ow = null;

    public Element() {}

    public Element(Element parent) {
        this.parent = parent;
    }

    public List<Placement> getPlacements() {
        return placements;
    }

    public void setPlacements(List<Placement> placements) {
        this.placements = placements;
    }

    public List<Design> getDesigns() {
        return designs;
    }

    public void setDesigns(List<Design> designs) {
        this.designs = designs;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Element getParent() {
        return parent;
    }

    public void setParent(Element parent) {
        this.parent = parent;
    }

    public AccessKey getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(AccessKey accessKey) {
        this.accessKey = accessKey;
    }

    public AutoCapitalize getAutoCapitalize() {
        return autoCapitalize;
    }

    public void setAutoCapitalize(AutoCapitalize autoCapitalize) {
        this.autoCapitalize = autoCapitalize;
    }

    public AutoFocus getAutoFocus() {
        return autoFocus;
    }

    public void setAutoFocus(AutoFocus autoFocus) {
        this.autoFocus = autoFocus;
    }

    public Cls getCls() {
        return cls;
    }

    public void setCls(Cls cls) {
        this.cls = cls;
    }

    public ContentEditable getContentEditable() {
        return contentEditable;
    }

    public void setContentEditable(ContentEditable contentEditable) {
        this.contentEditable = contentEditable;
    }

    public ContextMenu getContextMenu() {
        return contextMenu;
    }

    public void setContextMenu(ContextMenu contextMenu) {
        this.contextMenu = contextMenu;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public Draggable getDraggable() {
        return draggable;
    }

    public void setDraggable(Draggable draggable) {
        this.draggable = draggable;
    }

    public EnterKeyHint getEnterKeyHint() {
        return enterKeyHint;
    }

    public void setEnterKeyHint(EnterKeyHint enterKeyHint) {
        this.enterKeyHint = enterKeyHint;
    }

    public ExportParts getExportParts() {
        return exportParts;
    }

    public void setExportParts(ExportParts exportParts) {
        this.exportParts = exportParts;
    }

    public Hidden getHidden() {
        return hidden;
    }

    public void setHidden(Hidden hidden) {
        this.hidden = hidden;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public InputMode getInputMode() {
        return inputMode;
    }

    public void setInputMode(InputMode inputMode) {
        this.inputMode = inputMode;
    }

    public Is getIs() {
        return is;
    }

    public void setIs(Is is) {
        this.is = is;
    }

    public ItemId getItemId() {
        return itemId;
    }

    public void setItemId(ItemId itemId) {
        this.itemId = itemId;
    }

    public ItemProp getItemProp() {
        return itemProp;
    }

    public void setItemProp(ItemProp itemProp) {
        this.itemProp = itemProp;
    }

    public ItemRef getItemRef() {
        return itemRef;
    }

    public void setItemRef(ItemRef itemRef) {
        this.itemRef = itemRef;
    }

    public ItemScope getItemScope() {
        return ItemScope;
    }

    public void setItemScope(ItemScope itemScope) {
        ItemScope = itemScope;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public Nonce getNonce() {
        return nonce;
    }

    public void setNonce(Nonce nonce) {
        this.nonce = nonce;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public SpellCheck getSpellCheck() {
        return spellCheck;
    }

    public void setSpellCheck(SpellCheck spellCheck) {
        this.spellCheck = spellCheck;
    }

    public TabIndex getTabIndex() {
        return tabIndex;
    }

    public void setTabIndex(TabIndex tabIndex) {
        this.tabIndex = tabIndex;
    }

    public Translate getTranslate() {
        return translate;
    }

    public void setTranslate(Translate translate) {
        this.translate = translate;
    }

    public XMLBase getXmlBase() {
        return xmlBase;
    }

    public void setXmlBase(XMLBase xmlBase) {
        this.xmlBase = xmlBase;
    }

    public XMLLang getXmlLand() {
        return xmlLand;
    }

    public void setXmlLand(XMLLang xmlLand) {
        this.xmlLand = xmlLand;
    }

}
