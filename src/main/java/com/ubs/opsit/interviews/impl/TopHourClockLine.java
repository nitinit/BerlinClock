package com.ubs.opsit.interviews.impl;

/**
*
*Handles Top first line of hours representation of Berlin Clock
*/
public class TopHourClockLine extends AbstractBerlinClockLine {

	public static String getVal(int hours) {
		return lineString(hours / 5, 4, "R");
	}
}
