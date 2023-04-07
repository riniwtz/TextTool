package io.github.riniwtz.textpane;

import javax.swing.text.*;

public class WrapColumnFactory implements ViewFactory {

    @Override
    public View create(Element elem) {
        String kind = elem.getName();
        if (kind != null && kind.equals(AbstractDocument.ContentElementName)) {
            return new WrapLabelView(elem);
        } else if (kind != null && kind.equals(AbstractDocument.ParagraphElementName)) {
            return new ParagraphView(elem);
        } else if (kind != null && kind.equals(AbstractDocument.SectionElementName)) {
            return new BoxView(elem, View.Y_AXIS);
        } else if (kind != null && kind.equals(StyleConstants.ComponentElementName)) {
            return new ComponentView(elem);
        } else {
            return new LabelView(elem);
        }
    }
}
