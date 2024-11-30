package com.eveningoutpost.dexdrip.watch.miband.firmware.watchfaceparts.configpojo;

import com.google.gson.annotations.SerializedName;

public class ValueTimeText extends SimpleText{
    @SerializedName("outdated_text_pattern")
    public String outdatedTextPattern = "$value $unit ago";
}
