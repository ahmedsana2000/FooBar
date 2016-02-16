
package com.foobar;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Sana Ahmed
 *
 */
public class FooBarTest {

	/**
	 * Test method for {@link com.foobar.FooBar#calculateFooBar()}.
	 */
	@Test
	
	public void testCalculateFooBar() {
		
		FooBar fooBar = new FooBar();

		//Pass
		assertEquals ("foo",fooBar.calculateFooBar(3));
		
		//Pass
		assertEquals ("bar",fooBar.calculateFooBar(5));
		
		//Fail
		assertEquals ("foobar",fooBar.calculateFooBar(15));
		
		
	}

}
