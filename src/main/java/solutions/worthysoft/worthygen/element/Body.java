package solutions.worthysoft.worthygen.element;

import solutions.worthysoft.worthygen.attribute.event.OnAfterPrint;
import solutions.worthysoft.worthygen.attribute.event.OnBeforeUnload;
import solutions.worthysoft.worthygen.attribute.event.OnHashChange;
import solutions.worthysoft.worthygen.attribute.event.OnLanguageChange;
import solutions.worthysoft.worthygen.attribute.event.OnMessage;
import solutions.worthysoft.worthygen.attribute.event.OnRedo;
import solutions.worthysoft.worthygen.attribute.event.OnStorage;
import solutions.worthysoft.worthygen.attribute.event.OnUndo;
import solutions.worthysoft.worthygen.attribute.event.OnUnload;

public class Body extends Element {
    
    OnAfterPrint onAfterPrint = new OnAfterPrint();
    OnBeforeUnload onBeforeUnload = new OnBeforeUnload();
    OnHashChange onHashChange = new OnHashChange();
    OnLanguageChange onLanguageChange = new OnLanguageChange();
    OnMessage onMessage = new OnMessage();
    OnOffline onOffline = new OnOffline();
    OnOnline onOnline = new OnOnline();
    OnPopState onPopState = new OnPopState();
    OnRedo onRedo = new OnRedo();
    OnStorage onStorage = new OnStorage();
    OnUndo onUndo = new OnUndo();
    OnUnload onUnload = new OnUnload();

}
