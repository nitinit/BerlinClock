package com.ubs.opsit.interviews.impl;

import static com.ubs.opsit.interviews.impl.ClockExceptionConstants.INVALID_TIME_ERROR;

import java.util.Arrays;
import java.util.stream.Stream;

import com.ubs.opsit.berlinclock.BottomHourClockLine;
import com.ubs.opsit.berlinclock.BottomMinuteClockLine;
import com.ubs.opsit.berlinclock.SecondClockLine;
import com.ubs.opsit.berlinclock.TopHourClockLine;
import com.ubs.opsit.berlinclock.TopMinuteClockLine;
import com.ubs.opsit.interviews.TimeConverter;

public class BerlinClockTimeConverterImpl implements TimeConverter {

	@Override
	public String convertTime(String time) {
		int[] times = Stream.of(time.split(":")).mapToInt(Integer::parseInt).toArray();
		
		if(times.length != 3) throw new IllegalArgumentException(INVALID_TIME_ERROR);

		return processTime(times[0], times[1], times[2]);
	}

	private void validate(int hours, int minutes, int seconds) {
		if (hours < 0 || hours > 24) throw new IllegalArgumentException("Hours out of bounds.");
        if (minutes < 0 || minutes > 59) throw new IllegalArgumentException("Minutes out of bounds.");
        if (seconds < 0 || seconds > 59) throw new IllegalArgumentException("Seconds out of bounds.");
	}
	
    /**
     * Convert individual hours, minutes and seconds into a BerlinTime object.
     *
     * @param hours - an int representing Hours
     * @param minutes - an int representing Minutes
     * @param seconds - an int representing Seconds
     *
     * @return BerlinTime object created using the parameters.
     */
    private String processTime(int hours, int minutes, int seconds) {
    	
    	validate(hours, minutes, seconds);
    	
        return String.join(System.getProperty("line.separator"), Arrays.asList(
        		SecondClockLine.getVal(seconds),
        		TopHourClockLine.getVal(hours),
        		BottomHourClockLine.getVal(hours),
        		TopMinuteClockLine.getVal(minutes),
        		BottomMinuteClockLine.getVal(minutes))
        		);
    }
}
