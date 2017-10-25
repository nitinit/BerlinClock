package com.ubs.opsit.berlinclock;

/**
*
*Handles bottom second line of minutes representation of Berlin Clock
*/
public class BottomMinuteClockLine extends AbstractBerlinClockLine {

	public static String getVal(int minutes) {
		return lineString(minutes % 5, 4, "Y");
	}
}