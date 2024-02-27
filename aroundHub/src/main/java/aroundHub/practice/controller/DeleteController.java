package aroundHub.practice.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "DeleteController")
@RestController
@RequestMapping("/api/v1/delete-api")

public class DeleteController {
    @DeleteMapping("/delete/{variable}")
    @Operation(summary = "delete_variable", description = "delete_variable")
    public String deleteVariable (@PathVariable String variable){
        return variable;
    }
}
