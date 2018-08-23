package com.sda.factory.dialog;

import com.sda.factory.Dialog;
import com.sda.factory.button.HtmlButton;
import com.sda.factory.interfaces.Button;

public class HtmlDialog extends Dialog {
    public Button createButton() {
        return new HtmlButton();
    }
}
