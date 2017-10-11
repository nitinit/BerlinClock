package com.ubs.opsit.interviews.impl;

/**
 *
 *Handles Seconds representation of Berlin Clock
 */
public class SecondClockLine {
	
	public static String getVal(int seconds) {
		return 	(seconds % 2 == 0) ? "Y" : "O";
	}
}