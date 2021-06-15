package com.outletcity.citymatcher.domain;

import java.util.Arrays;

public enum Type {

    ATTRIBUTE("attrib"), ELEMENT("sub");

    private final String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /**
     * @param type - type name
     * @return - enum item for type name
     */
    public static Type valueOfType(String type) {
        return Arrays.stream(values()).filter(e -> type.equals(e.getType())).findAny().orElse(null);
    }
}

