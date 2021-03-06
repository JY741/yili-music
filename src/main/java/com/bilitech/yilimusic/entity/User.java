package com.bilitech.yilimusic.entity;

import com.bilitech.yilimusic.enums.Gender;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author JY
 * @create 2022-01-03 12:44
 */
@Entity
@Data
public class User extends AbstractEntity {

    @Column(unique = true)
    private String username;

    private String nickname;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<Role> roles;

    private String password;

    @Enumerated(EnumType.STRING)//枚举类型默认传索引，添加注释传具体的值
    private Gender gender;

    private Boolean locked;

    private Boolean enabled;

    private String lastLoginIp;

    private Date lastLoginTime;

}
