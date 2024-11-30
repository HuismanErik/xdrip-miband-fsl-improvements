package com.eveningoutpost.dexdrip.watch.miband.firmware.watchfaceparts.configpojo;

import com.google.gson.annotations.SerializedName;

public class SimpleText {
    @SerializedName("text_settings")
    public TextSettings textSettings = new TextSettings();

    public Position position = new Position();

    @SerializedName("text_pattern")
    public String textPattern = "$value $unit at $time";
}
