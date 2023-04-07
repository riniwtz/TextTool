package io.github.riniwtz.textpane;

import javax.swing.text.Element;
import javax.swing.text.LabelView;
import javax.swing.text.View;

public class WrapLabelView extends LabelView {
    public WrapLabelView(Element elem) {
        super(elem);
    }

    public float getMinimumSpan(int axis) {
        return switch (axis) {
            case View.X_AXIS -> 0;
            case View.Y_AXIS -> super.getMinimumSpan(axis);
            default -> throw new IllegalArgumentException("Invalid axis: " + axis);
        };
    }
}
