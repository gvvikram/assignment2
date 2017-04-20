package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.main.PalindromeWord;

public class PalindromeWordTest {
	PalindromeWord sp=null;
	@Before
	public void setUp() throws Exception {
		sp=new PalindromeWord();
	}

	@Test
	public void PalindTest() {
		assertEquals(false,PalindromeWord.isPalindrome("ramajhbjgj"));
		assertEquals(true,PalindromeWord.isPalindrome("madam"));
		assertTrue("yes this is plyndrome",PalindromeWord.isPalindrome("madam"));
		assertFalse("You not Entered String",PalindromeWord.isPalindrome("ramajhbjgj"));
		
	}

}
