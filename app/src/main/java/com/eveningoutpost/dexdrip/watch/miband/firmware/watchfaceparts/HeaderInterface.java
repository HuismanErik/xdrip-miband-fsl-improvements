package com.eveningoutpost.dexdrip.watch.miband.firmware.watchfaceparts;

import java.io.IOException;
import java.io.InputStream;

public interface HeaderInterface {
    public Header readFrom(InputStream stream) throws IOException;
}
