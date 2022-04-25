package com.fth.smde12;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fth.smde12.entity.Product;
import com.fth.smde12.repository.ProductRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SmdE12ApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductRepository productRepository;

    @Test
    @DisplayName("""
            unauthorized request should return 401
            """

    )
    void getAllProductsUnauthorizedTest() throws Exception {
        mockMvc.perform(get("/api/product"))
                .andExpect(status().isUnauthorized());
    }

    @Test
    @DisplayName("""
            authorized request should return 200
            """
    )
    @WithMockUser
    void getAllProductsAuthorizedTest() throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        var p1 = new Product();
        p1.setId(1);
        p1.setName("test-product");
        p1.setPrice(BigDecimal.TEN);

        var result = List.of(p1);

        when(productRepository.findAll()).thenReturn(result);

        mockMvc.perform(get("/api/product"))
                .andExpect(status().isOk())
                .andExpect(content().json(mapper.writeValueAsString(result)));
    }


}
