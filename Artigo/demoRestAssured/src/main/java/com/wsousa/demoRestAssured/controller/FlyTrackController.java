package com.wsousa.demoRestAssured.controller;

import java.net.URI;
import java.net.URISyntaxException;

import com.wsousa.demoRestAssured.domain.Users;
import com.wsousa.demoRestAssured.service.FlyTrackService;
import com.wsousa.demoRestAssured.service.QuestionTrackService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "FlyTrack", description = "Controller Responsibility search the <FlyTrack> API")
@RestController
@RequestMapping(path = "/api/flyTrack")
@CrossOrigin(origins = "*")
public class FlyTrackController {

	@Autowired
	private FlyTrackService flyTrackService;

	@Operation(summary = "Find All flyTrack", description = "Define End Point Search All questionTrack in Register database", tags = { "FlyTrack" })
	@GetMapping
	public ResponseEntity<?>  listarTodos() throws URISyntaxException {
		flyTrackService.buscarJson();
		return ResponseEntity.created(new URI("all")).body(new Users());
	}




}
