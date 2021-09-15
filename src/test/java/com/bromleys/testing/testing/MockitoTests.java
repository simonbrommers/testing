package com.bromleys.testing.testing;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(TestController.class)
public class MockitoTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private IService service;

	@Test
	public void greetingShouldReturnMessageFromService() throws Exception {
		when(service.add(3,6)).thenReturn(9);
		this.mockMvc.perform(get("/test/add/3/6")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("9")));
	}
}