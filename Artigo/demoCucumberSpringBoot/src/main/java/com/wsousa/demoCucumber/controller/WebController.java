package com.wsousa.demoCucumber.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "WebController", description = "Controller Responsibility search the <WebController> API")
@RestController
@RequestMapping("/hello")
public class WebController {


	@Operation(summary = "Return String Hello world!", description = "Define End Point Search All WebController in Tests", tags = { "WebController" })
	@GetMapping
	public String salutation() {
		return "Hello world!";
	}
}