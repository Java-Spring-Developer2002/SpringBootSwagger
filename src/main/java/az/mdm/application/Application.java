package az.mdm.application;

import az.mdm.configuration.SwaggerConfig;
import az.mdm.controller.SwaggerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({SwaggerController.class,SwaggerConfig.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
