package demoapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;


import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.*;



@SpringBootTest
@AutoConfigureMockMvc
public class NumeroParControllerTest {


    @Autowired
    private MockMvc mockMvc;


    @Test
    public void returnNumeroParesSi() throws Exception {
        this.mockMvc.perform(post("/esPar").param("numero", "6")).andExpect(status().isOk())
                .andExpect(content().string(allOf(containsString("6"), containsString("yes"))));
    }

    @Test
    public void postreturnNumeroImparesSi() throws Exception {
        this.mockMvc.perform(post("/esPar").param("numero", "3")).andExpect(status().isOk())
                .andExpect(content().string(allOf(containsString("3"), containsString("no"))));
    }
}

