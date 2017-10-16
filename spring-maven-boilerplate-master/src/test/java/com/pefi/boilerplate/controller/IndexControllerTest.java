package com.pefi.boilerplate.controller;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:controller-test-config.xml"})
@WebAppConfiguration
public class IndexControllerTest extends TestCase {

    private MockMvc mock;


    @Autowired
    private WebApplicationContext context;

    @Before
    public void setUp() throws Exception {
        mock = MockMvcBuilders.webAppContextSetup(context).build();

    }

    @Test
    public void test() throws Exception{
        mock.perform(get("/")).andExpect(status().isOk());
    }
}
