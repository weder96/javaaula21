package com.wsousa.demoRestAssured.controller;

import com.wsousa.demoRestAssured.domain.Question;
import com.wsousa.demoRestAssured.domain.Strategy;
import com.wsousa.demoRestAssured.service.QuestionService;
import com.wsousa.demoRestAssured.service.StrategyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;


@Tag(name = "Question", description = "Controller Responsibility search the <Strategy> API")
@RestController
@RequestMapping(path = "/api/question")
@CrossOrigin(origins = "*")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@Operation(summary = "Find All Question", description = "Define End Point Search All Strategy in Register database", tags = { "Question" })
	@GetMapping
	public ResponseEntity<?>  listarTodos() throws URISyntaxException {
		questionService.buscarJson();
		return ResponseEntity.created(new URI("all")).body(new Question());
	}




}
