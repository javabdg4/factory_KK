package com.sda.factory.button;

import com.sda.factory.interfaces.Button;

public class DrawButton implements Button {

    public void render() {
        System.out.println("nacisnij ok");
        onClick();
    }

    public void onClick() {
        System.out.println("przycisk zostal nacisniety");
    }
}
