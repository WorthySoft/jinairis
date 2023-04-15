package solutions.worthysoft.worthygen.element;

import solutions.worthysoft.worthygen.attribute.Lang;
import solutions.worthysoft.worthygen.attribute.Manifest;
import solutions.worthysoft.worthygen.attribute.Version;
import solutions.worthysoft.worthygen.attribute.XMLNS;

public class HTML extends Element {
    
    private Manifest manifest = null;
    private Version version = null;
    private XMLNS xmlNS = null;
    
    public HTML() {
    }

    public HTML(Version version) {
        this.version = version;
    }

    public HTML(Manifest manifest, Version version, XMLNS xmlNS) {
        this.manifest = manifest;
        this.version = version;
        this.xmlNS = xmlNS;
    }

    public HTML(Lang lang, Version version) {
        this.setLang(lang);
        this.setVersion(version);
    }

    public Manifest getManifest() {
        return manifest;
    }

    public void setManifest(Manifest manifest) {
        this.manifest = manifest;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public XMLNS getXmlNS() {
        return xmlNS;
    }

    public void setXmlNS(XMLNS xmlNS) {
        this.xmlNS = xmlNS;
    }

}
