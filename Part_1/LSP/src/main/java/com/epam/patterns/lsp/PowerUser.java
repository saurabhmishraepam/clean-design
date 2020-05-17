package com.epam.patterns.lsp;

class PowerUser extends User{
    @Override
    void setupAccessRight(String right, boolean value){
        this.accessRights.put(right, value);
    }
}
