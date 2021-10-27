package com.wsousa.demoRestAssured;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.wsousa.demoRestAssured.domain.Project;
import com.wsousa.demoRestAssured.repository.ProjectRepository;
import com.wsousa.demoRestAssured.service.ProjectService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import util.TestUtil;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ContextConfiguration
public class ProjectControllerTest {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	// bind the above RANDOM_PORT
	@LocalServerPort
	private int port;

	@Autowired
	WebApplicationContext webApplicationContext;

	@Autowired
	ProjectService projectService;

	@Mock
	private ProjectRepository projectRepository;

	private MockMvc mockMvc;

	@BeforeEach
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
		RestAssuredMockMvc.mockMvc(this.mockMvc);
	}


	@AfterEach
	public void finish() {

	}

	@DisplayName("Test Spring @Autowired Integration")
	@Test
	@Order(1)
	void testGet() {
		long id = Long.valueOf(1L);
		assertEquals(id, projectService.listarTodos().get(0).getId().longValue());
	}


	@DisplayName("Test Return de Project Id")
	@Test
	@Order(2)
	void testGetById() {
		projectService.listarTodos().forEach(item ->{
			LOG.info("find:"+item.getNome());
		});

		try {
			MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/api/projects"))
				.andExpect(status().is2xxSuccessful())
				.andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8))
				.andDo(print())
				.andReturn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@DisplayName("Test Return findProjectByExist")
	@Test
	@Order(3)
	public void findProjectByExist(){
		try {

			List<Project> lista = new ArrayList<>(Arrays.asList(given()
				.when()
				.port(port)
				.get("/api/projects")
				.then()
				.extract()
				.response()
				.body()
				.as(Project[].class)));

			lista.forEach(item->{
				LOG.info(""+item.getId());
				LOG.info(""+item.getNome());
			});

			assertEquals(lista.size(), 2);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@DisplayName("Test Return findProjectByExistGivenRestAssured")
	@Test
	@Order(4)
	public void findProjectByExistGivenRestAssured() {
		given()
			.when()
			.port(port)
			.get("/api/projects/1")
			.then()
			.statusCode(200)
			.body("data.id", is(1))
			.assertThat()
			.body(matchesJsonSchemaInClasspath("get.json"));
	}

}
