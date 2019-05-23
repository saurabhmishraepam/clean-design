package com.epam.patterns.lsp;

import java.util.Set;
import java.util.HashSet;

class GenericUser extends PowerUser {
    private Set<String> protectedRights;

    GenericUser(HashSet<String> protectedRights) {
        this.protectedRights = protectedRights;
    }

    @Override
    void setupAccessRight(String right, boolean value) {
        if (!protectedRights.contains(right)) {
            accessRights.put(right, value);
        }
    }

}
