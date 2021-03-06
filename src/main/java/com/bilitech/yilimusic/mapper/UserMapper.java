package com.bilitech.yilimusic.mapper;

import com.bilitech.yilimusic.dto.UserDto;
import com.bilitech.yilimusic.entity.User;
import com.bilitech.yilimusic.vo.UserVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author JY
 * @create 2022-01-04 1:47
 */
@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    UserDto toDto(User user);

    UserVo toVo(UserDto userDto);

}
