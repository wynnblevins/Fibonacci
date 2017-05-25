package com.dominionconsulting.service;

import java.util.List;

public class FibonnaciService implements SequenceService {

	@Override
	public Integer runToN(Integer n) {		
		if (n == 1 || n == 0) {
			return n;
		}
		
		return runToN(n - 1) + runToN(n - 2);
	}
}
