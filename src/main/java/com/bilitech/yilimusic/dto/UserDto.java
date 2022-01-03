package com.bilitech.yilimusic.dto;

import com.bilitech.yilimusic.vo.RoleVo;
import lombok.Data;

import java.util.List;

/**
 * @author JY
 * @create 2022-01-03 17:50
 */
@Data
public class UserDto {
    private String id;

    private String username;

    private String nickname;

    private List<RoleVo> roles;
}
