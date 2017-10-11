package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Test;

import com.ubs.opsit.berlinclock.BottomHourClockLine;
import com.ubs.opsit.berlinclock.BottomMinuteClockLine;
import com.ubs.opsit.berlinclock.SecondClockLine;
import com.ubs.opsit.berlinclock.TopHourClockLine;
import com.ubs.opsit.berlinclock.TopMinuteClockLine;

/**
 * Unit Test Coverage of representation of Seconds, Top Hour, Bottom Hour, Top Minute, Bottom Minute in Berlin Clock.
 *
 */
public class BerlinClockTest {
	 
     
    // Yellow lamp should blink on/off every two seconds
    @Test
    public void testYellowLampShouldBlinkOnOffEveryTwoSeconds() {
        Assert.assertEquals("Y", SecondClockLine.getVal(0));
        Assert.assertEquals("O", SecondClockLine.getVal(1));
        Assert.assertEquals("O", SecondClockLine.getVal(59));
    }
 
    // Top hours should have 4 lamps
    @Test
    public void testTopHoursShouldHave4Lamps() {
        Assert.assertEquals(4, TopHourClockLine.getVal(7).length());
    }
 
    // Top hours should light a red lamp for every 5 hours
    @Test
    public void testTopHoursShouldLightRedLampForEvery5Hours() {
        Assert.assertEquals("OOOO", TopHourClockLine.getVal(0));
        Assert.assertEquals("RROO", TopHourClockLine.getVal(13));
        Assert.assertEquals("RRRR", TopHourClockLine.getVal(23));
        Assert.assertEquals("RRRR", TopHourClockLine.getVal(24));
    }
 
    // Bottom hours should have 4 lamps
    @Test
    public void testBottomHoursShouldHave4Lamps() {
        Assert.assertEquals(4, BottomHourClockLine.getVal(5).length());
    }
 
    // Bottom hours should light a red lamp for every hour left from top hours
    @Test
    public void testBottomHoursShouldLightRedLampForEveryHourLeftFromTopHours() {
        Assert.assertEquals("OOOO", BottomHourClockLine.getVal(0));
        Assert.assertEquals("RRRO", BottomHourClockLine.getVal(13));
        Assert.assertEquals("RRRO", BottomHourClockLine.getVal(23));
        Assert.assertEquals("RRRR", BottomHourClockLine.getVal(24));
    }
 
    // Top minutes should have 11 lamps
    @Test
    public void testTopMinutesShouldHave11Lamps() {
        Assert.assertEquals(11, TopMinuteClockLine.getVal(34).length());
    }
 
    // Top minutes should have 3rd, 6th and 9th lamps in red to indicate first quarter, half and last quarter
    @Test
    public void testTopMinutesShouldHave3rd6thAnd9thLampsInRedToIndicateFirstQuarterHalfAndLastQuarter() {
        String minutes32 = TopMinuteClockLine.getVal(32);
        Assert.assertEquals("R", minutes32.substring(2, 3));
        Assert.assertEquals("R", minutes32.substring(5, 6));
        Assert.assertEquals("O", minutes32.substring(8, 9));
    }
 
    // Top minutes should light a yellow lamp for every 5 minutes unless it's first quarter, half or last quarter
    @Test
    public void testTopMinutesShouldLightYellowLampForEvery5MinutesUnlessItIsFirstQuarterHalfOrLastQuarter() {
        Assert.assertEquals("OOOOOOOOOOO", TopMinuteClockLine.getVal(0));
        Assert.assertEquals("YYROOOOOOOO", TopMinuteClockLine.getVal(17));
        Assert.assertEquals("YYRYYRYYRYY", TopMinuteClockLine.getVal(59));
    }
 
    // Bottom minutes should have 4 lamps
    @Test
    public void testBottomMinutesShouldHave4Lamps() {
        Assert.assertEquals(4, BottomMinuteClockLine.getVal(0).length());
    }
 
    // Bottom minutes should light a yellow lamp for every minute left from top minutes
    @Test
    public void testBottomMinutesShouldLightYellowLampForEveryMinuteLeftFromTopMinutes() {
        Assert.assertEquals("OOOO", BottomMinuteClockLine.getVal(0));
        Assert.assertEquals("YYOO", BottomMinuteClockLine.getVal(17));
        Assert.assertEquals("YYYY", BottomMinuteClockLine.getVal(59));
    } 
}