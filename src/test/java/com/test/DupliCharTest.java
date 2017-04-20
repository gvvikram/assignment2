package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.main.DupliChar;

public class DupliCharTest {

	DupliChar us = null;

	@Before
	public void setup() {
		us = new DupliChar();
	}

	@Test
	public void Duplichar_NullTest() {
		String Result = DupliChar.doUniq(null);
		assertEquals("Please enter your String", Result);

	}

	@Test
	public void DuplicharTest() {
		String Result = DupliChar.doUniq("varma");
		assertEquals("varm", Result);

	}

}
