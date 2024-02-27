package aroundHub.practice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * swagger url : http://localhost:8080/swagger-ui/index.html
 */
@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .version("v1.0.0")
                .title("SWAGGER TEST")
                .description("SWAGGER TEST");
        return new OpenAPI()
                .info(info);
                /*.addSecurityItem(securityRequirement)
                .components(components);*/
    }

//    @Bean
//    public GroupedOpenApi frontGroup(){
//        return GroupedOpenApi.builder()
//                .group("front")
//                .packagesToExclude("com.toms.app.admin")
//                .build();
//    }
//
//    @Bean
//    public GroupedOpenApi adminGroup(){
//
//        return GroupedOpenApi.builder()
//                .group("admin")
//                .packagesToScan("com.toms.app.admin")
//                .build();
//    }

}