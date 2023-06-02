package com.zaychikov.tests.pagedata;

public enum MenuItem {

    Location("Адреса"),
    LOGIN("Войти"),
    BASKET("Корзина");

    private String desc;

    MenuItem(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
