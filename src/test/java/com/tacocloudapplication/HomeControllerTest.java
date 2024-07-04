package com.tacocloudapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(HomeController.class)//WebTest for HomeController
public class HomeControllerTest {
    @Autowired
    private MockMvc mockMvc;//Injects MockMvc

    public void testHomePage() throws Exception {
        mockMvc.perform(get("/")) //performs GET http Request
                .andExpect(status().isOk()) //expects HTTP 200
                .andExpect(view().name("home")) //expects home view
                .andExpect((ResultMatcher) content().string( //expects Welcome Too ... string
                        containsString("Welcome to...")));
    }
}

