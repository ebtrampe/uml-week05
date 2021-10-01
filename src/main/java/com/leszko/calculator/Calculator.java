package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
* Some javadoc
@author Ei
@version 1
*/
@Service
public class Calculator {
        final static int umlNUMBER1 = 3;
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}
}
