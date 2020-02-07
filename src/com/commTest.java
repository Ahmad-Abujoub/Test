package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class commTest {

	@Test
	void test() {
		comm t=new comm();
		int result=t.add(4, 9);
		assertEquals(13,result);
	}

}
