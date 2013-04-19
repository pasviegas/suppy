package br.org.pav.suppy.web.controller;

import br.org.pav.suppy.test.mock.MockStock;
import br.org.pav.suppy.test.web.controller.AbstractControllerTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TestStockController extends AbstractControllerTest {

    @Test
    public void testStockFindOne() throws Exception {
        mockMvc.perform(get("/stock/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.skus[0].name", is("Dove")));
    }

    @Test
    public void testStockStore() throws Exception {
        mockMvc.perform(post("/stock")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(MockStock.getStock2())))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].skus[0].name", is(MockStock.getStock2().getSKUs().get(0).getName())));
    }

}
