//package com.flightplaning;
//
//import com.flightplaning.controller.FlightPlanController;
//import com.flightplaning.exception.FlightPlaningExceptionHandler;
//import com.flightplaning.model.FlightPlanRequest;
//import com.flightplaning.repository.FlightPlanRepository;
//import com.flightplaning.service.impl.FlightPlanServiceImpl;
//import com.google.gson.Gson;
//import lombok.extern.slf4j.Slf4j;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.boot.test.mock.mockito.MockBeans;
//import org.springframework.context.annotation.Import;
//import org.springframework.http.MediaType;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//
//import java.time.LocalDateTime;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.springframework.http.RequestEntity.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
//@ExtendWith(SpringExtension.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@EnableWebMvc
//@AutoConfigureMockMvc
//@ActiveProfiles("dev")
//@Import({FlightPlaningExceptionHandler.class})
//class FlightPlaningApplicationTests {
//    @Autowired
//    private MockMvc mockMvc;
//    String applicationUrl = "/api/flightPlans";
//
//    @Autowired
//    private FlightPlanController flightPlanController;
//    @MockBean
//    FlightPlanRepository flightPlanRepository;
//    @MockBean
//    FlightPlanServiceImpl flightPlanService;
//    @Test
//    void contextLoads() throws Exception {
//        assertThat(flightPlanController).isNotNull();
//    }
//
//
////    @BeforeAll
////    static void setUp(@Autowired FlightPlanRepository repository) {
//////        log.info("setUp");
////        repository.deleteAll();
//////        log.info("insert dummy data");
////    }
//
//    @Test
//    public void shouldLogApiLogTable() throws Exception {
////        Assertions.assertEquals(0,apiLogRepository.count());
//        Gson gson = new Gson();
//        FlightPlanRequest request=new FlightPlanRequest();
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/flightPlans")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(gson.toJson(request)))
//                .andDo(print()).andExpect(status().isInternalServerError());
//
////        Assertions.assertEquals(1,apiLogRepository.count());
//    }
//
//    @Test
//    public void chargePostRequestCheck() throws Exception {
//        Gson gson = new Gson();
//        FlightPlanRequest request=new FlightPlanRequest();
//
//        this.mockMvc
//                .perform(MockMvcRequestBuilders.post("/api/flightPlans")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(gson.toJson(request)))
//                .andDo(print()).andExpect(status().isInternalServerError());
//    }
//
//    public static  FlightPlanRequest createFlightPlanRequest(){
//        FlightPlanRequest request=new FlightPlanRequest();
//        request.setArrivalDate(LocalDateTime.of(2022, 5, 15, 10, 00) );
//        request.setArrivalDate(LocalDateTime.of(2022, 5, 15, 22, 34) );
//        request.setPlaneName("THY");
//        request.setArrivalAirportCode("01A");
//        request.setDepartureAirportCode("01B");
////        flightPlanRequest=request;
//        request.setDepartureAirportCode(null);
//        return request;
//    }
//
//}
