package com.owen1212055.biomevisuals.parsers.booleans.impl;

import com.google.gson.JsonObject;
import com.owen1212055.biomevisuals.parsers.booleans.BooleanProvider;

public class StaticBooleanProvider implements BooleanProvider {

    @Override
    public String getKey() {
        return "static";
    }

    @Override
    public boolean parse(JsonObject object) {
        return object.get("value").getAsBoolean();
    }
}
