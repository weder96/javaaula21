package com.wsousa.demoRestAssured.controller;

import java.net.URISyntaxException;

import java.util.ArrayList;
import java.util.List;


import com.wsousa.demoRestAssured.domain.Project;
import com.wsousa.demoRestAssured.response.Response;
import com.wsousa.demoRestAssured.service.ProjectService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.Optional;

import javax.validation.Valid;



@Tag(name = "Project", description = "Controller Responsibility search the <Project> API")
@RestController
@RequestMapping(path = "/api/projects")
@CrossOrigin(origins = "*")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@Operation(summary = "Find All Projects", description = "Define End Point Search All projects in Register database", tags = { "Project" })
	@GetMapping
	public ResponseEntity<?>  listarTodos() throws URISyntaxException {
		List<Project> cliResources = projectService.listarTodos();
		return ResponseEntity.created(new URI("all")).body(cliResources);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<Project>> listarPorId(@PathVariable(name = "id") Long id) {
		return ResponseEntity.ok(new Response<Project>(this.projectService.listarPorId(id)));
	}

	@GetMapping(path = "/all")
	public List<Project> listarPorIdAsc() {
		return this.projectService.findByIDAsc();
	}

	@GetMapping(path = "/contract")
	public List<Project> listarPorManyToOne() {
		return this.projectService.listarPorManyToOne();
	}

	@GetMapping(path = "/native")
	public List<Project> listProjectPorManyToOneNativeQuery() {
		return this.projectService.listProjectPorManyToOneNativeQuery();
	}

	@GetMapping(path = "/native/{id}")
	public List<Project> listProjectPorManyToOneNativeQuery(@PathVariable(name = "id") Long id) {
		return this.projectService.listProjectPorManyToOneNativeQuery(id);
	}

	@GetMapping(path = "/nativeParam/{id}")
	public List<Project> listProjectPorManyToOneNativeQueryForIdParam(@PathVariable(name = "id") Long id) {
		return this.projectService.listProjectPorManyToOneNativeQueryForIdParam(id);
	}

	@GetMapping(path = "/nativeParamNome/{nome}")
	public Optional<Project> listProjectPorManyToOneNativeQueryForIdParam(@PathVariable(name = "nome") String nome) {
		return this.projectService.readByClientName(nome);
	}


	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Response<Project>> cadastrar(@Valid @RequestBody Project project, BindingResult result) {
		if (result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Project>(erros));
		}

		return ResponseEntity.ok(new Response<Project>(this.projectService.cadastrar(project)));
	}

	@PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Response<Project>> atualizar(@PathVariable(name = "id") Long id, @Valid @RequestBody Project project, BindingResult result) {
		if (result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Project>(this.projectService.atualizar(project)));
		}

		project.setId(id);
		return ResponseEntity.ok(new Response<Project>(this.projectService.atualizar(project)));
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") Long id) {
		this.projectService.remover(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}

}
