package com.sda.factory.dialog;

import com.sda.factory.Dialog;
import com.sda.factory.button.SwingButton;
import com.sda.factory.interfaces.Button;

public class SwingDialog extends Dialog {
    public Button createButton() {
        return new SwingButton();
    }
}
