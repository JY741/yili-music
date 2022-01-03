package com.bilitech.yilimusic.vo;

import lombok.Data;

import java.util.List;

/**
 * @author JY
 * @create 2022-01-03 17:48
 */
@Data
public class UserVo {
    private String id;

    private String username;

    private String nickname;

    private List<RoleVo> roles;
}
