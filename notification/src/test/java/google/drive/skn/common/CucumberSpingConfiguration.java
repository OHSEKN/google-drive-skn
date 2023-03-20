package google.drive.skn.common;

import google.drive.skn.NotificationApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotificationApplication.class })
public class CucumberSpingConfiguration {}
