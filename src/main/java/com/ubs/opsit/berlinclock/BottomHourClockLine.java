package com.ubs.opsit.berlinclock;

/**
*
*Handles Top second line of hours representation of Berlin Clock
*/
public class BottomHourClockLine extends AbstractBerlinClockLine {
	
	public static String getVal(int hours) {
		return lineString(hours % 5, 4, "R");
	}
}