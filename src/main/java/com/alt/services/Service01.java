package com.alt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alt.repositories.Repository01;

@Service
public class Service01 {
	
	@Autowired
	private Repository01 repository01;
	
	public int methodToBeTested() {
		return factorial(repository01.getMyNumber());
	}
	
	public int factorial(int n) {
		if (n == 0) return 1;
		return n * factorial(n - 1);
	}
}
