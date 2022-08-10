package com.example.appdblibrary.entity.enums;

public enum CourierStatusEnum {
    ONLINE(""),
    BUSY(""),
    OFFLINE("");
    private final String nameUz;

    CourierStatusEnum(String nameUz) {
        this.nameUz = nameUz;
    }

    public String getNameUz() {
        return nameUz;
    }

}
