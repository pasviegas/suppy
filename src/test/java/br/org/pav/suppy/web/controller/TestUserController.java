package br.org.pav.suppy.web.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.http.MediaType;

import br.org.pav.suppy.test.mock.MockUser;
import br.org.pav.suppy.test.web.controller.AbstractControllerTest;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestUserController extends AbstractControllerTest {
	
	@Test
	public void testUserFindOne() throws Exception{
		mockMvc.perform(get("/user/1"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.name", is("Pedro")));
	}
	
	@Test
	public void testUserFindAll() throws Exception{
		mockMvc.perform(get("/user/all"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$[0].name", is("Pedro")));
	}
	
	@Test
	public void testUserStore() throws Exception{
		mockMvc.perform(post("/user")
				.contentType(MediaType.APPLICATION_JSON)
				.content(new ObjectMapper().writeValueAsString(MockUser.getUser2())))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$[0].name", is(MockUser.getUser1().getName())));
	}

}
