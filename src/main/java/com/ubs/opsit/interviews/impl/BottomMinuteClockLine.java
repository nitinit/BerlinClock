package com.ubs.opsit.interviews.impl;

/**
*
*Handles bottom second line of minutes representation of Berlin Clock
*/
public class BottomMinuteClockLine extends AbstractBerlinClockLine {

	public static String getVal(int minutes) {
		return lineString(minutes % 5, 4, "Y");
	}
}
