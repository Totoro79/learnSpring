package com.learn.learnSpring;

import com.learn.learnSpring.web.HealthCheckController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ConditionalOnWebApplicationTest {

    @Autowired(required = false)
    private HealthCheckController module;

    @Test
    void moduleIsLoaded(){
        System.out.println(module.healthCheck());
        assertThat(module).isNotNull();
    }

}
