package com.sda.factory.button;

import com.sda.factory.interfaces.Button;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>TTO JEST PRZYCISK</button");
        onClick();
    }

    public void onClick() {
        System.out.println("przycisk kliknięty");
    }
}
