package com.ubs.opsit.interviews.impl;

/**
*
*Handles bottom first line of minutes representation of Berlin Clock
*/
public class TopMinuteClockLine extends AbstractBerlinClockLine {
	
	public static String getVal(int minutes) {
		return 	lineString(minutes / 5, 11, "Y").replaceAll("YYY", "YYR");
	}
}