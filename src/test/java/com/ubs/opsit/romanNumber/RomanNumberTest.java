package com.ubs.opsit.romanNumber;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.romanNumber.RomanNumber;

public class RomanNumberTest {
	RomanNumber romanNumberService;
	
	@Before
	public void setup() {
		romanNumberService = new RomanNumber();
	}
	
	@Test
	public void test_RomanNumber_One(){
		String romanNumber = romanNumberService.convert(1);
		assertEquals("I", romanNumber);		
	}
	
	@Test
	public void test_RomanNumber_Five(){
		String romanNumber = romanNumberService.convert(5);
		assertEquals("V", romanNumber);		
	}
	
	@Test
	public void test_RomanNumber_Ten(){
		String romanNumber = romanNumberService.convert(10);
		assertEquals("X", romanNumber);		
	}
	
	@Test
	public void test_RomanNumber_50(){
		String romanNumber = romanNumberService.convert(50);
		assertEquals("L", romanNumber);		
	}
	
	@Test
	public void test_RomanNumber_100(){
		String romanNumber = romanNumberService.convert(100);
		assertEquals("C", romanNumber);		
	}
	
	@Test
	public void test_RomanNumber_500(){
		String romanNumber = romanNumberService.convert(500);
		assertEquals("D", romanNumber);		
	}
	
	@Test
	public void test_RomanNumber_1000(){
		String romanNumber = romanNumberService.convert(1000);
		assertEquals("M", romanNumber);		
	}
	
	@Test
	public void test_RomanNumber_3(){
		String romanNumber = romanNumberService.convert(3);
		assertEquals("III", romanNumber);
	}
	
	@Test
	public void test_RomanNumber_4(){
		String romanNumber = romanNumberService.convert(4);
		assertEquals("IV", romanNumber);
	}
	
	@Test
	public void test_RomanNumber_7(){
		String romanNumber = romanNumberService.convert(7);
		assertEquals("VII", romanNumber);
	}
	
	@Test
	public void test_RomanNumber_13(){
		String romanNumber = romanNumberService.convert(13);
		assertEquals("XIII", romanNumber);
	}
	
	@Test
	public void test_RomanNumber_14(){
		String romanNumber = romanNumberService.convert(14);
		assertEquals("XIV", romanNumber);
	}
	
	@Test
	public void test_RomanNumber_88(){
		String romanNumber = romanNumberService.convert(88);
		assertEquals("LXXXVIII", romanNumber);
	}
	
	
}
