package practice.springBoot.main.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Schema(title ="MainResDto")
public class MainResDto {

    private int seq; // 넘버
    private String userId; // 아이디
    private String userName; // 이름
    private String userDate; // 등록날짜

}