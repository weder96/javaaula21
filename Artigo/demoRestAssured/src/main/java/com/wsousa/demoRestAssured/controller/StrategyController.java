package com.wsousa.demoRestAssured.controller;

import com.wsousa.demoRestAssured.domain.Project;
import com.wsousa.demoRestAssured.domain.Strategy;
import com.wsousa.demoRestAssured.response.Response;
import com.wsousa.demoRestAssured.service.ProjectService;
import com.wsousa.demoRestAssured.service.StrategyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Tag(name = "Strategy", description = "Controller Responsibility search the <Strategy> API")
@RestController
@RequestMapping(path = "/api/strategy")
@CrossOrigin(origins = "*")
public class StrategyController {

	@Autowired
	private StrategyService strategyService;

	@Operation(summary = "Find All Strategy", description = "Define End Point Search All Strategy in Register database", tags = { "Strategy" })
	@GetMapping
	public ResponseEntity<?>  listarTodos() throws URISyntaxException {
		strategyService.buscarJson();
		return ResponseEntity.created(new URI("all")).body(new Strategy());
	}




}
