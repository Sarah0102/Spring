package com.example.validation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

@SpringBootTest
@AutoConfigureMockMvc
class ValidationApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void checkPersonInfoWhenNameMissingNameThenFailure() throws Exception {
        MockHttpServletRequestBuilder createPerson = post("/").param("age","20");
        mockMvc.perform(createPerson).andExpect(model().hasErrors());

    }

    @Test
    public void checkPersonInfoWhenAgeMissingThenFailure() throws Exception {
        MockHttpServletRequestBuilder createPerson = post("/").param("name","tester");
        mockMvc.perform(createPerson).andExpect(model().hasErrors());
    }

    @Test
    public void  checkPersonInfoWhenNameTooShortThenFailure() throws Exception {
        MockHttpServletRequestBuilder createPerson = post("/").
                                                      param("name","S").
                                                      param("age","50");
        mockMvc.perform(createPerson).andExpect(model().hasErrors());
    }

    @Test
    public void checkPersonInfoWithValidaRequestThenSuccess() throws Exception {
        MockHttpServletRequestBuilder createPerson = post("/").
                param("name","Success").
                param("age","50");
        mockMvc.perform(createPerson).andExpect(model().hasNoErrors());
    }

}
