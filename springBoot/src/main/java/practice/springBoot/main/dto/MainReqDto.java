package practice.springBoot.main.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(title ="MainReqDto")
public class MainReqDto {

    private String userId; // 아이디
    private String userName; // 이름
    private String userDate; // 등록날짜

}
