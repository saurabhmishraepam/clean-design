package com.epam.patterns.lsp;

import java.util.*;

class PowerUser {
    Map<String, Boolean> accessRights = new HashMap<>();

    void setupAccessRight(String right, boolean value) {
        accessRights.put(right, value);
    }

    boolean getValueOfAccessRight(String right) {
        return accessRights.getOrDefault(right, false);
    }

}
