package com.bilitech.yilimusic.repository;

import com.bilitech.yilimusic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author JY
 * @create 2022-01-03 16:38
 */
public interface UserRepository extends JpaRepository<User,String> {
}
