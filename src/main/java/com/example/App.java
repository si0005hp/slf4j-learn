package com.example;

import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	
	static Logger LOG_FILE = LoggerFactory.getLogger("LOG_FILE");
	static Logger LOG_CONSOLE = LoggerFactory.getLogger("LOG_CONSOLE");
	
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 100).boxed().forEach(i -> {
			LOG_FILE.info("Line no {}", i);
			LOG_CONSOLE.info("Line no {}", i);
		});
	}
}
