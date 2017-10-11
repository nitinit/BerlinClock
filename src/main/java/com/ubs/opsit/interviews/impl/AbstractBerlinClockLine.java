package com.ubs.opsit.interviews.impl;

import java.util.Collections;

public class AbstractBerlinClockLine {

    /**
     * Creates a string for each row of the berlin clock.
     * @param litLights
     * @param lightsInRow
     * @param lampType
     * @returnn A string representing a single row of the clock.
     */
    public static String lineString(int litLights, int lightsInRow, String lampType) {

        int unlitLights = lightsInRow - litLights;
        String lit = String.join("", Collections.nCopies(litLights, lampType));
        String unlit = String.join("", Collections.nCopies(unlitLights, "O"));

        return lit + unlit;
    }
}
