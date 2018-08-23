package com.sda.factory.dialog;

import com.sda.factory.Dialog;
import com.sda.factory.button.DrawButton;
import com.sda.factory.interfaces.Button;

public class DrawDialog extends Dialog {
    public Button createButton() {
        return new DrawButton();
    }
}
