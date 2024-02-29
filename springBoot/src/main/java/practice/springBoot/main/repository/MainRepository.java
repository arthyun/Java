package practice.springBoot.main.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import practice.springBoot.main.dto.MainResDto;

import java.util.List;

@Mapper
@Repository("MainRepository")
public interface MainRepository {

    List<MainResDto> getUserInfo();

}
