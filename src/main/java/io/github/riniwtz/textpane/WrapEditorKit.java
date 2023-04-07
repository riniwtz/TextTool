package io.github.riniwtz.textpane;

import javax.swing.text.StyledEditorKit;
import javax.swing.text.ViewFactory;

public class WrapEditorKit extends StyledEditorKit {
    public ViewFactory getViewFactory() {
        return new WrapColumnFactory();
    }
}
