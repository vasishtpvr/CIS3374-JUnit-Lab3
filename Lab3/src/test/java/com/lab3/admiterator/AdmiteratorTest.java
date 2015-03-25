package com.lab3.admiterator;
import junitparams.JUnitParamsRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(JUnitParamsRunner.class)
public class AdmiteratorTest {
	@Test
	@parameters(method=admitTest())
	
	public void admitTest(int speed, int accuracy){
		
		
		
		
	}
	private Object admit(){
		return new Object[][]{{},{}};
		
		
	}
	
		
}
