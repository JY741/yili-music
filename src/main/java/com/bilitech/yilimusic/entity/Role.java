package com.bilitech.yilimusic.entity;

import lombok.Data;

import javax.persistence.Entity;

/**
 * @author JY
 * @create 2022-01-03 17:17
 */
@Entity
@Data
public class Role extends AbstractEntity{
    private String name;

    private String title;
}
