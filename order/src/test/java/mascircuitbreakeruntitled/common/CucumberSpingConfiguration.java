package mascircuitbreakeruntitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mascircuitbreakeruntitled.OrderApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderApplication.class })
public class CucumberSpingConfiguration {}
