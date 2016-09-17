package com.repository;

import com.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findById(Long id);
    List<User> findByPhoneNum(String PhoneNum);
    User save(User user);
}
