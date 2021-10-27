package com.wsousa.demoRestAssured.controller;

import com.wsousa.demoRestAssured.domain.Strategy;
import com.wsousa.demoRestAssured.service.StrategyService;
import com.wsousa.demoRestAssured.service.VideoBookService;
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


@Tag(name = "VideoBook", description = "Controller Responsibility search the <VideoBook> API")
@RestController
@RequestMapping(path = "/api/videoBook")
@CrossOrigin(origins = "*")
public class VideoBookController {

	@Autowired
	private VideoBookService videoBookService;

	@Operation(summary = "Find All VideoBook", description = "Define End Point Search All Strategy in Register database", tags = { "VideoBook" })
	@GetMapping
	public ResponseEntity<?>  listarTodos() throws URISyntaxException {
		videoBookService.buscarJson();
		return ResponseEntity.created(new URI("all")).body(new Strategy());
	}




}
