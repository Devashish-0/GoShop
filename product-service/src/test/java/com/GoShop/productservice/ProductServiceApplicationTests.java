package com.GoShop.productservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}


///////////////////////////////////////////////

//
//package com.GoShop.productservice;
//
//import com.GoShop.productservice.dto.ProductRequest;
//import com.GoShop.productservice.repository.ProductRepository;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.testcontainers.containers.MongoDBContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//import org.testcontainers.utility.DockerImageName;
//
//import java.math.BigDecimal;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@Testcontainers
//@AutoConfigureMockMvc
//class ProductServiceApplicationTests {
//	@Container
//    static MongoDBContainer mongoDBContainer = new MongoDBContainer(DockerImageName.parse("mongo:4.0.10"));
//    @Autowired
//	private MockMvc mockMvc;
//	@Autowired
//	private ObjectMapper objectMapper;
//	@Autowired
//	private ProductRepository productRepository;
//	@DynamicPropertySource
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
//		dynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
//	}
//
//	@Test
//	void shouldCreateProduct() throws Exception {
//		ProductRequest productRequest = getProductRequest();
//		String productRequestString = objectMapper.writeValueAsString(productRequest);
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(productRequestString))
//				.andExpect(status().isCreated());
//		Assertions.assertEquals(1, productRepository.findAll().size());
//	}
//
//	private ProductRequest getProductRequest() {
//		return ProductRequest.builder()
//				.name("Iphone Not Dynamic")
//				.description("Iphone Dynamic")
//				.price(BigDecimal.valueOf(1200))
//				.build();
//	}
//
//}
