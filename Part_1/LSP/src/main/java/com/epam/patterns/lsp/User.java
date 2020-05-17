package com.epam.patterns.lsp;

import java.util.HashMap;
import java.util.Map;

public abstract class User {
    protected Map<String, Boolean> accessRights = new HashMap<>();
    boolean getValueOfAccessRight(String right) {
        return accessRights.getOrDefault(right, false);
    }
    abstract void setupAccessRight(String right, boolean value);
}
