package com.wsousa.demoRestAssured.controller;

import com.wsousa.demoRestAssured.domain.Users;
import com.wsousa.demoRestAssured.service.QuestionTrackService;
import com.wsousa.demoRestAssured.service.TrackService;
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


@Tag(name = "QuestionTrack", description = "Controller Responsibility search the <questionTrack> API")
@RestController
@RequestMapping(path = "/api/questionTrack")
@CrossOrigin(origins = "*")
public class QuestionTrackController {

	@Autowired
	private QuestionTrackService questionTrackService;

	@Operation(summary = "Find All questionTrack", description = "Define End Point Search All questionTrack in Register database", tags = { "QuestionTrack" })
	@GetMapping
	public ResponseEntity<?>  listarTodos() throws URISyntaxException {
		questionTrackService.buscarJson();
		return ResponseEntity.created(new URI("all")).body(new Users());
	}




}
