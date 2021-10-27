package com.wsousa.demoRestAssured.controller;

import com.wsousa.demoRestAssured.domain.Users;
import com.wsousa.demoRestAssured.service.TrackService;
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


@Tag(name = "Track", description = "Controller Responsibility search the <Track> API")
@RestController
@RequestMapping(path = "/api/track")
@CrossOrigin(origins = "*")
public class TrackController {

	@Autowired
	private TrackService trackService;

	@Operation(summary = "Find All Track", description = "Define End Point Search All Track in Register database", tags = { "Track" })
	@GetMapping
	public ResponseEntity<?>  listarTodos() throws URISyntaxException {
		trackService.buscarJson();
		return ResponseEntity.created(new URI("all")).body(new Users());
	}




}
