package com.wsousa.demoRestAssured.controller;

import com.wsousa.demoRestAssured.domain.Strategy;
import com.wsousa.demoRestAssured.domain.Users;
import com.wsousa.demoRestAssured.service.StrategyService;
import com.wsousa.demoRestAssured.service.UsersService;
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


@Tag(name = "users", description = "Controller Responsibility search the <Strategy> API")
@RestController
@RequestMapping(path = "/api/users")
@CrossOrigin(origins = "*")
public class UsersController {

	@Autowired
	private UsersService usersService;

	@Operation(summary = "Find All Strategy", description = "Define End Point Search All Strategy in Register database", tags = { "users" })
	@GetMapping
	public ResponseEntity<?>  listarTodos() throws URISyntaxException {
		usersService.buscarJson();
		return ResponseEntity.created(new URI("all")).body(new Users());
	}




}
