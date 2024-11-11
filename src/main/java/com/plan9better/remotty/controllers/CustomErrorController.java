package com.plan9better.remotty.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plan9better.remotty.models.CustomError;

@RestController
public class CustomErrorController implements ErrorController {

	private static final String template = "<- number of fuck ups\nIs this the right endpoint?";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/error")
	public CustomError customError() {
		return new CustomError(counter.incrementAndGet(), String.format(template));
	}
}