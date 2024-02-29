package practice.springBoot.config;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI(){
        Info info = new Info()
                .title("SpringBoot-Swagger-ui")
                .version("v1.0")
                .description("프로젝트 API 명세");

        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
}
