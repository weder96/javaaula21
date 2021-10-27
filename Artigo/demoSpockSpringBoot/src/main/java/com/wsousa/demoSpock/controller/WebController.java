package com.wsousa.demoSpock.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "WebController", description = "Controller Responsibility search the <Project> API")
@RestController
@RequestMapping("/hello")
public class WebController {

	@Operation(summary = "Find All Projects", description = "Define End Point Search All projects in Register database", tags = { "WebController" })
	@GetMapping
	public String salutation() {
		return "Hello world!";
	}
}